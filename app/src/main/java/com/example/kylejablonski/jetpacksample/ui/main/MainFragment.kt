package com.example.kylejablonski.jetpacksample.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.kylejablonski.jetpacksample.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(), DataAdapter.Listener {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        rvData.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)
        rvData.addItemDecoration(DividerItemDecoration(activity!!, DividerItemDecoration.VERTICAL))
        rvData.adapter = DataAdapter(activity!!, viewModel.data.value!!, this)

    }

    override fun onClick(item: String) {
        val bundle = Bundle()
        bundle.putString("Data", item)
        NavHostFragment.findNavController(this).navigate(R.id.action_mainFragment_to_detailFragment, bundle)
    }
}
