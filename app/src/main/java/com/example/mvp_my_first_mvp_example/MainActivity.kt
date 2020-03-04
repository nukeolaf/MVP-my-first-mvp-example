package com.example.mvp_my_first_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MainContract.View{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun saveInfo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showInfo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
