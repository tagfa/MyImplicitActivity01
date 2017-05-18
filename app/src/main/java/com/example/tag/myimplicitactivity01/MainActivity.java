package com.example.tag.myimplicitactivity01;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final String MYACTION
            = "com.example.tag.myimplicitActivity01.MYACTION";

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button button = (Button)findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    //intentを作成し、定義した文字列を渡す
                    Intent intent = new Intent(MYACTION);

                    startActivity(intent);
                }
            });


        }
}
