package com.example.belitadev.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Default fragment
        callFragment(ProdutoFragment.newInstance())
    }

    private fun callFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameContent, fragment, null)
                //.addToBackStack(null)
                .commit()
    }
}
