package reservasalonjfx;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author stx
 */
public class SalonFXMLController implements Initializable {

    @FXML
    private TextField nombre;

    @FXML
    private TextField telefono;

    @FXML
    private TextField email;

    @FXML
    private DatePicker date;

    @FXML
    private ComboBox<String> tipo;

    @FXML
    private Spinner<Integer> asistentes;

    @FXML
    private ListView<String> comida;

    @FXML
    private Spinner<Integer> dias;

    @FXML
    private Spinner<Integer> habitaciones;

    @FXML
    private Button reservar;

    // List for ComboBox and ListView
    private final ObservableList<String> listaTipo = FXCollections.observableArrayList(
            "Boda/Comunión/Bautizo", "Cumpleaños", "Reunión de empresa");
    private final ObservableList<String> listaComida = FXCollections.observableArrayList(
            "Menu cerrado", "A la carta", "Lo ponen los clientes", "Por concretar");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize DatePicker
        date.setValue(LocalDate.now());

        // Initialize ComboBox
        tipo.setItems(listaTipo);
        tipo.getSelectionModel().selectFirst();

        // Initialize Spinners
        asistentes.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 200, 1));
        dias.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 14, 1));
        habitaciones.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 50, 1));

        // Initialize ListView
        comida.setItems(listaComida);
        comida.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        comida.getSelectionModel().select(0);

        // Add listeners
        setupComboBoxListener();
        setupButtonListener();
    }

    private void setupComboBoxListener() {
        tipo.setOnAction((ActionEvent event) -> {
            String selectedValue = tipo.getValue();
            System.out.println("Seleccionado: " + selectedValue);
            if (selectedValue.startsWith("Boda")) {
                dias.setDisable(true);
                habitaciones.setDisable(false);
            } else if (selectedValue.startsWith("Reunión")) {
                dias.setDisable(false);
                habitaciones.setDisable(true);
            } else {
                dias.setDisable(false);
                habitaciones.setDisable(false);
            }
        });
    }

    private void setupButtonListener() {
        reservar.setOnAction((ActionEvent event) -> {
            try {
                // Create a new Reserva object
                Reserva reserva = new Reserva(
                        nombre.getText(),
                        Integer.parseInt(telefono.getText()),
                        email.getText(),
                        date.getValue(),
                        tipo.getSelectionModel().getSelectedItem(),
                        asistentes.getValue(),
                        comida.getSelectionModel().getSelectedItem(),
                        dias.getValue(),
                        habitaciones.getValue()
                );
                // Print the reservation details
                System.out.println(reserva);
            } catch (NumberFormatException e) {
                showAlert("Error de entrada", "El teléfono debe ser un número válido.");
            } catch (Exception e) {
                showAlert("Error", "Por favor, completa todos los campos correctamente.");
            }
        });
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
