package flxs.menuicons;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Owch!!");
    }
    
    @FXML
    private MenuItem aboutmenu;

    @FXML
    private MenuBar menubar;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        welcomeText.setText("Welcome to JavaFX " + javafxVersion + ", running on Java " + javaVersion);
        menubar.setUseSystemMenuBar(true);
        aboutmenu.setGraphic(new ImageView(HelloController.class.getResource("icon_one.png").toExternalForm()));
    }
}