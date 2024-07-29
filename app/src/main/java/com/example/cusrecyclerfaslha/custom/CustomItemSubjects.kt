package com.example.cusrecyclerfaslha.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.cusrecyclerfaslha.databinding.ItemSubjectsBinding

class CustomItemSubjects(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private var binding =
        ItemSubjectsBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)


    }
}