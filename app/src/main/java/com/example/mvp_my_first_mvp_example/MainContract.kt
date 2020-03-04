package com.example.mvp_my_first_mvp_example

import org.json.JSONObject

interface MainContract {
    interface View {
        fun initInfo()

        fun initButton()
        // 버튼에 클릭 리스너를 달아줌

        fun showInfo(info: JSONObject)
        // 저장한 정보를 보여줌
    }

    interface Presenter {
        fun initInfo()

        fun setInfo(info: JSONObject)
        // View 에서 들어온 정보를 처리

        fun saveInfo(info: JSONObject)
        // View 에서 들어온 정보를 저장
    }
}