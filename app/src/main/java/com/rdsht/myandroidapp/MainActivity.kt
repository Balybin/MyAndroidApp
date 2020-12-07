package com.rdsht.myandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentMoviesList.ClickListener,
    FragmentMovieDetails.MovieDetailsOnClickListener {

    private val listFragment = FragmentMoviesList().apply { setClickListener(this@MainActivity) }
    private val detailFragment = FragmentMovieDetails().apply { setListener(this@MainActivity) }

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

    override fun gotoDetail(movieId: Int) {
        supportFragmentManager.beginTransaction().setCustomAnimations(
            R.anim.enter_from_right, R.anim.exit_to_left,
            R.anim.enter_from_left, R.anim.exit_to_right
        ).remove(listFragment)
            .add(R.id.fragment_container, detailFragment).commit()
    }

    override fun back() {
        supportFragmentManager.beginTransaction().setCustomAnimations(
            R.anim.enter_from_right, R.anim.exit_to_left,
            R.anim.enter_from_left, R.anim.exit_to_right
        ).remove(detailFragment)
            .add(R.id.fragment_container, listFragment).commit()
    }

}
