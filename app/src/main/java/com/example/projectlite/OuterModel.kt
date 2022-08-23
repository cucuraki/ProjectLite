package com.example.projectlite

private var identity = 0
data class OuterModel(val time: String, val transactions: List<InnerModel>){
    data class InnerModel( val title: String, val drawable: Int, val amount: Double){
        val id = identity
        init{
            identity++
        }
    }
}
