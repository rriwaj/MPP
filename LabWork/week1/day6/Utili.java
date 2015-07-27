package application;
	
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

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
import javafx.scene.text.Text;


public class Utili extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) 
	{
		GridPane grid = new GridPane();
		primaryStage.setTitle("String Utility");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(18);
		grid.setVgap(6);
		grid.setPadding(new Insets(25,25,25,25));
		
		Button btn1 = new Button("Count Letters");
		grid.add(btn1,0,2);
		
		Button btn2 = new Button("Reverse Letters");
		grid.add(btn2,0,3);
		
		Button btn3 = new Button("Remove Duplicates");
		grid.add(btn3,0,4);
		
		Label lbl1 = new Label ( " Input");
		grid.add(lbl1,2,1);
		TextField txt1= new TextField();
		grid.add(txt1,2,2);

		Label lbl2 = new Label ( " Output");
		grid.add(lbl2,2,3);
		TextField txt2= new TextField();
		grid.add(txt2,2,4);
		
		 final Text actiontarget = new Text();
	        grid.add(actiontarget, 2, 4);
	       
	        btn1.setOnAction((ActionEvent event)->{
	        	txt2.setText(Integer.toString(txt1.getText().length()));
	        });
	
	        btn2.setOnAction((ActionEvent event)->{
	        	String text = txt1.getText();
	        	int length= txt1.getLength();
	        	String reverse="";
	        	for(int i=length-1;i>=0;i--)
	        	{
	        		reverse= reverse+text.charAt(i);
	        	}
	        	txt2.setText(reverse);
	        });
	        
	        btn3.setOnAction((ActionEvent event)->{
	        	String text = txt1.getText();
	        	int length= txt1.getLength();
	        	String removedub="";
	       
	        for( int i=0; i<length;i++)
	        {
	        	 int	count=0;
	        	 
	        	 for( int j=0; j<removedub.length();j++)
	        	 {
if (Character.toLowerCase(text.charAt(i)) ==
Character.toLowerCase(removedub.charAt(j))) 
{
count++;
	        	 }}
	      	        	
	        if ( count==0)
	        {
	        	removedub= removedub+ text.charAt(i);
	        }
	        	
	        }
	        txt2.setText(removedub);
	        });
	        
	        
		primaryStage.setScene(new Scene(grid, 500, 250));
		primaryStage.show();
		//grid.setGridLinesVisible(true);
	}
	@Override
	public void stop() 
	{
		//clean up resources
	}
}
