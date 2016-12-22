package saptarshi.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String AGE = "age";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendInfo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_name);
        EditText editText2 = (EditText) findViewById(R.id.edit_age);
        intent.putExtra(NAME,editText1.getText().toString());
        intent.putExtra(AGE,editText2.getText().toString());
        startActivity(intent);
    }
}