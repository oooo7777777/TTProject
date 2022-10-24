object Versions {
    const val compileSdkVersion = 33
    const val minSdkVersion = 21
    const val targetSdkVersion = 33
    const val versionCode = 100
    const val versionName = "1.0.0"
}

object MyModule {
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
        "com.github.oooo7777777:VLibrary:3.8.0",//VLibrary
        "com.github.hackware1993:MagicIndicator:1.7.0",//指示器//
        "io.github.didi:drouter-api:2.1.3",//drouter
        "com.github.JessYanCoding:AndroidAutoSize:v1.2.1"//屏幕自适应
    )

//    const val dependenciesKapt = arrayOf(
//        "com.alibaba:arouter-compiler:1.5.1"//arouter
//    )
}

