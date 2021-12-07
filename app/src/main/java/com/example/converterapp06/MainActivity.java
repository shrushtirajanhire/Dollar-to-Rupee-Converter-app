package com.example.converterapp06;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText1);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(),"Convert Button is Clicked",Toast.LENGTH_SHORT).show();
                 String s = editText.getText().toString();
                 int dol = Integer.parseInt(s);
                 double  rs= 75.42 * dol;
                 textView.setText("The correponding value in rupees is :  " + rs);
             }
         });
    }
}