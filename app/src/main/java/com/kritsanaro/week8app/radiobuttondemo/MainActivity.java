package com.kritsanaro.week8app.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rad_good,rad2 , rad_ch1,rad_ch2,rad_ch3,rad_ch4;
    Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rad_good = findViewById(R.id.rad_good);
        rad2 = findViewById(R.id.rad2);
        rad_ch1 = findViewById(R.id.rad_ch1);
        rad_ch2 = findViewById(R.id.rad_ch2);
        rad_ch3 = findViewById(R.id.rad_ch3);
        rad_ch4 = findViewById(R.id.rad_ch4);

        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,
//                        "Rad1 : "+rad_good.isChecked()+
//                                " Rad2 : "+rad2.isChecked()
//
//                        , Toast.LENGTH_SHORT).show();
                String tmp = "";
                if(rad_ch1.isChecked()){
                    tmp = rad_ch1.getText().toString();
                }else if(rad_ch2.isChecked()){
                    tmp = rad_ch2.getText().toString();

                }else if(rad_ch3.isChecked()){
                    tmp = rad_ch3.getText().toString();
                }else if (rad_ch4.isChecked()){
                    tmp = rad_ch4.getText().toString();
                }
                Toast.makeText(MainActivity.this,
                        "คุณกำลังทำอะไรอยู่ ? \n คำตอบ : "+tmp
                        , Toast.LENGTH_SHORT).show();

            }
        });

    }
}
