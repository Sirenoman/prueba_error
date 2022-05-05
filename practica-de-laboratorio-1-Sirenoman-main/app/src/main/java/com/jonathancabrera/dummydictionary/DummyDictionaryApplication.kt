package com.jonathancabrera.dummydictionary

import android.app.Application
import com.jonathancabrera.dummydictionary.data.model.DummyDictionaryDatabase
import com.jonathancabrera.dummydictionary.repository.DictionaryRepository

class DummyDictionaryApplication : Application() {
    val dataBase by lazy {
        DummyDictionaryDatabase.getInstance(this)
    }

    fun getDictionaryRepository() = with(dataBase) {
        DictionaryRepository(wordDao(), synonymDao(), antonymDao())
    }
}