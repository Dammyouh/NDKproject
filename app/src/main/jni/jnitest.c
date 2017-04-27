#include"com_example_ndkproject_NdkJniUtils.h"
JNIEXPORT jstring JNICALL Java_com_exampel_ndkproject_NdkJniUtils_getCLanguageString
(JNIEnv*env,jobject obj){
   return(*env)->NewStringUTF(env,"This is a test for Android Studio NDK JNI developer!");
}
