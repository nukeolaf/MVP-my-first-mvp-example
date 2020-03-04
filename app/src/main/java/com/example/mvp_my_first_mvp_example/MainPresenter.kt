package com.example.mvp_my_first_mvp_example

class MainPresenter : MainContract.Presenter {
    // MainContract.Presenter 에서 정의한 내용을 구현한다

    var view: MainContract.View? = null

    override fun setInfo(name: String, email: String) {
        view!!.showInfo(name, email)
    }
}