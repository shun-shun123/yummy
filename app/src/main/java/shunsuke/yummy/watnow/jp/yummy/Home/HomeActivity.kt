package shunsuke.yummy.watnow.jp.yummy.Home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import shunsuke.yummy.watnow.jp.yummy.R

val REQUEST_IMAGE_CAPTURE: Int = 1

class HomeActivity : AppCompatActivity() {

    private val mContext: Context = this@HomeActivity
    private val MENU_ID: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView.menu.getItem(MENU_ID).isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val intent: Intent? = when (item.itemId) {
                bottomNavigationView.menu.getItem(1).itemId -> Intent(this@HomeActivity, SearchActivity::class.java)
                bottomNavigationView.menu.getItem(2).itemId -> Intent(this@HomeActivity, ConfigurationActivity::class.java)
                else -> null
            }
            if (intent != null) {
                startActivity(intent)
            }
            true
        }
    }
}
