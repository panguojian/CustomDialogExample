package com.pgj.customdialogexample.dialog

import android.app.Dialog
import android.content.Context
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull
import com.pgj.customdialogexample.R


/**
 * Created by pgj on 2020-8-18
 **/
class CustomTipDialog(context: Context) : Dialog(context, R.style.DialogTheme) {


    private val mTvTitle:TextView
    private val mTvMessage:TextView
    private val mBtnOne:TextView
    private val mBtnTwo:TextView

    init {
        val view=LayoutInflater.from(context).inflate(R.layout.dialog_tips_custom_style,null)
        mTvTitle=view.findViewById(R.id.dialog_custom_title)
        mTvMessage=view.findViewById(R.id.dialog_custom_message)
        mBtnOne=view.findViewById(R.id.dialog_button_one)
        mBtnTwo=view.findViewById(R.id.dialog_button_two)
        setContentView(view)
    }

    fun title(title:String){
        mTvTitle.text=title
    }

    fun message(message:String){
        mTvMessage.text=message
    }

    fun message(message:Spanned){
        mTvMessage.text=message
    }

    fun setButtonOne(@NonNull text:String,listener: View.OnClickListener?){
        mBtnOne.visibility=View.VISIBLE
        mBtnOne.text = text
        mBtnOne.setOnClickListener(listener)
    }

    fun setButtonTwo(@NonNull text:String,listener: View.OnClickListener?){
        mBtnTwo.visibility=View.VISIBLE
        mBtnTwo.text = text
        mBtnTwo.setOnClickListener(listener)
    }

}