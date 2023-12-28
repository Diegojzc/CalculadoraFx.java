package tokio;

import javafx.event.EventHandler;

import javafx.event.ActionEvent;
import javafx.scene.Node;


public class AppControlador implements EventHandler<ActionEvent>{

    public AppView appView;


    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean muktiplicacion = false;
    boolean division = false;

    double numero1;
    double numero2;
    double resultado;


    public  AppControlador(AppView appView){
        this.appView= appView;
        OnAction();
    }
    public void OnAction(){
        appView.appBotones.bt1.setOnAction(this);
        appView.appBotones.bt2.setOnAction(this);
        appView.appBotones.bt3.setOnAction(this);
        appView.appBotones.bt4.setOnAction(this);
        appView.appBotones.bt5.setOnAction(this);
        appView.appBotones.bt6.setOnAction(this);
        appView.appBotones.bt7.setOnAction(this);
        appView.appBotones.bt8.setOnAction(this);
        appView.appBotones.bt9.setOnAction(this);
        appView.appBotones.bt0.setOnAction(this);
        appView.appBotones.btsuma.setOnAction(this);
        appView.appBotones.btresta.setOnAction(this);
        appView.appBotones.btmult.setOnAction(this);
        appView.appBotones.btdiv.setOnAction(this);
        appView.appBotones.btpunto.setOnAction(this);
        appView.appBotones.btigual.setOnAction(this);
        appView.appBotones.limpiar.setOnAction(this);
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        String userData = node.getUserData().toString();

        switch (userData){
            case "1":
               appView.textField.setText(appView.textField.getText()+"1");

                break;
            case"2":
                appView.textField.setText(appView.textField.getText() +"2");
                break;
            case"3":
                appView.textField.setText(appView.textField.getText()+ "3");
                break;
            case "4":
                appView.textField.setText(appView.textField.getText()+"4");
                break;
            case"5":
                appView.textField.setText(appView.textField.getText() +"5");
                break;
            case"6":
                appView.textField.setText(appView.textField.getText()+ "6");
                break;
            case "7":
                appView.textField.setText(appView.textField.getText()+"7");
                break;
            case"8":
                appView.textField.setText(appView.textField.getText() +"8");
                break;
            case"9":
                appView.textField.setText(appView.textField.getText()+ "9");
                break;
            case "0":
                appView.textField.setText(appView.textField.getText()+"0");
                break;
            case"+":

                numero1 =Double.parseDouble(appView.textField.getText());
                appView.textField.setText("");
                suma =true;
                decimal =true;

                break;
            case"-":
                numero1 =Double.parseDouble(appView.textField.getText());
                appView.textField.setText("");
                resta =true;
                decimal =true;
                break;
            case"*":
                numero1 =Double.parseDouble(appView.textField.getText());
                appView.textField.setText("");
                muktiplicacion =true;
                decimal =true;
                break;
            case"/":
                numero1 =Double.parseDouble(appView.textField.getText());
                appView.textField.setText("");
                division =true;
                decimal =true;
                break;
            case".":

                    appView.textField.setText(appView.textField.getText() + ".");

                break;
            case"=":

                    numero2= Double.parseDouble(appView.textField.getText());
                    if (suma) {

                        resultado = numero1 + numero2;
                        appView.textField.setText(String.valueOf(resultado));

                    }
                    if (resta) {
                        resultado = numero1 - numero2;
                        appView.textField.setText(String.valueOf(resultado));

                    }
                    if (muktiplicacion) {
                        resultado = numero1 * numero2;
                        appView.textField.setText(String.valueOf(resultado));

                    }
                    if (division) {
                        resultado = numero1 / numero2;
                        appView.textField.setText(String.valueOf(resultado));

                    }
                break;
            case"CE":
                appView.textField.setText("");
                suma=false;
                resta =false;
                muktiplicacion=false;
                division=false;
                break;


        }
    }
}
