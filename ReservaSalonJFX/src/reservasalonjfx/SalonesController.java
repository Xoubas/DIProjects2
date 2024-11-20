/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package reservasalonjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author stx
 */
public class SalonesController implements Initializable {

    @FXML
    Button salonButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        salonButton.setOnAction(event -> showReservaDialog());
    }

    private void showReservaDialog() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SalonFXML.fxml"));
        try {
            Pane salonDialog = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Detalle del Salón");
            dialogStage.initModality(Modality.APPLICATION_MODAL);

            dialogStage.setScene(new Scene(salonDialog));
            dialogStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(SalonesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
