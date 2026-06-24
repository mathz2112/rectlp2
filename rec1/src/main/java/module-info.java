module com.mycompany.rec1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.rec1 to javafx.fxml;
    exports com.mycompany.rec1;
}
