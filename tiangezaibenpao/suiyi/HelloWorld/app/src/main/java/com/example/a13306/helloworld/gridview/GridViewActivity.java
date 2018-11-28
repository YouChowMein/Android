package com.example.a13306.helloworld.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.a13306.helloworld.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv=findViewById(R.id.gv);
        mGv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
    }
}
