package com.example.mvp_my_first_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View{

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()

        initButton()
    }

    private fun initButton() {
        button_submit.setOnClickListener {
            var name = name_input.text.toString()
            var email = email_input.text.toString()
            presenter.setInfo(name, email)
        }
    }

    override fun showInfo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
