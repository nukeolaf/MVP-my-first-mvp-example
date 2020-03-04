package com.example.mvp_my_first_mvp_example

interface MainContract {
    interface View {
        fun showInfo() // 저장한 정보를 보여줌
    }

    interface Presenter {
        fun setInfo(name: String, email: String) // View 에서 들어온 정보를 처리
    }
}