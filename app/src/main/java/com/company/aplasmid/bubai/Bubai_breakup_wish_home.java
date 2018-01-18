package com.company.aplasmid.bubai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Sayed Siam on 1/12/2018.
 */

public class Bubai_breakup_wish_home extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String a = "breakup_wish";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubai_breakup_wish_home);
        ListView breakUp_wish_list = findViewById(R.id.brkupListView);
        breakUp_wish_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
        Intent intent= new Intent();
        intent.setClass(this,Bubai_text_editor.class);
        intent.putExtra("position",position);

        intent.putExtra("id", id);
        intent.putExtra("ClassID",a);
        startActivity(intent);
    }
}
