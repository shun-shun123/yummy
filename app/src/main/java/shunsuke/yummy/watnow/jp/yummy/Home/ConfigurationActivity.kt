package shunsuke.yummy.watnow.jp.yummy.Home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_configuration.*
import shunsuke.yummy.watnow.jp.yummy.R

class ConfigurationActivity : AppCompatActivity() {

    private val mContext: Context = this@ConfigurationActivity
    private val MENU_ID: Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuration)

        bottomNavigationView.menu.getItem(MENU_ID).isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val intent: Intent? = when (item.itemId) {
                bottomNavigationView.menu.getItem(0).itemId -> Intent(this@ConfigurationActivity, HomeActivity::class.java)
                bottomNavigationView.menu.getItem(1).itemId -> Intent(this@ConfigurationActivity, SearchActivity::class.java)
                else -> null
            }
            if (intent != null) {
                startActivity(intent)
            }
            true
        }
    }
}
