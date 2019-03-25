package com.example.oknapanorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_registration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        //Определяем кнопку для нажатия (это кнопка с tv_registration)
        TextView tv_registration = findViewById(R.id.tv_registration);
        tv_registration.setOnClickListener(this);

    }

    //Теперь в методе onClick пишем переход на другое Activity.
    //В нашем случае это MainActivityFree
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_registration:
                Intent intent = new Intent(this, MainActivityFree.class);
                startActivity(intent);

                break;
            default:
                break;
        }
    }
}
