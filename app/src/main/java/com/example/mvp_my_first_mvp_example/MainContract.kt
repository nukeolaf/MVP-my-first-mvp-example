package com.example.mvp_my_first_mvp_example

interface MainContract {
    interface View {
        fun saveInfo() // 버튼을 눌러 정보 저장
        fun showInfo() // 저장한 정보를 보여줌
    }

    interface Presenter {
        fun setInfo() // View 에서 들어온 정보를 처리
    }
}