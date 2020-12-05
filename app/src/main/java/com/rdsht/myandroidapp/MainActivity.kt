package com.rdsht.myandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout

class MainActivity : AppCompatActivity(), FragmentMoviesList.ClickListener,
    FragmentMovieDetails.MovieDetailsOnClickListener {

    private val listFragment = FragmentMoviesList().apply { setListener(this@MainActivity) }
    private val detailfragment = FragmentMovieDetails().apply { setListener(this@MainActivity) };

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.enter_from_right, R.anim.exit_to_left,
                R.anim.enter_from_left, R.anim.exit_to_right
            )
            .add(R.id.fragment_container, listFragment)
            .commit()
    }

    override fun gotoDetail() {
        supportFragmentManager.beginTransaction().setCustomAnimations(
            R.anim.enter_from_right, R.anim.exit_to_left,
            R.anim.enter_from_left, R.anim.exit_to_right
        ).remove(listFragment)
            .add(R.id.fragment_container, detailfragment).commit()
    }

    override fun back() {
        supportFragmentManager.beginTransaction().setCustomAnimations(
            R.anim.enter_from_right, R.anim.exit_to_left,
            R.anim.enter_from_left, R.anim.exit_to_right
        ).remove(detailfragment)
            .add(R.id.fragment_container, listFragment).commit()
    }

}
