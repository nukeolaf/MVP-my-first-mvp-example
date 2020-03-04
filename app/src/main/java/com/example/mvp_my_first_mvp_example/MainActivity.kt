package com.example.mvp_my_first_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity(), MainContract.View{

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter().apply {
            view = this@MainActivity
            model = MainModel().apply {
                context = this@MainActivity
            }
        }

        initButton()
    }

    private fun initButton() {
        button_submit.setOnClickListener {
            var name = name_input.text.toString()
            var email = email_input.text.toString()

            var info = JSONObject()
            info.put("name", name)
            info.put("email", email)

            name_input.text.clear()
            email_input.text.clear()

            presenter.setInfo(info)
            presenter.saveInfo(info)
        }
    }

    override fun showInfo(info: JSONObject) {
        name_output.text = info.getString("name")
        email_output.text = info.getString("email")
    }
}
