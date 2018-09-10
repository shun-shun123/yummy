package shunsuke.yummy.watnow.jp.yummy.Camera

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import shunsuke.yummy.watnow.jp.yummy.Home.HomeActivity
import shunsuke.yummy.watnow.jp.yummy.Personal.PersonalActivity
import shunsuke.yummy.watnow.jp.yummy.R
import shunsuke.yummy.watnow.jp.yummy.School.SchoolAcitvity
import shunsuke.yummy.watnow.jp.yummy.Search.SearchActivity

class CameraActivity : AppCompatActivity() {

    private val mContext: Context = this@CameraActivity
    private val MENU_ID: Int = 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        bottomNavigationView.menu.getItem(MENU_ID).setChecked(true)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val intent: Intent? = when (item.itemId) {
                bottomNavigationView.menu.getItem(0).itemId -> Intent(mContext, HomeActivity::class.java)
                bottomNavigationView.menu.getItem(1).itemId -> Intent(mContext, SearchActivity::class.java)
                bottomNavigationView.menu.getItem(2).itemId -> null
                bottomNavigationView.menu.getItem(3).itemId -> Intent(mContext, SchoolAcitvity::class.java)
                bottomNavigationView.menu.getItem(4).itemId -> Intent(mContext, PersonalActivity::class.java)
                else -> null
            }
            if (intent != null)
                startActivity(intent)
            true
        }
    }
}
