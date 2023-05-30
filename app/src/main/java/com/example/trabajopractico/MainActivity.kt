package com.example.trabajopractico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.trabajopractico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userName = intent.getStringExtra("userName")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(fragment_home())


        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(fragment_home())
                R.id.autos -> replaceFragment(fragment_list())
                R.id.perfil -> replaceFragment(fragment_profile(), userName.toString())
            }
            true
        }

        binding.navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile -> replaceFragment(fragment_profile(), userName.toString())
                R.id.setting -> replaceFragment(fragment_setting())
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment, userData: String = ""){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        //Generar un Bundle para pasar parametros entre un Activity y un Fragment(Aca se pasa el nombre de usuario)
        if (userData.isNotEmpty()) {
            var dataBundle = Bundle()
            dataBundle.putString("userName", userData);
            fragment.arguments = dataBundle
            val headerFragment = nav_header();
            headerFragment.arguments = dataBundle
        }

        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

}