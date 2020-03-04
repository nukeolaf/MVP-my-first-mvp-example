package com.example.mvp_my_first_mvp_example

import android.content.Context
import org.json.JSONObject

class MainModel {

    lateinit var context: Context

    fun saveInfo(info: JSONObject) {
        var data = info.toString()

        var pref = context.getSharedPreferences("info", 0)
        var editor = pref.edit()
        editor.putString("info", data)
    }

    fun getInfo(): String? {
        var pref = context.getSharedPreferences("info", 0)
        var result = pref.getString("info", null)
        return result
    }
}