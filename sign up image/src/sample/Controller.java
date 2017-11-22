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
	
//	@FXML
//    public void initialize() {           
//		
////		// load the image
////        Image image = new Image("file:nikhil-kumar-231465.jpg");
////
////        // simple displays ImageView the image as is
//        ImageView img = new ImageView("file:nikhil-kumar-231465.jpg");
////        img.setImage(image);
////        
//        
////		ImageView img = new ImageView(
////				
////				"http://weknowyourdreams.com/images/forest/forest-13.jpg");
////		
////		
//		imagepane.setCenter(img);		
////		imagepane.setStyle("-fx-background-color: #000000;");
//		
////
////		Scene scene = new Scene(pane);
////		img.fitWidthProperty().bind(stage.widthProperty());
////		img.setPreserveRatio(true);     
//		
//		
//    }
	
	

	public void showSendProfile() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("second.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Superheader");
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
