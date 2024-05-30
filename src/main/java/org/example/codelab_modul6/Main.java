package main.java.org.example.codelab_modul6;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main extends Application{
    public static ArrayList<ArrayList<String>> users = new ArrayList<>();

    public static void main (String[] args) {
        addUser("user1","pass1");
        addUser("user2","pass2");
        addUser("user3","pass3");
        launch(args);
    }

    public static void addUser(String username, String password) {
        ArrayList<String> user = new ArrayList<>();
        user.add(username);
        user.add(password);
        users.add(user);
    }
    public boolean isValidUser(String userName,String password){
        for (ArrayList<String> user : users) {
            if (user.get(0).equals(userName) && user.get(1).equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); // Jarak horizontal antar kolom
        grid.setVgap(10); // Jarak vertikal antar baris
        grid.setPadding(new Insets(25,25,25,25));
        Text sceneTitle = new Text("Halaman Login");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1); // Kolom 0, Baris 0, Colspan 2, Rowspan 1

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1); // Kolom 0, Baris 1

        TextField inputUserName = new TextField();
        inputUserName.setPromptText("Enter your username");
        grid.add(inputUserName, 1, 1); // Kolom 1, Baris 1

        Label password = new Label("Password : ");
        grid.add(password,0,2);

        PasswordField inputPassword = new PasswordField();
        inputPassword.setPromptText("Enter your password");
        grid.add(inputPassword,1,2);

        Button btn = new Button("SIGN IN");
        HBox hBBtn = new HBox(10);
        hBBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hBBtn.getChildren().addAll(btn);
        grid.add(hBBtn,1,3);

        final Text actionTarget = new Text();
        actionTarget.setWrappingWidth(200); // Set a fixed width to prevent layout changes
        grid.add(actionTarget, 1, 6);

        btn.setOnAction(actionEvent -> {
            boolean isValid = isValidUser(inputUserName.getText(),inputPassword.getText());
            if(inputUserName.getText().isEmpty() || inputPassword.getText().isEmpty()) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Username or Password cannot be empty");
            }
            else if(isValid){
                try {
                    dataLayout(stage, inputUserName.getText());
                } catch (Exception e) {
                    actionTarget.setFill(Color.FIREBRICK);
                    actionTarget.setText("An error occurred: " + e.getMessage());
                }
            }
            else {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Password atau Username Salah");
            }
        });

        Scene scene = new Scene(grid, 420, 420);
        stage.setTitle("Form Login");
        stage.setScene(scene);
        stage.show();
    }
    private void dataLayout(Stage stage, String username) {
        GridPane newGrid = new GridPane();
        newGrid.setAlignment(Pos.CENTER);
        newGrid.setHgap(10);
        newGrid.setVgap(10);
        newGrid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Halo " + username);
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        newGrid.add(sceneTitle, 0, 0, 2, 1);

        Button btn = new Button("KEMBALI");
        newGrid.add(btn, 1, 1);

        btn.setOnAction(actionEvent -> {
            stage.close();
            try {
                start(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Scene scene = new Scene(newGrid, 420, 420);
        stage.setTitle("Form 2");
        stage.setScene(scene);
    }
}


