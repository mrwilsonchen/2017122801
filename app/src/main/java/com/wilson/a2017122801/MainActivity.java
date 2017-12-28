package com.wilson.a2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click1(View v)
    {
        TextView tv2,tv3;
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        // ed1 = (EditText) findViewById(R.id.editText);
        //tv.setText("Hello World");
        //String str = S1.getText().toString();
        //tv.setText(ed1.getText().toString()+ed2.getText().toString());
        //String sum = parseInt(ed1.getText().toString())+parseInt(ed2.getText().toString());

        tv3.setText(tv2.getText().toString()+"\n"+"Good Morning, Wilson!");
        //tv.setText("Good Morning!");

        //tv.setText(sum);
    }
    public void click2(View v)
    {
        Intent it;
        it = new Intent(MainActivity.this,Main2Activity.class);
        it.putExtra(name='data',value='Wilson');
        startActivity(it);
    }

}
