import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class QuadradoController{
    public QuadradoView quadradoView;
    public Stage stage;
    public TextField textFieldLado;
    public TextField textFieldArea;
    public Label labelResultado;
    
    public QuadradoController() {
        this.stage = new Stage();
        this.quadradoView = new QuadradoView();
        this.quadradoView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.quadradoView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(ActionEvent event) {
        try {
            double lado = Double.parseDouble(textFieldLado.getText());
            Quadrado quadrado = new Quadrado(lado);
            this.labelResultado.setText(quadrado.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Não existe área zero");
        }
    }
    
    public void botaoLimparClicado(ActionEvent event) {
        textFieldLado.setText("");
        labelResultado.setText("");
    }    
}
