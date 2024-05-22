package com.example.countermvvm.counterusingmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModal(): ViewModel() {
    private val _repository : CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    //Expose the count as an immutable state
    val count : MutableState<Int> = _count

    fun incriment(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decriment(){
        _repository.decrementCount()
        _count.value = _repository.getCounter().count
    }
}