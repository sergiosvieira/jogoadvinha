module com.mycompany.jogoadvinha {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.jogoadvinha to javafx.fxml;
    exports com.mycompany.jogoadvinha;
}
