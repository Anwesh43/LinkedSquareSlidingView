package com.anwesh.uiprojects.linkedsquareslidingview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squareslidingview.SquareSlidingView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareSlidingView.create(this)
    }
}
