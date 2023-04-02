package com.example.hw03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button 참조
        myButton = findViewById(R.id.myButton);

        // 버튼 클릭 리스너 등록
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이미지 회전시키기
                float rotation = myButton.getRotation() + 10.0f;
                myButton.setRotation(rotation);
            }
        });
    }
}
