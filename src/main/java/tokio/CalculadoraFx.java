package tokio;

import javafx.application.Application;

import javafx.stage.Stage;


public class CalculadoraFx extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {

        AppView appView = new AppView(stage);
        AppControlador appControlador = new AppControlador(appView);


    }
    public void stop() throws  Exception{
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
}
