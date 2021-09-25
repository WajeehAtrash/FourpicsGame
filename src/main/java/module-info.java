module fourpicsF.fourpicsF {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens fourpicsF.fourpicsF to javafx.fxml;
    exports fourpicsF.fourpicsF;
}
