module org.example.codelab_modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.codelab_modul6 to javafx.fxml;
    exports org.example.codelab_modul6;
}