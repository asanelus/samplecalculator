package com.asanelus;

import com.asanelus.view.Calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/** 
 *  A JavaFx calculator
 *  
 * @author Antonika Sanelus
 * 
 */

/**
 * MainApp application sets up the stage and runs application
 */
public class MainApp extends Application {
	
	private Stage primaryStage;	
	private GridPane rootLayout;
    
	
	public MainApp(){
		super();
	}
	
	/**
	 *  starts and initializes the layout of the stage
	 *  @param primaryStage 
	 */
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		initRootLayout();
		Scene scene = new Scene(rootLayout);
		scene.getStylesheets().add(
		         MainApp.class.getResource(
		            "styles.css" ).toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();		
		
	}
	
	/**
	 * private InitRootLayout method that initializes the layout Object
	 */
	private void initRootLayout(){
		try{
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(MainApp.class.getResource("view/calculatorLayout.fxml"));
			rootLayout = (GridPane)loader.load();
			Calculator rootController = loader.getController();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
