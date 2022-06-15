package com.yuetu.shentu.flutternativetest

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

class DefaultFlutterActivity : FlutterActivity() {

    companion object {
        fun withCachedEngine(cachedEngineId: String = COMMON_FLUTTER_ENGINE): CachedEngineIntentBuilder {
            return CachedEngineIntentBuilder(
                DefaultFlutterActivity::class.java,
                cachedEngineId
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}