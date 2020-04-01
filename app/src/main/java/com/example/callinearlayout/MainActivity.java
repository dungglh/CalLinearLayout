package com.example.callinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt;
    private TextView tv;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;

    private Button btnce;
    private Button btnc;
    private Button btnnhan;
    private Button btnchia;
    private Button btncong;
    private Button btntru;
    private Button btnbang;
    private Button btncham;
    private Button btnchuyen;
    private Button btnphantram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setEventClickViewṣ̣();
    }

    public void initWidgets(){

        edt = findViewById(R.id.edt);
        tv = findViewById(R.id.tv);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4 );
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        btnce = findViewById(R.id.btnce);
        btnc = findViewById(R.id.btnc);
        btncham = findViewById(R.id.btncham);
        btnnhan = findViewById(R.id.btnnhan);
        btnchia = findViewById(R.id.btnchia);
        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnbang = findViewById(R.id.btnbang);
        btnchuyen = findViewById(R.id.btnchuyen);
        btnphantram = findViewById(R.id.btnpt);
    }
    public void setEventClickViewṣ̣(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnce.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btncham.setOnClickListener(this);
        btnnhan.setOnClickListener(this);
        btnchia.setOnClickListener(this);
        btncong.setOnClickListener(this);
        btntru.setOnClickListener(this);
        btnbang.setOnClickListener(this);
        btnchuyen.setOnClickListener(this);
        btnphantram.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.btn0:
                edt.append("0");
                break;
            case R.id.btn1:
                edt.append("1");
                break;
            case R.id.btn2:
                edt.append("2");
                break;
            case R.id.btn3:
                edt.append("3");
                break;
            case R.id.btn4:
                edt.append("4");
                break;
            case R.id.btn5:
                edt.append("5");
                break;
            case R.id.btn6:
                edt.append("6");
                break;
            case R.id.btn7:
                edt.append("7");
                break;
            case R.id.btn8:
                edt.append("8");
                break;
            case R.id.btn9:
                edt.append("9");
                break;
            case R.id.btnc:
                edt.append("");
                break;
            case R.id.btnce:
                BaseInputConnection textFieldInputConnetion = new BaseInputConnection(edt, true);
                textFieldInputConnetion.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btncham:
                edt.append(".");
                break;
            case R.id.btnnhan:
                edt.append("x");
                break;
            case R.id.btnchia:
                edt.append(":");
                break;
            case R.id.btncong:
                edt.append("+");
                break;
            case R.id.btntru:
                edt.append("-");
                break;
            case R.id.btnbang:

                break;
            case R.id.btnchuyen:
                break;
            case R.id.btnpt:
                edt.append("%");
                break;
        }
    }

}
