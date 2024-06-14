// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
//    ext {
//        compose_version = ""
//    }
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    //id("com.google.devtools.ksp") version "1.9.21-1.0.15" apply false
}