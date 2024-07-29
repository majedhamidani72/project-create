package com.example.cusrecyclerfaslha.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ActivitySplashBinding
import com.example.cusrecyclerfaslha.ui.MainActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // بارگذاری انیمیشن
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        binding.splashImage.startAnimation(fadeInAnimation)

        // انتقال به Activity بعدی پس از 1 ثانیه
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}
