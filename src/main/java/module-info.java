module sorting.laba1.sortinglaba1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens sorting.laba1.sortinglaba1 to javafx.fxml;
    exports sorting.laba1.sortinglaba1;
}