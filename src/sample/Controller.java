package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea textArea;
    public TextField textField;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        System.out.println("123");
    }

    @FXML
    public void clickSend1(ActionEvent actionEvent) {
//        textArea.appendText("hi\n");
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }
}
