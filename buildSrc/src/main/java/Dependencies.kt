object Versions {
    const val compileSdkVersion = 29
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val buildToolsVersion = "29.0.2"
    const val versionCode = 100
    const val versionName = "1.0.0"
}

object Module {
    const val isDebug = true
    const val isLog = true
    const val isModuleRun = false
}

object AppId {
    const val app = "com.zlzw.ttmb.test"
    const val home = "com.zlzw.home"
    const val me = "com.zlzw.me"
    const val login = "com.zlzw.login"
}

object Url {
    const val debugUrl = "https://gank.io/api/v2/"
    const val releaseUrl = "https://gank.io/api/v2/"
}

object Libs {
     val dependencies = arrayOf(
        "com.github.oooo7777777:VLibrary:3.3.1",//VLibrary
        "com.github.hackware1993:MagicIndicator:1.7.0",//指示器//
        "com.didi.drouter:drouter-api:1.0.4"//drouter

    )

//    const val dependenciesKapt = arrayOf(
//        "com.alibaba:arouter-compiler:1.5.1"//arouter
//    )
}

