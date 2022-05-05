package com.jonathancabrera.dummydictionary.repository

import androidx.lifecycle.MutableLiveData
import com.jonathancabrera.dummydictionary.data.model.Word
import com.jonathancabrera.dummydictionary.data.model.dao.AntonymDao
import com.jonathancabrera.dummydictionary.data.model.dao.SynonymDao
import com.jonathancabrera.dummydictionary.data.model.dao.WordDao

class DictionaryRepository(
    private val wordDoa: WordDao,
    val synonymDao: SynonymDao,
    val antonymDao: AntonymDao

) {
    fun getAllWords() = wordDoa.getAllWords()

    suspend fun addWord(word: Word) {
        wordDoa.insertWord(word)
    }
}