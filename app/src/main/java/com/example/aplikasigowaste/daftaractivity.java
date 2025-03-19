package com.example.aplikasigowaste;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;



public class daftaractivity extends AppCompatActivity {

    private EditText etTanggalLahir;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarlayout);

        etTanggalLahir = findViewById(R.id.etTanggalLahir);

        etTanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });
    }

    private void showDatePicker() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, yearSelected, monthSelected, dayOfMonth) -> {
                    String tanggal = dayOfMonth + "/" + (monthSelected + 1) + "/" + yearSelected;
                    etTanggalLahir.setText(tanggal);
                }, year, month, day);
        datePickerDialog.show();
    }
}


