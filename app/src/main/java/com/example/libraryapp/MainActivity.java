package com.example.libraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.libraryappitpaydar.Utils;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nmb = findViewById(R.id.nmb);
//        nmb2 = findViewById(R.id.nmb2);
//        user = findViewById(R.id.user);
//        pass = findViewById(R.id.pass);
//        info_te = findViewById(R.id.info_te);
//        info_te2 = findViewById(R.id.info_te2);
//        info_bt = findViewById(R.id.info_bt);
//        info_bt = findViewById(R.id.info_bt);
//        info_bt2 = findViewById(R.id.info_bt2);
//        PHONE_permission = findViewById(R.id.PHONE_permission);
//        dialog_button2 = findViewById(R.id.dialog_button2);
//        dialog_button = findViewById(R.id.dialog_button);
        




//        dialog_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Utils utils =new Utils();
//                utils.dialog_builder(MainActivity.this);
//                view = getLayoutInflater().inflate(R.layout.dialog, null);
//                utils.builder.setView(view);
//                ok =    view.findViewById(R.id.ok);
//                ok.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(MainActivity.this, "dialog2", Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//                utils.dialog_show();
//
//
//            }
//        });
//
//        dialog_button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Utils utils =new Utils();
//                utils.dialog_builder(MainActivity.this);
//                view = getLayoutInflater().inflate(R.layout.dialog, null);
//                utils.builder.setView(view);
//                ok =    view.findViewById(R.id.ok);
//                ok.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(MainActivity.this, "dialog2", Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//                utils.dialog_show();
//            }
//        });
//
//
//        PHONE_permission.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View view) {
//                  Utils utils = new Utils();
//                  utils.READ_PHONE_NUMBERS_permission(MainActivity.this);
//                  }
//          });
//
//
//        nmb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Utils utils = new Utils();
//                String s = user.getText().toString();
//                utils.SharedPrefSave( MainActivity.this,"ahmad");
//                utils.editor.putString("hkjk",s );
//                utils.editor.apply();
//            }
//        });
//
//        info_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Utils utils = new Utils();
//                utils.SharedPrefget(MainActivity.this,"ahmad");
//                String sd = utils.sharedPreferences.getString("hkjk", "");
//                info_te.setText("name : " + sd );
//            }
//        });
//
//        nmb2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Utils utils = new Utils();
//                String w = pass.getText().toString();
//                utils.SharedPrefSave( MainActivity.this,"ahmad");
//                utils.editor.putString("12",w );
//                utils.editor.apply();
//            }
//        });
//        info_bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Utils utils = new Utils();
//                utils.SharedPrefget(MainActivity.this,"ahmad");
//                String d = utils.sharedPreferences.getString("12", "");
//                info_te2.setText("name1 " + d);
//            }
//        });

    }

}

