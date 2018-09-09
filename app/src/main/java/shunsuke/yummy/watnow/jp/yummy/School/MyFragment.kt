package shunsuke.yummy.watnow.jp.yummy.School

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.MapsInitializer
import shunsuke.yummy.watnow.jp.yummy.R


class MyFragment(): Fragment() {

    private lateinit var mMapView: MapView
    private var googleMap: GoogleMap? = null

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
        if (arguments?.getInt("MODE") == 0) {
            mMapView = view.findViewById<MapView>(R.id.map_view)
            mMapView.onCreate(savedInstanceState)
            mMapView.onResume()
            try {
                MapsInitializer.initialize(activity?.applicationContext)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return view
    }
}