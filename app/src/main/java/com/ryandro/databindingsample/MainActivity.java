package com.ryandro.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.media.AudioRecord;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ryandro.databindingsample.databinding.ActivityMainBinding;
import com.ryandro.databindingsample.dataobjects.UserDO;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserDO userDO = new UserDO("Charry","Martin");
        binding.setUserDO(userDO);
    }
}
