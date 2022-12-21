package Practica.Practicum_9B.Werkboek.les9.userinterface;

import Practica.Practicum_9B.Werkboek.les9.model.TwitterAccount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import Practica.Practicum_9B.Werkboek.les9.model.Tweet;

public class TweetOpstellenController {

    @FXML
    private Label tweetMeldingLabel;

    @FXML
    private TextArea tweetTextArea;

    @FXML
    void handleButtonAnnuleren(ActionEvent event) {
        Button source = (Button)event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleButtonTweet(ActionEvent event) throws Exception {
        String bericht = tweetTextArea.getText();
        Tweet tweet = new Tweet(bericht);

        TwitterAccount.getHuidigeUser().tweet(tweet);

        // Close window
        Button source = (Button)event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

}
