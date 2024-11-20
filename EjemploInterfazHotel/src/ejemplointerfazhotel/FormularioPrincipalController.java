package ejemplointerfazhotel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author stx
 */
public class FormularioPrincipalController implements Initializable {

    @FXML
    private Button btnReserva;

    @FXML
    private Button btnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnReserva.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                try {
                    handleBtnReserva(t);
                } catch (IOException e) {
                    e.printStackTrace(); // Puedes manejar la excepción de otra forma si prefieres
                }
            }
        });

        btnSalir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                handleBtnSalir(t);
            }
        });
    }

    private void handleBtnReserva(ActionEvent event) throws IOException {
        // Carga la nueva escena en el mismo Stage
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) btnReserva.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    private void handleBtnSalir(ActionEvent event) {
        // Cierra la aplicación de forma segura
        Platform.exit();
        System.exit(0);
    }
}
