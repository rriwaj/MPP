package application;
	


import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Form extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) 
	{
		GridPane grid = new GridPane();
		primaryStage.setTitle("Address Form");
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(25);
		grid.setVgap(10);
		//grid.setPadding(new Insets(10,10,10,10));
		
		Label lbl1 = new Label( "Name");
		grid.add(lbl1, 2,1 );
		TextField txt1 = new TextField();
		grid.add(txt1, 2, 2);
		
		Label lbl2 = new Label( "Street");
		grid.add(lbl2, 3,1 );
		TextField txt2 = new TextField();
		grid.add(txt2, 3, 2);
		
		Label lbl3 = new Label( "City");
		grid.add(lbl3, 4,1 );
		TextField txt3 = new TextField();
		grid.add(txt3, 4, 2);
		
		Label lbl4 = new Label( "State");
		grid.add(lbl4, 2,4 );
		TextField txt4 = new TextField();
		grid.add(txt4, 2, 5);
		
		Label lbl5 = new Label( "Zip");
		grid.add(lbl5, 3,4 );
		TextField txt5 = new TextField();
		grid.add(txt5, 3, 5);
		
		Button submit = new Button("Submit");
		grid.add(submit, 3,7);
		
		
		
		submit.setOnAction(new EventHandler<ActionEvent>()
				{
			
			@Override
			public void handle(ActionEvent event) 
			{
				System.out.println(txt1.getText());
				System.out.println(txt2.getText());
				System.out.println(txt3.getText()+","+txt4.getText()+" "+txt5.getText());
			}
		});
	
		primaryStage.setScene(new Scene(grid, 900, 250));
		primaryStage.show();
		//grid.setGridLinesVisible(true);
	}
	@Override
	public void stop() 
	{
		//clean up resources
	}
}
