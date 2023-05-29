package com.example.trabajopractico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.trabajopractico.databinding.ActivityMainBinding
import com.google.android.filament.Material
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding : ActivityMainBinding
    private lateinit var drawer: DrawerLayout
    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment
    private lateinit  var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(fragment_home())
        //initTooBar()
       // initNavigationView()

        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        bottomNavView = findViewById(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)

        drawer = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_drawer)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        setupDrawerLayout()

      //  binding.bottomNavigationView.setOnItemSelectedListener {

          //  when(it.itemId){
         //       R.id.home -> replaceFragment(fragment_home())
          //      R.id.autos -> replaceFragment(fragment_list())
          //      R.id.perfil -> replaceFragment(fragment_profile())

         //       else ->{

          //      }
         //   }
        //    true
       // }

    }

    private fun setupDrawerLayout(){
        val navController = navHostFragment.navController
        navigationView.setupWithNavController(navController)

        NavigationUI.setupActionBarWithNavController(this, navController, drawer)

        navController.addOnDestinationChangedListener{_, _, _ ->
            supportActionBar?.setHomeAsUpIndicator(R.drawable.baseline_density_medium_24)
        }
    }

/*  override fun onSupportNavigateUp(): Boolean {
     if(drawer.isDrawerOpen(GravityCompat.START)){
         drawer.closeDrawer(GravityCompat.START)
     }else {
         drawer.openDrawer(GravityCompat.START)
     }
     return false
 } */

 /*  private fun initTooBar(){
   val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
       setSupportActionBar(toolbar)

   drawer = findViewById(R.id.drawer_layout)
   val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.app_name, R.string.close_nav)

       drawer.addDrawerListener(toggle)

       toggle.syncState()
   }

   private fun initNavigationView(){
       var navigationView: NavigationView = findViewById(R.id.nav_header)
       navigationView.setNavigationItemSelectedListener(this)

       var headerView: View = LayoutInflater.from(this).inflate(R.layout.nav_header, navigationView, false)

   }*/

 private fun replaceFragment(fragment : Fragment){
     val fragmentManager = supportFragmentManager
     val fragmentTransaction = fragmentManager.beginTransaction()
     fragmentTransaction.replace(R.id.drawer_layout, fragment)
     fragmentTransaction.commit()
 }

 override fun onNavigationItemSelected(item: MenuItem): Boolean {
     TODO("Not yet implemented")
 }

}