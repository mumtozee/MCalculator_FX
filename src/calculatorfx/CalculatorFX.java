package calculatorfx;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.stage.*;

public class CalculatorFX extends Application
{
    public static Scene scene;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        scene = new Scene(root);
        stage.setResizable(false);
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        stage.setTitle("CalculatorFX");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
