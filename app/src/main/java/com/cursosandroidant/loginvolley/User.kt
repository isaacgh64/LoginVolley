package com.cursosandroidant.loginvolley

/****
 * Project: Login API REST
 * From: com.cursosandroidant.loginapirest
 * Created by Alain Nicolás Tello on 07/02/22 at 1:10 PM
 * Course: Android Practical with Kotlin from zero.
 * Only on: https://www.udemy.com/course/kotlin-intensivo/
 * All rights reserved 2022.
 * My website: www.alainnicolastello.com
 * All my Courses(Only on Udemy):
 * https://www.udemy.com/user/alain-nicolas-tello/
 ***/
data class User(
    val id: Long,
    val email: String,
    val first_name: String,
    val last_name: String,
    val avatar: String){

    fun getFullName(): String = "$first_name $last_name"

}
