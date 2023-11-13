package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button fahrenheitbtn , celsiusbtn;
    EditText  fahrenheittext,celciustext;
    TextView fahrenheitresult,celsiusresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.mainscreen));

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fahrenheitbtn = findViewById(R.id.fahrenheitbtn);
        celsiusbtn = findViewById(R.id.celsiusbtn);
        fahrenheittext = findViewById(R.id.fahrenheittext);
        celciustext = findViewById(R.id.celsiustext);
        fahrenheitresult = findViewById(R.id.fahrenheitresult);
        celsiusresult = findViewById(R.id.celsiusresult);


        fahrenheitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float f = new Float(fahrenheittext.getText().toString());
                Float resultf = (f-32)*(5/9f);
                fahrenheitresult.setText(resultf.toString()+" C");
            }
        });
        celsiusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float c = new Float(celciustext.getText().toString());
                Float resultc = (c*(9/5f))+32;
                celsiusresult.setText(resultc.toString()+" F");

            }
        });

    }
}