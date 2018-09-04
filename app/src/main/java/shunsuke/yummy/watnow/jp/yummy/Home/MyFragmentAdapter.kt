package shunsuke.yummy.watnow.jp.yummy.Home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyFragmentAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val TitleArray: Array<String> = arrayOf("カフェ", "焼肉", "居酒屋", "ラーメン", "洋食")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MyFragment.newInstance()
            1 -> MyFragment.newInstance()
            2 -> MyFragment.newInstance()
            else -> MyFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TitleArray[position]
    }
}