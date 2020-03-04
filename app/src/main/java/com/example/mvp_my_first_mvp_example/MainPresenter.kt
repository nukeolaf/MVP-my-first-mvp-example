package com.example.mvp_my_first_mvp_example

import org.json.JSONObject

class MainPresenter : MainContract.Presenter {
    // MainContract.Presenter 에서 정의한 내용을 구현한다

    var view: MainContract.View? = null
    var model: MainModel? = null

    override fun setInfo(info: JSONObject) {
        view!!.showInfo(info)
    }

    override fun saveInfo(info: JSONObject) {
        model!!.saveData(info)
    }
}