package edu.nd.paradigms.switching.fxsceneswitching

import javafx.fxml.FXML
import javafx.scene.control.Label


class SecondSceneController {
    private var timesDisplayed = 0

    @FXML
    private lateinit var label: Label

    fun setTimesDisplayed(timesDisplayed: Int) {
        this.timesDisplayed = timesDisplayed
        label.text = "Hello World\n".repeat(timesDisplayed)
    }

    fun handleReturnButton() {
        HelloApplication.appStage.scene = HelloApplication.startScene
    }
}
