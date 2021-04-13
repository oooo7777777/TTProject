object Versions {
    val compileSdkVersion = 29
    val minSdkVersion = 21
    val targetSdkVersion = 29
    val buildToolsVersion = "29.0.2"
    val versionCode = 100
    val versionName = "1.0.0"
}

object Module {
    val isDebug = true
    val isLog = true
    val isModuleRun = false
}

object AppId {
    val app = "com.zlzw.ttmb.test"
    val home = "com.zlzw.home"
    val me = "com.zlzw.me"
    val login = "com.zlzw.login"
}

object Url {
    val debugUrl = "https://gank.io/api/v2/"
    val releaseUrl = "https://gank.io/api/v2/"
}

object Libs {
    var dependencies = arrayOf(
        "com.github.oooo7777777:VLibrary:3.0.0",//VLibrary
        "com.github.hackware1993:MagicIndicator:1.7.0",//指示器//
        "com.alibaba:arouter-api:1.5.1"//arouter
    )

    var dependenciesKapt = arrayOf(
        "com.alibaba:arouter-compiler:1.5.1"//arouter
    )
}

