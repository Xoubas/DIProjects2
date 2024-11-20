package reservasalonjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.layout.Pane;

public class MainMenuController implements Initializable {

    @FXML
    private Menu menuInicio;

    @FXML
    private Menu menuSalones;

    @FXML
    private Pane cardPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Configurar las acciones de los menús
        menuInicio.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                loadFXMLIntoCardPane("InicioPane.fxml");
            }
        });

        menuSalones.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                loadFXMLIntoCardPane("SalonesPane.fxml");
            }
        });

        // Cargar por defecto el panel de inicio
        loadFXMLIntoCardPane("InicioPane.fxml");
    }

    /**
     * Carga un archivo FXML en el cardPane.
     *
     * @param fxmlFile el nombre del archivo FXML a cargar
     */
    private void loadFXMLIntoCardPane(String fxmlFile) {
        try {
            // Cargar el contenido del archivo FXML
            Pane newPane = FXMLLoader.load(getClass().getResource(fxmlFile));

            // Reemplazar el contenido del cardPane
            cardPane.getChildren().clear();
            cardPane.getChildren().add(newPane);
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, "Error al cargar el archivo FXML: " + fxmlFile, ex);
        }
    }
}
