package com.example.ndkproject;


public class NdkJniUtils {
    public native String getCLanguageString();
    static{
        System.out.println("ndkproject_NdkJniUtils");
    }
}
