package com.example.cusrecyclerfaslha.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ItemRecyclerBinding

class CustomItemFasl(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private var binding =
        ItemRecyclerBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
        initalize(attrs)


    }

    private fun initalize(attrs: AttributeSet) {

        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomItemFasl)
        val title = typedArray.getString(R.styleable.CustomItemFasl_title)
        binding.textFasl.text = title

        val imgResId = typedArray.getResourceId(R.styleable.CustomItemFasl_img, R.drawable.img1)
        binding.imageFasl.setImageResource(imgResId)

        typedArray.recycle()
    }

}

