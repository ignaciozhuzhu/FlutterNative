package com.yuetu.shentu.flutternativetest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterActivityLaunchConfigs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btn_go_to_flutter_page).setOnClickListener { v: View? ->

            val intent = DefaultFlutterActivity.withCachedEngine()
                .backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.opaque)
                .build(this@MainActivity)

            startActivity(intent)
        }
    }
}