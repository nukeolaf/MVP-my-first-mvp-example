package com.example.mvp_my_first_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View{

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter().apply {
            view = this@MainActivity
        }

        initButton()
    }

    private fun initButton() {
        button_submit.setOnClickListener {
            var name = name_input.text.toString()
            var email = email_input.text.toString()

            name_input.text.clear()
            email_input.text.clear()

            presenter.setInfo(name, email)
        }
    }

    override fun showInfo(name: String, email: String) {
        name_output.text = name
        email_output.text = email
    }
}
