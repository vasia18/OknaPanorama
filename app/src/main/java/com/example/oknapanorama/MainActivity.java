package com.example.oknapanorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Определяем кнопку (ImageView) это лого.
        ImageView logoImage = findViewById(R.id.logoImage);
        logoImage.setOnClickListener(this);
    }

    // Пишем переход на другое активити (MainActivityTwo)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logoImage:
                //Стартуем и переходим на другое активити (MainActivityTwo)
                Intent intent = new Intent(this, SliderActivity.class);
                //Стартуем
                startActivity(intent);

                break;
            default:
                break;
        }

    }
}
