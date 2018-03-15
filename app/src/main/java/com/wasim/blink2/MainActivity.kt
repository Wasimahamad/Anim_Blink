package com.wasim.blink2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     internal var tv : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)
        tv.setOnClickListener{
            val tv = findViewById<TextView>(R.id.tv)
            val anim = animationUtils.loadanimation(applicationContext
            R.anim.blink)
            tv.startAnimation(anim)
        }

    }
}
