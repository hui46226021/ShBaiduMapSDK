package com.sh.zsh.code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @InjectView(R.id.map_button)
    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.inject(this);
    }
    @OnClick(R.id.map_button)
    void mapButton(){
        startActivity(new Intent(this,MapActivity.class));
    }
    @OnClick(R.id.redar_button)
    void redarButton(){
        startActivity(new Intent(this,RadarActivity.class));
    }
    @OnClick(R.id.nva_button)
    void navButton(){
        startActivity(new Intent(this,NavigationActivity.class));
    }
}
