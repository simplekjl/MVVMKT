package com.dev.archmvvm.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dev.archmvvm.R
import com.dev.archmvvm.databinding.ActivityMainBinding
import com.dev.archmvvm.viewmodels.SongViewModel

class MainActivity : AppCompatActivity() {

    private val songViewModel: SongViewModel by lazy {
        ViewModelProviders.of(this).get(SongViewModel::class.java)
    }

    private val mBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.songViewModel = songViewModel
    }


}
