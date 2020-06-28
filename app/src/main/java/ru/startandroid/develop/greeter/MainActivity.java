package ru.startandroid.develop.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonOnClick(View v){
        TextView tex = (TextView) findViewById(R.id.textNew);
        EditText text = (EditText) findViewById(R.id.editText);
        value = text.getText().toString();
        tex.setText("Hello, " + value);

    }
}