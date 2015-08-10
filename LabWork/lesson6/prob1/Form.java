package week1.day6.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Form extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		primaryStage.setTitle("Address Form");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(25);
		grid.setVgap(10);
		// grid.setPadding(new Insets(10,10,10,10));

		Label lbl1 = new Label("Name");
		grid.add(lbl1, 1, 0);
		TextField txt1 = new TextField();
		grid.add(txt1, 1, 1);

		Label lbl2 = new Label("Street");
		grid.add(lbl2, 2, 0);
		TextField txt2 = new TextField();
		grid.add(txt2, 2, 1);

		Label lbl3 = new Label("City");
		grid.add(lbl3, 3, 0);
		TextField txt3 = new TextField();
		grid.add(txt3, 3, 1);

		Label lbl4 = new Label("State");
		grid.add(lbl4, 1, 4);
		TextField txt4 = new TextField();
		grid.add(txt4, 1, 5);

		Label lbl5 = new Label("Zip");
		grid.add(lbl5, 2, 4);
		TextField txt5 = new TextField();
		grid.add(txt5, 2, 5);

		Button submit = new Button("Submit");
		submit.setMaxWidth(Double.MAX_VALUE);
		grid.add(submit, 2, 9);

		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(txt1.getText());
				System.out.println(txt2.getText());
				System.out.println(txt3.getText() + "," + txt4.getText() + " " + txt5.getText());
			}
		});

		primaryStage.setScene(new Scene(grid, 900, 250));
		primaryStage.show();
		// grid.setGridLinesVisible(true);
	}

	@Override
	public void stop() {
		// clean up resources
	}
}
