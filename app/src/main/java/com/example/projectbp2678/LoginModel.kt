package com.example.projectbp2678

class LoginModel {
    //variael
    var username = ""
    var password = ""
    //method/func
    fun loginCek():Boolean{
        if(username.equals("Faiq") && password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}