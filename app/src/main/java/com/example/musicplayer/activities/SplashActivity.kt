package com.example.musicplayer.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.musicplayer.R
import com.example.musicplayer.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val leftToRightAnimation = AnimationUtils.loadAnimation(this, R.anim.left_to_right)
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade)
        val logoImage = binding.logo
        val text = binding.text

        logoImage.startAnimation(fadeInAnimation)
        text.startAnimation(fadeInAnimation)

        Handler().postDelayed({
            val mainActivityIntent = Intent(this@SplashActivity, RegisterActivity::class.java)
            startActivity(mainActivityIntent)
            finish()
        },3000)

    }

}
