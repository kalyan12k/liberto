
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloFX1 extends Application {

    @Override
    public void start(Stage stage) {
        // Create labels and input fields
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        // Submit button
        Button submitButton = new Button("Submit");

        // Message label to display submitted information
        Label messageLabel = new Label();

        // Action on button click
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            messageLabel.setText("Submitted: " + name + " | " + phone + " | " + email);
        });

        // Layout using GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add components to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(phoneLabel, 0, 1);
        grid.add(phoneField, 1, 1);

        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);

        grid.add(submitButton, 1, 3);
        grid.add(messageLabel, 1, 4);

        // Set up the scene
        Scene scene = new Scene(grid, 400, 250);
        stage.setScene(scene);

        // Set title and show stage
        stage.setTitle("User Form - JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
