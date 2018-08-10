package com.dev.archmvvm.viewmodels

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.dev.archmvvm.model.SongModel

class SongViewModel : ViewModel() {

    val songName = ObservableField<String>()
    val songTitle = ObservableField<String>()

    private val songModel = SongModel()

    init {
        val songs = songModel.getSongs()
        songName.set(songs[0].name)
        songTitle.set(songs[0].title)

    }

    fun onTextViewClicked(view: View, name: String) {

        Log.d("", "Clicked $name")
    }

}