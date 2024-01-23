package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout=inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.CTL1));
                TextView tv=(TextView) layout.findViewById(R.id.textView1);
                tv.setText("Custom Toast Notification");
                Toast toast=new Toast(getApplicationContext());
               // toast.setGravity(Gravity.CENTRAL_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}