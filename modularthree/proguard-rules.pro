# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/yuanshuobin/android-sdk-macosx/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-ignorewarnings
-target 1.6
-printmapping mapping.txt
-useuniqueclassmembernames
-keepattributes Exceptions,InnerClasses,...
-renamesourcefileattribute SourceFile
-verbose

-keep public class * extends android.app.Activity

-keep public class * extends android.app.Application

-keepclassmembers class * extends android.app.Activity {
    public void *(android.view.View);
}




-keepclasseswithmembers class * {
    public <init>(int,int);
}

-keepclasseswithmembers,allowshrinking class * {
    private native <methods>;
    public native <methods>;
}

# Keep - Library. Keep all public and protected classes, fields, and methods.
-keep public class * {
    public protected <fields>;
    public protected <methods>;
}

# Also keep - Enumerations. Keep the special static methods that are required in
# enumeration classes.
-keepclassmembers enum  * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep names - Native method names. Keep all native class/method names.
-keepclasseswithmembers,allowshrinking class *,* {
    native <methods>;
}

# Keep names - _class method names. Keep all .class method names. This may be
# useful for libraries that will be obfuscated again with different obfuscators.
-keepclassmembers,allowshrinking class * {
    java.lang.Class class$(java.lang.String);
    java.lang.Class class$(java.lang.String,boolean);
}

