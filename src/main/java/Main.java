
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
	
	@Override
	public void start(Stage primaryStage) 
	{
        /// Statement display ///        
        // We will show all our statements in a JavaFX grid : 
		GridPane root = new GridPane();
				
        // Display the text statement
        root.add(new Text("Plain text"), 0, 0);
        //root.add(new Text(txt.getStatement()), 0, 1);
        root.add(new Text("AJOUT 1 DANS JAVAFX"), 0, 1);

        // Also put it on the console : 
        //System.out.println(txt.getStatement());
        
        
        // Display the HTML statement in a small webview
		//root.add(new Text("HTML"), 1, 0);
	    //WebView webView = new WebView();
		//webView.getEngine().loadContent(html.getStatement());
		//webView.setVisible(true);
		//webView.setMaxWidth(400);
		//webView.setMaxHeight(400);
		//root.add(webView, 1, 1);
		
        // Also put it on the console : 
        //System.out.println(html.getStatement());
        
		
		// Display the JavaFX statement
		root.add(new Text("JavaFX"), 3, 0);
		//root.add(jfx.getStatement(), 2, 1);
		root.add(new Text("AJOUT 2"), 3, 1);
		
		/// JavaFX window set-up ///
		primaryStage.setTitle("Projet Archi Log ");
		primaryStage.setScene(new Scene(root, 0, 0));
		primaryStage.setMinHeight(500);
		primaryStage.setMinWidth(1000);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		//launch(args);
		BuilderJfx winJfw = new BuilderJfx();
		//winJfw.createNewWindows();
		//winJfw.createRectangle();
		winJfw.showWindow();
		winJfw.createRectangle();
	}
}