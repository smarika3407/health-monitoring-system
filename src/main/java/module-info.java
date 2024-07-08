module com.smarikaacharya.healthmonitoringsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires servlet.api;
    requires org.json;
    requires java.sql;
    requires javafx.base;

    opens com.smarikaacharya.healthmonitoringsystem to javafx.fxml;
    exports com.smarikaacharya.healthmonitoringsystem;

    opens com.smarikaacharya.healthmonitoringsystem.classes to javafx.base;
    exports com.smarikaacharya.healthmonitoringsystem.classes;
}