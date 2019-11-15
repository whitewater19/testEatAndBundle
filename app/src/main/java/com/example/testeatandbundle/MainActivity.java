package com.example.testeatandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn_send;
    CheckBox checkbox4,checkbox5,checkbox6,checkbox7,checkbox8,checkbox9;
    RadioButton rbtnself,rbtnserv;
    String car;
    String order="";
    final Bundle bag = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radiogroup = findViewById(R.id.RadioGroup);
        btn_send = findViewById(R.id.btn_Send);
        checkbox4 = findViewById(R.id.checkBox4);
        checkbox5 = findViewById(R.id.checkBox5);
        checkbox6 = findViewById(R.id.checkBox6);
        checkbox7 = findViewById(R.id.checkBox7);
        checkbox8 = findViewById(R.id.checkBox8);
        checkbox9 = findViewById(R.id.checkBox9);
        rbtnself = findViewById(R.id.rBtnSelf);
        rbtnserv = findViewById(R.id.rBtnServ);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button=findViewById(checkedId);
                car="您的餐點要"+button.getText()+"\n";
            }
        });

        checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox4.getText()+"\n";
                else
                    order=order.replace(checkbox4.getText(),"");
            }
        });
        checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox5.getText()+"\n";
                else
                    order=order.replace(checkbox5.getText(),"");
            }
        });
        checkbox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox6.getText()+"\n";
                else
                    order=order.replace(checkbox6.getText(),"");
            }
        });
        checkbox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox7.getText()+"\n";
                else
                    order=order.replace(checkbox7.getText(),"");
            }
        });
        checkbox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox8.getText()+"\n";
                else
                    order=order.replace(checkbox8.getText(),"");
            }
        });
        checkbox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    order=order+checkbox9.getText()+"\n";
                else
                    order=order.replace(checkbox9.getText(),"");
            }
        });
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,activity_list.class);

                bag.putString("CAR",car);
                bag.putString("ORDER",order);

                intent.putExtras(bag);
                startActivity(intent);
                finish();

            }
        });


    }
}
