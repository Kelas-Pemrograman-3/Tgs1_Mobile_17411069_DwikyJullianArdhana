package com.dwiky.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNpm;
    TextView txtNama;
    TextView txtAlamat;
    TextView txtProdi;
    EditText edtNpm;
    EditText edtNama;
    EditText edtAlamat;
    EditText edtProdi;
    Button btnSubmit;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNpm  = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);
        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtProdi = (TextView) findViewById(R.id.txtProdi);
        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtAlamat  = (EditText) findViewById(R.id.edtAlamat);
        edtProdi  = (EditText) findViewById(R.id.edtProdi);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strProdi = edtProdi.getText().toString();

                txtNpm.setText(strNpm);
                txtNama.setText(strNama);
                txtAlamat.setText(strAlamat);
                txtProdi.setText(strProdi);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNpm.setText("");
                txtNama.setText("");
                txtAlamat.setText("");
                txtProdi.setText("");
                edtNpm.setText("");
                edtNama.setText("");
                edtAlamat.setText("");
                edtProdi.setText("");
                edtNpm.requestFocus();
            }
        });
    }
}
