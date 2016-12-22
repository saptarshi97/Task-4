package saptarshi.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.NAME);
        String message2 = intent.getStringExtra(MainActivity.AGE);
        TextView textView1 = (TextView) findViewById(R.id.name);
        TextView textView2 = (TextView) findViewById(R.id.age);
        textView1.setText(message1);
        textView2.setText(message2);

    }
}
