package com.sheela.mygmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);
        //create a list of contacts to display in recyclerview
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Sam","10:42am","Weekend adventure",
                "Let's go fishing with john and others.You will..",R.drawable.s));
        contactsList.add(new Contacts("Facebook","16:04pm","James,you have 1 new notification",
                "A lot has happened on Facebook since.",R.drawable.f));
        contactsList.add(new Contacts("Google+","18:44pm","Top suggested Google+ pages for you",
                "Top suggested Google+ pages for you",R.drawable.g));
        contactsList.add(new Contacts("Twitter","20:04pm","Follow T-Mobiles, Samsumg Mobiles",
                "James,some peoplw you may know",R.drawable.t));

        contactsList.add(new Contacts("Pinterest weekly","09:04pm","Pins you'll love",
                "Have you seen these pins yet? Pinterest",R.drawable.p));
        contactsList.add(new Contacts("John","01:04pm","Hey john",
                "How are you? John",R.drawable.j));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//                this,LinearLayoutManager.HORIZONTAL,false));


    }
}
