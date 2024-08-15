package com.example.cusrecyclerfaslha.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout)

        // Set up NavigationView
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)

        // Set up the Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Set up the ActionBarDrawerToggle
        val toggle = androidx.appcompat.app.ActionBarDrawerToggle(
            this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Handle clicks for custom items
        binding.customRecycler1.setOnClickListener { handleCustomItemClick(1) }
        binding.customRecycler2.setOnClickListener { handleCustomItemClick(2) }
        binding.customRecycler3.setOnClickListener { handleCustomItemClick(3) }
        binding.customRecycler4.setOnClickListener { handleCustomItemClick(4) }
        binding.customRecycler5.setOnClickListener { handleCustomItemClick(5) }
        binding.customRecycler6.setOnClickListener { handleCustomItemClick(6) }
        binding.customRecycler7.setOnClickListener { handleCustomItemClick(7) }


        // Set up click listener for the ImageView in Toolbar
        val toolbarIcon: ImageView = findViewById(R.id.img_toolbar_icon)
        toolbarIcon.setOnClickListener {
            // Open the navigation drawer
            drawerLayout.openDrawer(GravityCompat.START)
        }


    }

    private fun handleCustomItemClick(chapter: Int) {
        val intent = Intent(this, SubjectsActivity::class.java).apply {
            putExtra("CHAPTER_NUMBER", chapter)
        }
        startActivity(intent)
    }


    // کلیک روی هر کدام از آیتم های دراور نوگیشن
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_search -> {
                // Handle search action
            }
            R.id.nav_help -> {
                // Handle help action
            }
            R.id.nav_contact -> {
                // Handle contact action
            }
            R.id.nav_our_apps -> {
                // Handle our apps action
            }
            R.id.nav_feedback -> {
                // Handle feedback action
            }
            R.id.nav_logout -> {
                finishAffinity()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
