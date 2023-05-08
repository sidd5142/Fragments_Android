package com.example.fragments_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments_learn.ui.login.frag_login
import java.time.Clock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClock = findViewById<Button>(R.id.clock)
        val buttonExam = findViewById<Button>(R.id.exam)
        val buttonvalidate = findViewById<Button>(R.id.valid)

        buttonClock.setOnClickListener {
             replaceFrameWithFragment(Clock_Frag())
        }

        buttonExam.setOnClickListener {
             replaceFrameWithFragment(Exam_Frag())
        }

        buttonvalidate.setOnClickListener {
            replaceFrameWithFragment(frag_login())
        }
    }

    private fun replaceFrameWithFragment(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frame, frag)
        fragTransaction.commit()

    }
}