package shunsuke.yummy.watnow.jp.yummy.Home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import kotlinx.android.synthetic.main.activity_search.*
import shunsuke.yummy.watnow.jp.yummy.R

class SearchActivity : AppCompatActivity(), OnMapReadyCallback {

    private val mContext: Context = this@SearchActivity
    private val MENU_ID: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        bottomNavigationView.menu.getItem(MENU_ID).isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val intent: Intent? = when (item.itemId) {
                bottomNavigationView.menu.getItem(0).itemId -> Intent(this@SearchActivity, HomeActivity::class.java)
                bottomNavigationView.menu.getItem(2).itemId -> Intent(this@SearchActivity, ConfigurationActivity::class.java)
                else -> null
            }
            if (intent != null) {
                startActivity(intent)
            }
            true
        }

        val mapFragment = fragmentManager.findFragmentById(R.id.mapFragment) as MapFragment
        mapFragment.getMapAsync(this@SearchActivity)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        val map: GoogleMap? = googleMap
    }

}
