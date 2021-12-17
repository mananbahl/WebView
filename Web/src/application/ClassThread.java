package application;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.layout.VBox;


public class ClassThread implements Runnable {

    private Thread t;
    private VBox root;
    private WebView wv;
    private WebEngine myWebEngine;
    ClassThread(VBox p) {
        this.root= p;

        t = new Thread(this);
    }

    @Override
    public void run() {
        try {
        	wv=new WebView();
        	myWebEngine=wv.getEngine();
			myWebEngine.load("https://twitter.com");
			root.getChildren().addAll(wv);
            } catch (Exception ie) {
            ie.printStackTrace();
        }
    }

    public void execute() {
        t.start();
    }
}
