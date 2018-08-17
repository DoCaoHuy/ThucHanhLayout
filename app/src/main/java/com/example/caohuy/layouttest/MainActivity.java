package com.example.caohuy.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText  txtsoA, txtsoB;
    private TextView txtKetQua;
    private Button btnTong, btnHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap01);

        txtsoA=(EditText)findViewById(R.id.txtSoA);
        txtsoB=(EditText)findViewById(R.id.txtSoB);
        txtKetQua=(TextView) findViewById(R.id.txtKetQua);
        btnTong=(Button)findViewById(R.id.btn1);
        btnHieu=(Button)findViewById(R.id.btn2);

        btnTong.setOnClickListener(this);
        btnHieu.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                int tong=Integer.parseInt(txtsoA.getText().toString())+Integer.parseInt(txtsoB.getText().toString());
                txtKetQua.setText(tong+"");
                break;
            case R.id.btn2: txtKetQua.setText("Hieu 2 so");
                break;
        }
    }
}
