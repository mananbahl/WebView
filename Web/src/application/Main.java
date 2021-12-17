package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {
	private int i;
	@Override
	public void start(Stage primaryStage) {
		try {
			String[] links=new String[]{"https://google.com","https://youtube.com","https://gmail.com","https://facebook.com","https://twitter.com"};
			VBox root = new VBox();
			Scene scene = new Scene(root,400,400);	
			Button b=new Button("Next");
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.setTitle("Web View Application");
			WebView myWebView=new WebView();
			myWebView.setContextMenuEnabled(false);
			System.out.println("hy");
			
			WebEngine myWebEngine=myWebView.getEngine();
			myWebEngine.load("https://google.com");
			//Thread.sleep(4000);
			root.getChildren().addAll(myWebView,b);
			primaryStage.show();
			i=1;
			b.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event)
				{
					if(i==5) i=0;
					myWebEngine.load(links[i]);
										
					i++;
				}				
			});
			
			//myWebEngine.load("https://facebook.com");
				//ClassThread c=new ClassThread(root); 
				//c.execute();				
				
				
/*			while(true)
			{
				Thread.sleep(10000);
				myWebEngine.load("https://facebook.com");
			}
*/				 
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch();
	}
}
