package tokio;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import tokio.componentes.AppBotones;

public class AppView  {

    public AppBotones appBotones;
    public VBox vBox;
    public TextField textField;

    public  AppView(Stage stage){
        super();
        vBox = new VBox();
        iniciarComponentes();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        Scene scene = new Scene(vBox,400,450);
        stage.setScene(scene);
        stage.setTitle("Calculadora JavafX");
        stage.show();
    }

    public void iniciarComponentes(){

        textField = new TextField();
        textField.setFont(Font.font(20));
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setBackground(Background.fill(Color.LIGHTGRAY));


        appBotones = new AppBotones();
        appBotones.setCursor(Cursor.HAND);
        vBox.getChildren().addAll(textField,appBotones);

    }
}
