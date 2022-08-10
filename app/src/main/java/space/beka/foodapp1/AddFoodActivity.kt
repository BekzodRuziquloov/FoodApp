package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.models.MyFood
import com.example.foodapp.utils.MySharedPreferense
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        MySharedPreferense.init(this)

        btn_save.setOnClickListener {
            val name = edt_name.text.toString().trim()
            val tt = edt_tayorlash.text.toString().trim()

            if (name!=""  && tt!=""){

                val myFood = MyFood(name,tt)
                val list = MySharedPreferense.list
                list.add(myFood)
                MySharedPreferense.list = list

                Toast.makeText(this, "Saqlandi", Toast.LENGTH_SHORT).show()
                finish()

            }else{
                Toast.makeText(this, "Ma`lumotlar kiritilmadi", Toast.LENGTH_SHORT).show()
            }

        }
    }
}