package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.adapter.MyFoodAdapter
import com.example.foodapp.models.MyFood
import com.example.foodapp.utils.MySharedPreferense
import kotlinx.android.synthetic.main.activity_all_foods.*
import java.util.ArrayList

class AllFoods : AppCompatActivity() {
    private lateinit var list:ArrayList<MyFood>
    private lateinit var myFoodAdapter:MyFoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_foods)

        MySharedPreferense.init(this)
        list = MySharedPreferense.list

        myFoodAdapter = MyFoodAdapter(list,this)
        list_view_foods.adapter = myFoodAdapter

        list_view_foods.setOnItemClickListener{ adapterView ,view,i,l ->
            val intent = Intent(this,InfoActivity::class.java)
            intent.putExtra("keyIndex",i)
            startActivity(intent)

        }








    }

}