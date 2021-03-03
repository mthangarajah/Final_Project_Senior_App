package com.example.final_project_senior_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class question4 extends AppCompatActivity {
    TextView date1;
    String dateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        TextView textView=findViewById(R.id.date1);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMM-dd-yyyy h:mm a");
        dateTime = simpleDateFormat.format(calendar.getTime());
        textView.setText(dateTime);
    }

    public void sendMessageEN(View view) {
        Intent intent = new Intent(this, question5_even.class);
        startActivity(intent);
    }
}