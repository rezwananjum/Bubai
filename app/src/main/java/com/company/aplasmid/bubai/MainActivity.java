package com.company.aplasmid.bubai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button anniwish,lvwish,brthwish,brkwish,mrgwish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anniwish = findViewById(R.id.anniwish);
        anniwish.setOnClickListener(this);

        lvwish = findViewById(R.id.lvwish);
        lvwish.setOnClickListener(this);

        brthwish = findViewById(R.id.brthwish);
        brthwish.setOnClickListener(this);

        brkwish = findViewById(R.id.brkwish);
        brkwish.setOnClickListener(this);

        mrgwish = findViewById(R.id.mrgwish);
        mrgwish.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.anniwish){
            Intent i = new Intent(this,Bubai_anni_wish_home.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.lvwish){
            Intent j = new Intent(this,Bubai_love_wish_home.class);
            startActivity(j);
        }
        else if (v.getId()==R.id.brthwish){
            Intent z = new Intent(this,Bubai_birthday_wish_home.class);
            startActivity(z);
        }
        else if(v.getId()== R.id.brkwish){
            Intent k = new Intent(this, Bubai_breakup_wish_home.class);
            startActivity(k);
        }
        else if(v.getId()==R.id.mrgwish){
            Intent l = new Intent(this, Bubai_marriage_wish_home.class);
            startActivity(l);

        }

    }
}