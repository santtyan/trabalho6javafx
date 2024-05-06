import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class QuadradoView extends Application {
    private FXMLLoader loader;
    private URL url;

    public QuadradoView() {
        this.loader = new FXMLLoader();
        try {
            this.url = getClass().getResource("quadrado.fxml");
            if (this.url == null) {
                throw new Exception("Arquivo FXML não encontrado");
            }
            this.loader.setLocation(this.url);
        } catch (Exception e) {
            System.out.println("Erro na carga do FXML: " + e.getMessage());
        }
    }

    public void setController(QuadradoController controller) {
        this.loader.setController(controller);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = loader.<Pane>load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
