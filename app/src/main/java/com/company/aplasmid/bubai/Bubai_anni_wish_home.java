package com.company.aplasmid.bubai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Sayed Siam on 1/12/2018.
 */

public class Bubai_anni_wish_home extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String a= "anni_wish";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubai_anni_wish_home);

        ListView anni_wish_list_view = findViewById(R.id.anniListView);
        anni_wish_list_view.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> l, View v, int position, long id) {

        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        // Then you start a new Activity via Intent
        Intent intent = new Intent();
        intent.setClass(this, Bubai_text_editor.class);
        intent.putExtra("position", position);
        // Or / And
        intent.putExtra("id", id);
        intent.putExtra("ClassID",a);
        startActivity(intent);

    }
}
