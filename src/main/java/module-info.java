module org.clubspongebob {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.clubspongebob to javafx.fxml;
    exports org.clubspongebob;
}
