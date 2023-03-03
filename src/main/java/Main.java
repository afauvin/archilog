
import javafx.application.Application;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class Main extends Application {

	public Main() {}
	
	@Override 
	public void init() {
	}
	
	public static void main(String[] args) {
		//launch(args);
		WindowsFactory winJfx = new JfwFactory();

		winJfx.createFormJfx();
		winJfx.start();
	}
}