package edu.nd.paradigms.switching.fxsceneswitching


import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class HelloController {
    @FXML
    private lateinit var errorLabel: Label

    @FXML
    private lateinit var textField: TextField

    @FXML
    private fun onButtonClick() {
        errorLabel.text = ""
        try {
            val times = textField.text.toInt()
            if (times < 0) {
                errorLabel.text = "No negative integers"
                return
            }
            HelloApplication.secondSceneController.setTimesDisplayed(times)
            HelloApplication.appStage.scene = HelloApplication.secondScene
        } catch (_: NumberFormatException) {
            errorLabel.text = "Bad integer format"
        }
    }
}