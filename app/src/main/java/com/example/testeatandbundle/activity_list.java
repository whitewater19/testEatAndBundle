package com.example.testeatandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_list extends AppCompatActivity {
TextView msg;
Bundle getbag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        msg=findViewById(R.id.Show);

        getbag=getIntent().getExtras();
        String name=getbag.getString("CAR");
        String order=getbag.getString("ORDER");
        msg.setText(name+"您的餐點有:"+"\n"+order);

    }
}
