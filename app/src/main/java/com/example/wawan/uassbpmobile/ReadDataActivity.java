package com.example.wawan.uassbpmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Iterator;

import static com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE;

public class ReadDataActivity extends AppCompatActivity {

    private TextView textView;
    private String text;
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference().getRoot();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_data);
        textView = (TextView) findViewById(R.id.idReadData);
        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                append_read(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                append_read(dataSnapshot);
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
    }
    private void append_read(DataSnapshot dataSnapshot){
        long no = Integer.parseInt(dataSnapshot.child("No").getValue().toString());
//        int no = dataSnapshot.child("No").getValue(Integer.class);
        String name = String.valueOf(dataSnapshot.child("Name").getValue());
        String brand = String.valueOf(dataSnapshot.child("Brand").getValue());
//        System.out.println("No :"+  "Name" + name +" Brand :"+ brand);
        textView.append("No :"+ no +" Name" + name +" Brand :"+ brand+"\n");
    }

}
