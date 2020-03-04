package com.example.mvp_my_first_mvp_example

import org.json.JSONObject

interface MainContract {
    interface View {
        fun showInfo(info: JSONObject)
        // 저장한 정보를 보여줌
    }

    interface Presenter {
        fun setInfo(info: JSONObject)
        // View 에서 들어온 정보를 처리
    }
}