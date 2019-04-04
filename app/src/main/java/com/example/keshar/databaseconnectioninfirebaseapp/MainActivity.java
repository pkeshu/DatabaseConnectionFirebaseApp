package com.example.keshar.databaseconnectioninfirebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    private Button btn_send;
    Firebase url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        btn_send=findViewById(R.id.btn_send);
        url=new Firebase("https://applicationdemo-eff34.firebaseio.com/");
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase nameFB=url.child("Name");
                Firebase addressFB=url.child("Address");
                for(int i=1;i<=100;i++){
                    nameFB.setValue("keshar");
                    addressFB.setValue("Kalopul");
                }




            }
        });
    }
}
