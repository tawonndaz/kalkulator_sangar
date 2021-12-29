package com.jimmy.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> resultAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList());
        ListView resultLisView = (ListView) findViewById(R.id.resultListView);
        resultLisView.setAdapter(resultAdapter);

    }
    public void calculatebtn(View v) {
        EditText angkapertama = (EditText) findViewById(R.id.angka1);
        EditText edtplain1 = (EditText) findViewById(R.id.edtplain1);

        int angka1 = Integer.parseInt(angkapertama.getText().toString());
        int angka2 = Integer.parseInt(edtplain1.getText().toString());

        RadioButton tambah = (RadioButton) findViewById(R.id.radiotambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.radiokurang);
        RadioButton kali = (RadioButton) findViewById(R.id.radiokali);
        RadioButton bagi = (RadioButton) findViewById(R.id.radiobagi);

        int Hasil = 0;

        if(tambah.isChecked()) {
            Hasil = angka1 + angka2;
        }else if(kurang.isChecked()) {
            Hasil = angka1 - angka2;
        }else if(kali.isChecked()) {
            Hasil = angka1 * angka2;
        }else if(bagi.isChecked()) {
            Hasil = angka1 / angka2;
        }
        TextView hasil = (TextView) findViewById(R.id.hasiljwb);
        hasil.setText("Hasil :" + Hasil);
        resultAdapter.add("Hasil Sebelumnya :" + Hasil);
    }
}