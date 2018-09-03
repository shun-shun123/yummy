package shunsuke.yummy.watnow.jp.yummy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                bottomNavigationView.menu.getItem(0).itemId -> Toast.makeText(this@HomeActivity, "HOME", Toast.LENGTH_SHORT).show()
                bottomNavigationView.menu.getItem(1).itemId -> Toast.makeText(this@HomeActivity, "SEARCH", Toast.LENGTH_SHORT).show()
                bottomNavigationView.menu.getItem(2).itemId -> Toast.makeText(this@HomeActivity, "CAMERA", Toast.LENGTH_SHORT).show()
                bottomNavigationView.menu.getItem(3).itemId -> Toast.makeText(this@HomeActivity, "SCHOOL", Toast.LENGTH_SHORT).show()
                bottomNavigationView.menu.getItem(4).itemId -> Toast.makeText(this@HomeActivity, "PERSONAL", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}
