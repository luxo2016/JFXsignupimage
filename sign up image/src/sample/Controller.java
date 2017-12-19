package sample;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller {

	@FXML
	public BorderPane imagepane;



	public void showSendProfile() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("second.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FreeSolo");			
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
