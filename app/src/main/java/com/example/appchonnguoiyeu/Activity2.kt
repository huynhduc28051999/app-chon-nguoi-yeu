package com.example.appchonnguoiyeu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intent = intent
        val bundle = intent.extras
        if (bundle !== null) {
            tv_name.text = bundle.getString("name")
            tv_age.text = bundle.getString("age")
        }
        btn_quit.setOnClickListener {
            this.finishAffinity()
        }
        btn_thanks.setOnClickListener {
            super.onBackPressed()
        }
        btn_again.setOnClickListener {
            chooseAgain()
        }
    }
    fun chooseAgain(){
        val rnds = (0..4).random()
        tv_name.text = MainActivity.listPerson[rnds].getName()
        tv_age.text = MainActivity.listPerson[rnds].getAge().toString()
    }
}