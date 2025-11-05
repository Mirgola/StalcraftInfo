module com.github.mirgola.stalcraftinfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;


    opens com.github.mirgola.stalcraftinfo to javafx.fxml;
    exports com.github.mirgola.stalcraftinfo;
    exports com.github.mirgola.stalcraftinfo.barter;
    opens com.github.mirgola.stalcraftinfo.barter to javafx.fxml;
}