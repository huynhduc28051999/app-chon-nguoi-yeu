package com.example.appchonnguoiyeu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
         var listPerson = mutableListOf<Person>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_reset.setOnClickListener {
            clearEditText()
        }
        btn_quit.setOnClickListener {
            this.finishAffinity()
        }
        btn_select.setOnClickListener {
            val addSuccess = addToList()
            if (addSuccess) {
                var intent = Intent(this, Activity2::class.java)
                val bundle = Bundle()
                val rnds = (0..4).random()
                bundle.putString("name", listPerson[rnds].getName())
                bundle.putString("age", listPerson[rnds].getAge().toString())
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }

    fun clearEditText() {
        name1.text = null
        name2.text = null
        name3.text = null
        name4.text = null
        name5.text = null
        age1.text = null
        age2.text = null
        age3.text = null
        age4.text = null
        age5.text = null
    }

    fun addToList(): Boolean {
        val name1 = name1.text
        val name2 = name2.text
        val name3 = name3.text
        val name4 = name4.text
        val name5 = name5.text
        val age1 = age1.text
        val age2 = age2.text
        val age3 = age3.text
        val age4 = age4.text
        val age5 = age5.text
        if (
            name1.isEmpty() || name2.isEmpty() || name3.isEmpty() || name4.isEmpty() || name5.isEmpty()
            || age1.isEmpty() || age2.isEmpty() || age3.isEmpty() || age4.isEmpty() || age5.isEmpty()
            ) {
            Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_LONG).show()
            return false
        }
        listPerson.clear()
        var person1 = Person(name1.toString(), age1.toString().toInt())
        var person2 = Person(name2.toString(), age2.toString().toInt())
        var person3 = Person(name3.toString(), age3.toString().toInt())
        var person4 = Person(name4.toString(), age4.toString().toInt())
        var person5 = Person(name5.toString(), age5.toString().toInt())
        listPerson.add(person1)
        listPerson.add(person2)
        listPerson.add(person3)
        listPerson.add(person4)
        listPerson.add(person5)
        return true
    }
}