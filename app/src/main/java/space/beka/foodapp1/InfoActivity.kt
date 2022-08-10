package com.example.foodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodapp.models.MyFood
import com.example.foodapp.utils.MySharedPreferense
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {
    private lateinit var myFood: MyFood
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val index = intent.getIntExtra("keyIndex",0)
        MySharedPreferense.init(this)

        myFood = MySharedPreferense.list[index]


        tv_mahsulot.text = myFood.type
        tv_tayorlash.text = myFood.name


    }
}