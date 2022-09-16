package com.orbitalsonic.includevsviewstub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExampleIncludeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_include)
        // all views initialize at the same time
        // because of this white screen displayed
    }
}