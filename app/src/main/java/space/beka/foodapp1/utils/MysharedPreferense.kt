package com.example.foodapp.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.foodapp.models.MyFood
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


object MySharedPreferense {
    private const val NAME = "catch_file_name"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences


    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var list:ArrayList<MyFood>

        get() = stringToList(preferences.getString("list","[]")!!)
        set(value) = preferences.edit{
            it.putString("list", listToString(value))
        }

    private fun stringToList(str: String):ArrayList<MyFood>{
        val gson = Gson()
        val list = ArrayList<MyFood>()

        val type = object : TypeToken<ArrayList<MyFood>>(){}.type
        list.addAll(gson.fromJson(str,type))

        return list
    }

    private fun listToString(list:ArrayList<MyFood>):String{
        return Gson().toJson(list)
    }

}