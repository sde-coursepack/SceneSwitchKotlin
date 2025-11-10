package edu.nd.paradigms.switching.fxsceneswitching

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        appStage = stage

        //load first scene
        val firstSceneLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        startScene = Scene(firstSceneLoader.load(), 320.0, 240.0)

        //load second scene
        val secondSceneLoader = FXMLLoader(HelloApplication::class.java.getResource("second-scene.fxml"))
        secondScene = Scene(secondSceneLoader.load(), 320.0, 240.0)
        secondSceneController = secondSceneLoader.getController() as SecondSceneController

        appStage.title = "Hello!"
        appStage.scene = startScene
        appStage.show()
    }

    companion object {
        lateinit var appStage: Stage

        lateinit var startScene: Scene

        lateinit var secondScene: Scene

        lateinit var secondSceneController: SecondSceneController
    }
}
  
