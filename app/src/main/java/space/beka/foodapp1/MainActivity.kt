package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_taomlar.setOnClickListener {
          val intent = Intent(this,AllFoods::class.java)
            startActivity(intent)
        }

        btn_add_food.setOnClickListener {
            startActivity(Intent(this,AddFoodActivity::class.java))
        }






    }

}