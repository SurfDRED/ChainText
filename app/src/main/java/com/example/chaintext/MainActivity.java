package com.example.chaintext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.*;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    int mDischarge = 0;
    String mDisplay ="";
    private TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        txtDisplay = findViewById(R.id.txtDisplay);
        Button mBtnClear = findViewById(R.id.btnClear);
        Button mBtnPm = findViewById(R.id.btnPm);
        Button mBtnPercent = findViewById(R.id.btnPercent);
        Button mBtnSeven = findViewById(R.id.btnSeven);
        Button mBtnEight = findViewById(R.id.btnEight);
        Button mBtnNine = findViewById(R.id.btnNine);
        Button mBtnFour = findViewById(R.id.btnFour);
        Button mBtnFive = findViewById(R.id.btnFive);
        Button mBtnSix = findViewById(R.id.btnSix);
        Button mBtnOne = findViewById(R.id.btnOne);
        Button mBtnTwo = findViewById(R.id.btnTwo);
        Button mBtnThree = findViewById(R.id.btnThree);
        Button mBtnZero = findViewById(R.id.btnZero);
        Button mBtnPoint = findViewById(R.id.btnPoint);
        Button mBtnShare = findViewById(R.id.btnShare);
        Button mBtnMultiply = findViewById(R.id.btnMultiply);
        Button mBtnMinus = findViewById(R.id.btnMinus);
        Button mBtnPlus = findViewById(R.id.btnPlus);
        Button mBtnEqually = findViewById(R.id.btnEqually);
        // Установим текст на кнопках
        mBtnClear.setText(R.string.btnTextClean);
        mBtnPm.setText(R.string.btnTextPm);
        mBtnPercent.setText(R.string.btnTextPercent);
        mBtnSeven.setText(R.string.btnTextSeven);
        mBtnEight.setText(R.string.btnTextEight);
        mBtnNine.setText(R.string.btnTextNine);
        mBtnFour.setText(R.string.btnTextFour);
        mBtnFive.setText(R.string.btnTextFive);
        mBtnSix.setText(R.string.btnTextSix);
        mBtnOne.setText(R.string.btnTextOne);
        mBtnTwo.setText(R.string.btnTextTwo);
        mBtnThree.setText(R.string.btnTextThree);
        mBtnZero.setText(R.string.btnTextZero);
        mBtnPoint.setText(R.string.btnTextPoint);
        mBtnShare.setText(R.string.btnTextShare);
        mBtnMultiply.setText(R.string.btnTextMultiply);
        mBtnMinus.setText(R.string.btnTextMinus);
        mBtnPlus.setText(R.string.btnTextPlus);
        mBtnEqually.setText(R.string.btnTextEqually);
        // присваиваем обработчик кнопкам
        mBtnClear.setOnClickListener(this);
        mBtnSeven.setOnClickListener(this);
        mBtnEight.setOnClickListener(this);
        mBtnNine.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
        mBtnFive.setOnClickListener(this);
        mBtnSix.setOnClickListener(this);
        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnZero.setOnClickListener(this);
        mBtnPoint.setOnClickListener(this);
    }
    // Сохраним данные при повороте
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Display", mDisplay);
        outState.putInt("Point", mDischarge);
    }
    // Вернем данные после поворота
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mDisplay = savedInstanceState.getString("Display");
        txtDisplay.setText(mDisplay);
        mDischarge = savedInstanceState.getInt("Point");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnClear:
                txtDisplay.setText("");
                mDischarge = 0;
                break;
        }
        // Проверка длинны не более 10 символов!!!
        if (mDisplay.length()<10) {
            switch (v.getId()) {
                case R.id.btnSeven:
                    txtDisplay.setText(mDisplay + "7");
                    break;
                case R.id.btnEight:
                    txtDisplay.setText(mDisplay + "8");
                    break;
                case R.id.btnNine:
                    txtDisplay.setText(mDisplay + "9");
                    break;
                case R.id.btnFour:
                    txtDisplay.setText(mDisplay + "4");
                    break;
                case R.id.btnFive:
                    txtDisplay.setText(mDisplay + "5");
                    break;
                case R.id.btnSix:
                    txtDisplay.setText(mDisplay + "6");
                    break;
                case R.id.btnOne:
                    txtDisplay.setText(mDisplay + "1");
                    break;
                case R.id.btnTwo:
                    txtDisplay.setText(mDisplay + "2");
                    break;
                case R.id.btnThree:
                    txtDisplay.setText(mDisplay + "3");
                    break;
                case R.id.btnZero:
                    txtDisplay.setText(mDisplay + "0");
                    break;
                case R.id.btnPoint:
                    // Проверка в тексте наличия запятой
                    if (mDischarge == 0) {
                        txtDisplay.setText(mDisplay + ",");
                        mDischarge = 1;
                    }
                    break;
            }
        }
        // Хранить данный с дисплея в переменной
        mDisplay = (String) txtDisplay.getText();
    }
}