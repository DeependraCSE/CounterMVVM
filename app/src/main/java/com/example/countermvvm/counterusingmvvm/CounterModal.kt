package com.example.countermvvm.counterusingmvvm

data class CounterModal(var count : Int)

class CounterRepository{
    private val _counter = CounterModal(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCount(){
        _counter.count--
    }
}