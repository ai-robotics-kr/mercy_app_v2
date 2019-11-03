package com.content.mercy.main

import android.content.Context
import com.content.mercy.BasePresenter
import com.content.mercy.BaseView
import com.content.mercy.model.Friend

/**
 * Created by rapsealk on 2019-11-01..
 */
interface MainContract {

    interface View : BaseView<Presenter> {
        fun getActivityContext(): Context
    }

    interface Presenter : BasePresenter {
        fun getFriends(): ArrayList<Friend>
        fun showFriendDetail(position: Int)
    }
}