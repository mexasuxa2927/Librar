package com.example.myliblary

import android.content.Context
import android.widget.Toast

class MyToastClass {


    companion object fun getToast(context: Context,text:String){

        Toast.makeText(context, "$text", Toast.LENGTH_SHORT).show()
    }

}