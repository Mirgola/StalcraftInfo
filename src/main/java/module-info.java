module com.github.mirgola.stalcraftinfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;

    opens com.github.mirgola.stalcraftinfo to javafx.fxml;
    opens com.github.mirgola.stalcraftinfo.barter.attachments to javafx.fxml;
    opens com.github.mirgola.stalcraftinfo.barter.other to javafx.fxml;
    opens com.github.mirgola.stalcraftinfo.barter.suits to javafx.fxml;
    opens com.github.mirgola.stalcraftinfo.barter.weapons to javafx.fxml;
    exports com.github.mirgola.stalcraftinfo;
    exports com.github.mirgola.stalcraftinfo.barter.attachments;
    exports com.github.mirgola.stalcraftinfo.barter.other;
    exports com.github.mirgola.stalcraftinfo.barter.suits;
    exports com.github.mirgola.stalcraftinfo.barter.weapons;
}