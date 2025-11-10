module edu.nd.paradigms.switching.fxsceneswitching {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens edu.nd.paradigms.switching.fxsceneswitching to javafx.fxml;
    exports edu.nd.paradigms.switching.fxsceneswitching;
}