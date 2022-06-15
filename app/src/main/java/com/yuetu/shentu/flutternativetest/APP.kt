package com.yuetu.shentu.flutternativetest

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

const val COMMON_FLUTTER_ENGINE = "DEFAULT_FLUTTER_ENGINE"

class APP : Application() {


    override fun onCreate() {
        super.onCreate()
        //预热flutter
        preInitFlutterEngine()
    }

    private fun preInitFlutterEngine() {
        val engine = FlutterEngine(applicationContext).apply {
            // 初始路由
            // navigationChannel.setInitialRoute("")
            dartExecutor.executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        }
        FlutterEngineCache.getInstance().put(COMMON_FLUTTER_ENGINE, engine)

    }

}