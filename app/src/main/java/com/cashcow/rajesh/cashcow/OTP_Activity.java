package com.cashcow.rajesh.cashcow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTP_Activity extends AppCompatActivity {
Button botp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        botp= (Button) findViewById(R.id.submitotp);
        botp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OTP_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
