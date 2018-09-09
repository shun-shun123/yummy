package shunsuke.yummy.watnow.jp.yummy.School

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import shunsuke.yummy.watnow.jp.yummy.R


class MyFragment: Fragment() {

    companion object {
        fun newInstance(mode: Int): MyFragment {
            val frag = MyFragment()
            val b: Bundle = Bundle()
            b.putInt("MODE", mode)
            frag.arguments = b
            return frag
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.school_view_pager_fragment, null)
        val constraintLayout: ConstraintLayout = view.findViewById(R.id.school_view_pager_container)
        if (arguments?.getInt("MODE") == 0) {
            // GoogleMap表示モード: 0
            constraintLayout.setBackgroundColor(0xffffff)
        }
        return view
    }
}