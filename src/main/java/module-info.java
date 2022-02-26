module flxs.menuicons {
    requires javafx.controls;
    requires javafx.fxml;


    opens flxs.menuicons to javafx.fxml;
    exports flxs.menuicons;
}