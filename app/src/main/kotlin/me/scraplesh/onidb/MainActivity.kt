package me.scraplesh.onidb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setSupportActionBar(toolbar)
    toolbar.setNavigationOnClickListener { drawer_layout.openDrawer(GravityCompat.END) }

    navigation.menu.add(0, 1, 1, "asd")
    navigation.menu.add(0, 1, 0, "qwe")
  }


}
