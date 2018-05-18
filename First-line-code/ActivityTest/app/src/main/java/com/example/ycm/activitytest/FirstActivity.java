package com.example.ycm.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
public class FirstActivity extends BaseActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
                default:
        }
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("FirstActivity", "onRestart");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity", "Task id is"+getTaskId());
        setContentView(R.layout.first_layout);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
            }
        });
       /* button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
                //finish();
                //Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                //Intent intent=new Intent("com.example.ycm.activitytest.ACTION_START");
                //intent.addCategory("com.example.ycm.activitytest.MY_CATEGORY");
                //Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://wwww.baidu.com"));
                //Intent intent=new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:10086"));
                //String data="Hello SecondActivity";
                //Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //startActivity(intent);
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("param1","data1");
                intent.putExtra("param2","data2");
                startActivityForResult(intent,1);
            }
            }); */
        }
    }
