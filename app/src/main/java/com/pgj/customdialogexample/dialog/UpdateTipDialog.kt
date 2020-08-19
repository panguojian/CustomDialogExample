package com.pgj.customdialogexample.dialog

import android.app.Dialog
import android.content.Context
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.pgj.customdialogexample.R
import org.jetbrains.annotations.NotNull

/**
 * Created by pgj on 2020-8-19
 **/
class UpdateTipDialog(context:Context):Dialog(context, R.style.DialogTheme) {
    private val mTvTitle: TextView
    private val mTopMessage: TextView
    private val mBottomMessage: TextView
    private val mProgressBar: ProgressBar

    init {
        val view= LayoutInflater.from(context).inflate(R.layout.dialog_tips_update_style,null)
        mTvTitle=view.findViewById(R.id.dialog_update_title)
        mTopMessage=view.findViewById(R.id.dialog_update_top_message)
        mBottomMessage=view.findViewById(R.id.dialog_update_bottom_message)
        mProgressBar=view.findViewById(R.id.dialog_update_progress)
        setContentView(view)
    }

    fun setTitle(@NotNull title:String){
        mTvTitle.text=title
    }

    fun setTopMessage(@NotNull message:String){
        mTopMessage.visibility=View.VISIBLE
        mTopMessage.text=message
    }

    fun setTopMessage(@NotNull message:Spanned){
        mTopMessage.visibility=View.VISIBLE
        mTopMessage.text=message
    }

    fun setBottomMessage(@NotNull message:String){
        mBottomMessage.visibility=View.VISIBLE
        mBottomMessage.text=message
    }

    fun setProgress(@NotNull progress:Int){
        mProgressBar.progress=progress
    }


}