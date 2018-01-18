package com.company.aplasmid.bubai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Sayed Siam on 1/12/2018.
 */

public class Bubai_text_editor extends AppCompatActivity implements View.OnClickListener {

    public EditText Bubai_text_editor;
    Button conti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubai_text_editor);
        conti = findViewById(R.id.txtedtr_continue_btn);
        conti.setOnClickListener(this);

        Intent in = getIntent();
        String k = in.getStringExtra("ClassID");



        int position = in.getIntExtra("position",0);
        // Here we turn your string.xml in an array
        String[] anni_wish = getResources().getStringArray(R.array.anni_wish);
        String[] birth_wish = getResources().getStringArray(R.array.birth_wish);
        String[] love_wish = getResources().getStringArray(R.array.lv_wish);
        String[] breakup_wish = getResources().getStringArray(R.array.brk_wish);
        String[] marriage_wish = getResources().getStringArray(R.array.mrg_wish);
        Bubai_text_editor = findViewById(R.id.txtedtr_edit_text);

        if("anni_wish".equals(k)){
            Log.i("status","paisi tore");
            Bubai_text_editor.setText(anni_wish[position]);

        }
        if("birthday_wish".equals(k)){
            Bubai_text_editor.setText(birth_wish[position]);
        }
        if("breakup_wish".equals(k)){
            Bubai_text_editor.setText(breakup_wish[position]);
        }
        if("love_wish".equals(k)){
            Bubai_text_editor.setText(love_wish[position]);

        }
        if("marriage_wish".equals(k)){
            Bubai_text_editor.setText(marriage_wish[position]);
        }

        else
        {
            Log.i("status","pai nai!!");
        }

       // TextView myTextView = (TextView) findViewById(R.id.my_textview);
       // myTextView.setText(myKeys[position])
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.txtedtr_continue_btn){


        }

    }
}
