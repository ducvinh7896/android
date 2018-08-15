package com.example.ducvinh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrten;
    ArrayAdapter<String> arradapter;
    ListView lvten;
    EditText txtten;
    Button btnluu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addEvent() {
        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Xulysukien();
            }

            private void Xulysukien() {
                String ten=txtten.getText().toString();
                arrten.add(ten);
                arradapter.notifyDataSetChanged();
                txtten.setText("");
                txtten.requestFocus();

            }


        });
    }

    private void addControls() {
        arrten=new ArrayList<String>();
        arradapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrten);
        lvten=findViewById(R.id.lvten);
        lvten.setAdapter(arradapter);
        txtten=findViewById(R.id.txtten);
        btnluu=findViewById(R.id.btnluu);


    }
}
