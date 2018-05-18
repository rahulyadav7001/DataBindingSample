package com.ryandro.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ryandro.databindingsample.databinding.ActivityMainBinding;
import com.ryandro.databindingsample.dataobjects.UserDO;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserDO userDO = new UserDO("Charry", "Martin");
        binding.setUserDO(userDO);

    }

  /*  public void onButtonClick() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, UserActivity.class);
        intent.putExtra("Name_ID", "Test");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }*/
     public class myClickHandler{
         public void onButtonClick(View view) {
             Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
             Intent intent = new Intent(MainActivity.this, UserActivity.class);
             intent.putExtra("Name_ID", "Test");
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             startActivity(intent);
         }
     }
}
