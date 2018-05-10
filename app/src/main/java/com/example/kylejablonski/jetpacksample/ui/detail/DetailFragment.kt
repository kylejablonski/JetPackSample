package com.example.kylejablonski.jetpacksample.ui.detail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kylejablonski.jetpacksample.R
import kotlinx.android.synthetic.main.detail_fragment.*

class DetailFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments!!.getString("Data")
        title.text = text
        description.text = "Hello $text! Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi neque justo, pulvinar sed vestibulum id, pretium sit amet neque. Ut odio felis, lacinia nec scelerisque ut, maximus sed urna. Nam ac malesuada neque. Phasellus non sapien ut purus semper consectetur. Quisque a diam dictum, lobortis dui a, finibus ante. Sed auctor tortor in massa elementum, ac facilisis quam mattis. Nulla euismod metus ut est fermentum, ac lobortis nunc aliquam. Donec consequat nisl vel posuere ullamcorper. Curabitur lacinia dolor bibendum, sagittis lacus eu, euismod ex. Curabitur pretium fringilla magna, nec semper mauris molestie et. In hac habitasse platea dictumst. Donec vestibulum malesuada augue, non molestie lorem tincidunt ac. Mauris laoreet ex vel elit condimentum, eget ullamcorper nibh mattis. Duis at laoreet sem. Sed suscipit, risus sit amet dapibus mattis, ex nunc maximus elit, vitae pharetra arcu metus sit amet orci."
    }
}