package shunsuke.yummy.watnow.jp.yummy.School

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyFragmentAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MyFragment.newInstance(0)
            1 -> MyFragment.newInstance(1)
            else -> MyFragment.newInstance(0)
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "マップ"
            1 -> "リスト"
            else -> "マップ"
        }
    }
}