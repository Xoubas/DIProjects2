package ejemplointerfazhotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EjemploInterfazHotel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga el archivo FXML de la ventana principal
        Parent root = FXMLLoader.load(getClass().getResource("FormularioPrincipal.fxml"));
        
        // Configura la escena y el título de la ventana
        Scene scene = new Scene(root);
        primaryStage.setTitle("Ejemplo Interfaz Hotel");
        primaryStage.setScene(scene);
        
        // Muestra la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}
