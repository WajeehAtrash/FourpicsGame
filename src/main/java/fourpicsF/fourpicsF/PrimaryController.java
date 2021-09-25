package fourpicsF.fourpicsF;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startBtn;

    @FXML
    void startGame(ActionEvent event) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        App.setRoot("secondary");
    }

    @FXML
    private Button exitBtn;

    @FXML
    void exitGame(ActionEvent event) {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    @FXML
    void initialize() {
        assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'primary.fxml'.";
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'primary.fxml'.";

    }
}

