package com.example.kyosh.bookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtUsername,edtPass;
    Button btnDangnhap;
    FirebaseDatabase database;
    DatabaseReference myRefUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database =FirebaseDatabase.getInstance();
        myRefUser=database.getReference("USER");
        init();
        addEvent();
    }

    private void addEvent() {
        btnDangnhap.setOnClickListener(this);
    }

    private void init() {
        edtUsername=findViewById(R.id.edtusername);
        edtPass=findViewById(R.id.edtpassword);
        btnDangnhap=findViewById(R.id.btndangnhap);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btndangnhap:
                myRefUser.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                            Toast.makeText(MainActivity.this, dataSnapshot1.getValue().toString(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                break;
        }
    }
}
