package com.example.mvpdesignkotlin

interface MainPresenter {
    //untuk menambahkan data
    fun addData(firstName:String, lastName:String)
    //untuk merespon data
    fun loadData()
}