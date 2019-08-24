package com.burakocak.githubrepo.view.ui;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.burakocak.githubrepo.R;
import com.burakocak.githubrepo.databinding.ActivityMainBinding;
import com.burakocak.githubrepo.view.base.BaseActivity;
import com.burakocak.githubrepo.viewmodel.MainViewModel;
import com.burakocak.todolist.model.EventbusObject;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        viewModel = ViewModelProviders.of(MainActivity.this).get(MainViewModel.class);
    }


    @Override
    public void onCustomEvent(EventbusObject eventbusObject) {

    }
}
