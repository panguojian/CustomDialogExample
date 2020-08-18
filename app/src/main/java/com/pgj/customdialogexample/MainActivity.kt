package com.pgj.customdialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pgj.customdialogexample.dialog.CustomTipDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openDialog.setOnClickListener {
            val customTipDialog=CustomTipDialog(this)
            customTipDialog.title("提示")
            customTipDialog.message("当前版本为1.0.01，已是最新版本")
            customTipDialog.setButtonOne("返回", View.OnClickListener {

            })
            customTipDialog.show()
        }




        thread {
            for (i in 0..100){
                progressBar1.progress=i
                runOnUiThread {
                    tv_progress1.text="$i%"
                }
                Thread.sleep(100)
            }
        }

        thread {
            for (i in 0..100){
                progressBar2.progress=i
                runOnUiThread {
                    tv_progress2.text="$i%"
                }
                Thread.sleep(200)
            }
        }

        thread {
            for (i in 0..100){
                seekBar.progress=i
                Thread.sleep(100)
            }
        }

    }
}