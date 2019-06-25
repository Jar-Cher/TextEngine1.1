package com.example.demo.app

import com.example.demo.view.MainView
import tornadofx.App
import javafx.stage.Stage

class MyApp: App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        stage.isResizable = false
        stage.minHeight = 600.0
        stage.maxHeight = 600.0
        stage.minWidth = 600.0
        stage.maxWidth = 600.0
        super.start(stage)
    }
}