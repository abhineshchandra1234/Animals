package com.abhinesh.animals.viewmodel

import androidx.lifecycle.MutableLiveData
import com.abhinesh.animals.model.Animal

class ListViewModel {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {

    }
}