package ejemplointerfazhotel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class FXMLController implements Initializable {

    @FXML
    private ComboBox<String> comboBox; // Added generic type <String>

    @FXML
    private CheckBox checkSmoke;

    @FXML
    private Text texSmoke;

    // Define a reusable ChangeListener
    private final ChangeListener<Boolean> cl = new ChangeListener<Boolean>() {
        @Override
        public void changed(ObservableValue<? extends Boolean> ov, Boolean oldValue, Boolean newValue) {
            texSmoke.setVisible(checkSmoke.isSelected());  // Use newValue to set visibility based on CheckBox state
        }
    };

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Populate ComboBox items
        comboBox.getItems().addAll("Doble de uso individual", "Doble", "Junior Suite", "Suite");

        // Initially hide the Text
        texSmoke.setVisible(false);

        // Attach the listener to the CheckBox's selectedProperty
        checkSmoke.selectedProperty().addListener(cl);
//        checkSmoke.setOnAction((t) -> {
//            texSmoke.setVisible(checkSmoke.isSelected());
//        });
    }
}
