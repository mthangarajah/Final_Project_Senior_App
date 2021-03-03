package com.example.final_project_senior_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class question2 extends AppCompatActivity {
    TextView date;
    String dateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        TextView textView=findViewById(R.id.date);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMM-dd-yyyy h:mm a");
        dateTime = simpleDateFormat.format(calendar.getTime());
        textView.setText(dateTime);
    }

    public void sendMessageAN(View view) {
        Intent intent = new Intent(this, question3.class);
        startActivity(intent);
    }


}