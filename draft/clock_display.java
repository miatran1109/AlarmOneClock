package com.example.maalarm.finalalarm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class clock_display extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Calendar calendar = Calendar.getInstance();
            String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

            TextView textViewDate = findViewById(R.id.text_view_date);
            textViewDate.setText(currentDate);
        }
    }

