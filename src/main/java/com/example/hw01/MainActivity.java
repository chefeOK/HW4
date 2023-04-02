package com.example.hw01;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private CheckBox boldCheckBox;
    private CheckBox italicCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼과 체크박스 참조
        myButton = findViewById(R.id.myButton);
        boldCheckBox = findViewById(R.id.boldCheckBox);
        italicCheckBox = findViewById(R.id.italicCheckBox);

        // 체크박스가 선택될 때마다 버튼의 속성 변경
        boldCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setButtonStyle();
            }
        });
        italicCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setButtonStyle();
            }
        });
    }

    private void setButtonStyle() {
        int style = Typeface.NORMAL;

        // Bold 체크박스 선택 여부 확인
        if (boldCheckBox.isChecked()) {
            style |= Typeface.BOLD;
        }

        // Italic 체크박스 선택 여부 확인
        if (italicCheckBox.isChecked()) {
            style |= Typeface.ITALIC;
        }

        // 버튼의 폰트 속성 설정
        myButton.setTypeface(null, style);
    }
}
