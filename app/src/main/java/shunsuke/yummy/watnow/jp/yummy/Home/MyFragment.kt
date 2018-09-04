package shunsuke.yummy.watnow.jp.yummy.Home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import shunsuke.yummy.watnow.jp.yummy.R


class MyFragment: Fragment() {
    companion object {
        fun newInstance(): MyFragment {
            return MyFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.view_pager_fragment, null)
    }
}