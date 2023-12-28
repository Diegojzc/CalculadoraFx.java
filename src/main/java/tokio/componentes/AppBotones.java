package tokio.componentes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import org.xml.sax.helpers.LocatorImpl;

public class AppBotones extends GridPane {

    public Button bt1;
    public Button bt2;
    public Button bt3;
    public Button bt4;
    public Button bt5;
    public Button bt6;
    public Button bt7;
    public Button bt8;
    public Button bt9;
    public Button bt0;
    public Button btsuma;
    public Button btresta;
    public Button btmult;
    public Button btdiv;
    public Button btpunto;
    public Button btigual;
    public Button limpiar;





    public AppBotones() {
        super();

        iniciarComponentes();

    }

    public void iniciarComponentes() {

        bt1 = new Button("1");
        bt1.setFont(Font.font(25));
        bt1.setTextFill(Color.BLACK);
        bt1.setUserData("1");
        bt1.setBackground(Background.fill(Color.STEELBLUE));

        bt2 = new Button("2");
        bt2.setUserData("2");
        bt2.setFont(Font.font(25));
        bt2.setTextFill(Color.BLACK);
        bt2.setBackground(Background.fill(Color.STEELBLUE));

        bt3 = new Button("3");
        bt3.setUserData("3");
        bt3.setFont(Font.font(25));
        bt3.setTextFill(Color.BLACK);
        bt3.setBackground(Background.fill(Color.STEELBLUE));

        bt4 = new Button("4");
        bt4.setUserData("4");
        bt4.setFont(Font.font(25));
        bt4.setTextFill(Color.BLACK);
        bt4.setBackground(Background.fill(Color.STEELBLUE));

        bt5 = new Button("5");
        bt5.setUserData("5");
        bt5.setFont(Font.font(25));
        bt5.setTextFill(Color.BLACK);
        bt5.setBackground(Background.fill(Color.STEELBLUE));

        bt6 = new Button("6");
        bt6.setUserData("6");
        bt6.setFont(Font.font(25));
        bt6.setTextFill(Color.BLACK);
        bt6.setBackground(Background.fill(Color.STEELBLUE));

        bt7 = new Button("7");
        bt7.setUserData("7");
        bt7.setFont(Font.font(25));
        bt7.setTextFill(Color.BLACK);
        bt7.setBackground(Background.fill(Color.STEELBLUE));

        bt8 = new Button("8");
        bt8.setUserData("8");
        bt8.setFont(Font.font(25));
        bt8.setTextFill(Color.BLACK);
        bt8.setBackground(Background.fill(Color.STEELBLUE));

        bt9 = new Button("9");
        bt9.setUserData("9");
        bt9.setFont(Font.font(25));
        bt9.setTextFill(Color.BLACK);
        bt9.setBackground(Background.fill(Color.STEELBLUE));

        bt0 = new Button("0");
        bt0.setUserData("0");
        bt0.setFont(Font.font(25));
        bt0.setTextFill(Color.BLACK);
        bt0.setBackground(Background.fill(Color.STEELBLUE));

        btsuma = new Button("+");
        btsuma.setUserData("+");
        btsuma.setFont(Font.font(25));
        btsuma.setTextFill(Color.BLACK);
        btsuma.setBackground(Background.fill(Color.RED));

        btresta = new Button("-");
        btresta.setUserData("-");
        btresta.setFont(Font.font(25));
        btresta.setTextFill(Color.BLACK);
        btresta.setBackground(Background.fill(Color.RED));

        btmult = new Button("*");
        btmult.setUserData("*");
        btmult.setFont(Font.font(25));
        btmult.setTextFill(Color.BLACK);
        btmult.setBackground(Background.fill(Color.RED));

        btdiv = new Button("/");
        btdiv.setUserData("/");
        btdiv.setFont(Font.font(25));
        btdiv.setTextFill(Color.BLACK);
        btdiv.setBackground(Background.fill(Color.RED));

        btpunto = new Button(".");
        btpunto.setUserData(".");
        btpunto.setFont(Font.font(25));
        btpunto.setTextFill(Color.BLACK);
        btpunto.setBackground(Background.fill(Color.STEELBLUE));

        btigual = new Button("=");
        btigual.setUserData("=");
        btigual.setFont(Font.font(25));
        btigual.setTextFill(Color.BLACK);
        btigual.setBackground(Background.fill(Color.ORANGE));

        limpiar= new Button("CE");
        limpiar.setUserData("CE");
        limpiar.setFont(Font.font(25));
        limpiar.setTextFill(Color.BLACK);
        limpiar.setBackground(Background.fill(Color.LIGHTSTEELBLUE));


        setVgap(5);
        setHgap(5);
        setPadding(new Insets(5, 5, 5, 5));
        setAlignment(Pos.CENTER);

        //TODO fila 1


        //TODO fila 2
        setConstraints(bt7, 0, 1);
        setConstraints(bt8, 1, 1);
        setConstraints(bt9, 2, 1);
        setConstraints(btsuma, 3, 1);

        //TODO fila 3
        setConstraints(bt4, 0, 2);
        setConstraints(bt5, 1, 2);
        setConstraints(bt6, 2, 2);
        setConstraints(btresta, 3, 2);

        //TODO fila 4

        setConstraints(bt1, 0, 3);
        setConstraints(bt2, 1, 3);
        setConstraints(bt3, 2, 3);
        setConstraints(btmult, 3, 3);

        //TODO fila 5

        setConstraints(btpunto, 0, 4);
        setConstraints(bt0, 1, 4);
        setConstraints(btigual, 2, 4);
        setConstraints(btdiv, 3, 4);

        //TODO fila 6

       setConstraints(limpiar,0,5,4,1);

        tamanobtn(bt7);
        dimension(bt7);
        tamanobtn(bt8);
        dimension(bt8);
        tamanobtn(bt9);
        dimension(bt9);
        tamanobtn(btsuma);
        dimension(btsuma);

        tamanobtn(bt4);
        dimension(bt4);
        tamanobtn(bt5);
        dimension(bt5);
        tamanobtn(bt6);
        dimension(bt6);
        tamanobtn(btresta);
        dimension(btresta);

        tamanobtn(bt1);
        dimension(bt1);
        tamanobtn(bt2);
        dimension(bt2);
        tamanobtn(bt3);
        dimension(bt3);
        tamanobtn(btmult);
        dimension(btmult);

        tamanobtn(btpunto);
        dimension(btpunto);
        tamanobtn(bt0);
        dimension(bt0);
        tamanobtn(btigual);
        dimension(btigual);
        tamanobtn(btdiv);
        dimension(btdiv);

        tamanobtn(limpiar);
        dimension(limpiar);

        setVgrow(bt7, Priority.ALWAYS);
        setVgrow(bt4, Priority.ALWAYS);
        setVgrow(bt1, Priority.ALWAYS);
        setVgrow(btpunto, Priority.ALWAYS);
        setVgrow(limpiar, Priority.ALWAYS);

        setHgrow(bt7, Priority.ALWAYS);
        setHgrow(bt8, Priority.ALWAYS);
        setHgrow(bt9, Priority.ALWAYS);
        setHgrow(btsuma, Priority.ALWAYS);
        setHgrow(limpiar, Priority.ALWAYS);

        getChildren().addAll( bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btsuma,
                btresta, btmult, btdiv, btigual, btpunto,limpiar);


    }

    public void tamanobtn(Button bt) {
        bt.setPrefWidth(55);
        bt.setPrefHeight(75);
    }

    public void dimension(Button bt) {
        bt.setMaxHeight(Double.MAX_VALUE);
        bt.setMaxWidth(Double.MAX_VALUE);

    }

}





