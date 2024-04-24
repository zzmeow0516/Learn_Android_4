package com.example.learn_android_4

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}

    //自定义控件
class TitleLayout (context: Context, attr: AttributeSet): LinearLayout(context, attr) {
    //init代码块在类的实例被创建时执行，类似于java构造函数代码块
    init {
        //LayoutInflater的from()方法可以构建出一个LayoutInflater对象
        //调用inflate()方法就可以动态加载一个布局文件
        //第一个参数是要加载的布局文件的id，这里我们传入R.layout.title；
        //第二个参数是给加载好的布局再添加一个父布局，这里我们想要指定为TitleLayout，于是直接传入this。
        LayoutInflater.from(context).inflate(R.layout.title,this)
    }
}