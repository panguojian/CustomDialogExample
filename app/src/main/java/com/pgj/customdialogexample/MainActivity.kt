package com.pgj.customdialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Toast
import com.pgj.customdialogexample.dialog.CustomTipDialog
import com.pgj.customdialogexample.dialog.UpdateTipDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openDialog1.setOnClickListener {
            val customTipDialog=CustomTipDialog(this)
            customTipDialog.setTitle("检测到新版本")
            val s=Html.fromHtml("1：优化体验<br>2：增加服务器例程<br><br>版本：10.0.0325<br>大小：10.1MB")
            customTipDialog.setMessage(s)
            customTipDialog.setButtonOne("立即更新", View.OnClickListener {

            })
            customTipDialog.show()
        }

        openDialog2.setOnClickListener {
            val customTipDialog=CustomTipDialog(this)
            customTipDialog.setTitle("提示")
            customTipDialog.setMessage("当前版本为1.0.01，已是最新版本")
            customTipDialog.setButtonOne("返回",View.OnClickListener {

            })
            customTipDialog.show()
        }


        openProgressDialog1.setOnClickListener {
            val updateTipDialog=UpdateTipDialog(this)
            updateTipDialog.setTitle("更新中")
            val s=Html.fromHtml("1：优化体验<br>2：增加服务器例程")
            updateTipDialog.setTopMessage(s)
            updateTipDialog.show()
            thread {
                for (i in 0..100){
                    updateTipDialog.setProgress(i)
                    Thread.sleep(100)
                }
            }

        }

        openProgressDialog2.setOnClickListener {
            val updateTipDialog=UpdateTipDialog(this)
            updateTipDialog.setTitle("提示")
            updateTipDialog.setBottomMessage("正在查询更新，请稍等")
            updateTipDialog.show()
            thread {
                for (i in 0..100){
                    updateTipDialog.setProgress(i)
                    Thread.sleep(100)
                }
            }

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