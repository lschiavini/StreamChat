package com.plcoding.streamchatapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.plcoding.streamchatapp.databinding.FragmentChannelBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChannelFragment : BindingFragment<FragmentChannelBinding>(){

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentChannelBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}