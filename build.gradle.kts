// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}implementation "androidx.navigation:navigation-fragment-ktx:2.3.5"
implementation "androidx.navigation:navigation-ui-ktx:2.3.5"
implementation 'com.google.android.material:material:1.3.0'
