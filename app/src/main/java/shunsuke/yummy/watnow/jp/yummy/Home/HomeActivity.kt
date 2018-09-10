package shunsuke.yummy.watnow.jp.yummy.Home

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import shunsuke.yummy.watnow.jp.yummy.Personal.PersonalActivity
import shunsuke.yummy.watnow.jp.yummy.R
import shunsuke.yummy.watnow.jp.yummy.School.SchoolAcitvity
import shunsuke.yummy.watnow.jp.yummy.Search.SearchActivity

val REQUEST_IMAGE_CAPTURE: Int = 1

class HomeActivity : AppCompatActivity() {

    private val mContext: Context = this@HomeActivity
    private val MENU_ID: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupViewPager()

        bottomNavigationView.menu.getItem(MENU_ID).isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            if (item.itemId == bottomNavigationView.menu.getItem(2).itemId) {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
            } else {
                val intent: Intent? = when (item.itemId) {
                    bottomNavigationView.menu.getItem(1).itemId -> Intent(mContext, SearchActivity::class.java)
                    bottomNavigationView.menu.getItem(3).itemId -> Intent(mContext, SchoolAcitvity::class.java)
                    bottomNavigationView.menu.getItem(4).itemId -> Intent(mContext, PersonalActivity::class.java)
                    else -> null
                }
                if (intent != null)
                    startActivity(intent)
            }
            true
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val picture = data?.getParcelableArrayListExtra<Bitmap>("data")
        }
    }

    private fun setupViewPager() {
        val manager = supportFragmentManager
        val adapter = MyFragmentAdapter(manager)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
