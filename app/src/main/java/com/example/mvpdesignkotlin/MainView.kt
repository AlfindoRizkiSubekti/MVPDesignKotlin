package com.example.mvpdesignkotlin

import android.widget.Button
import android.widget.EditText

interface MainView {


    // method utk menampilkan pesan toast
        fun showMessage(message:String)

        // method utk menampilkan data yang telah diproses pada presenter
        fun showData(data:String)

        // method utk clear edittext
        fun clearField()

    }