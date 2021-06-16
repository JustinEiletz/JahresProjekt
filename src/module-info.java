module testfx {
    requires javafx.controls;
    requires javafx.fxml;
    exports sample;
    opens sample to javafx.fxml;
}