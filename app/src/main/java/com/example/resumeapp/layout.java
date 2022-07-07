package com.example.resumeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class layout extends AppCompatActivity {

    ImageView imgResume1,imgResume2, imgResume3,imgResume4;
    String Name, Surname, Address, Contact, Email, Github, Linkedin, Degree, College, Grade, Skill, Experience, Language, Interest, Instagram, Facebook, Twitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        initBinding();
        initClick();

        Name = getIntent().getStringExtra("Name");
        Surname = getIntent().getStringExtra("Surname");
        Address = getIntent().getStringExtra("Address");
        Contact = getIntent().getStringExtra("Contact");
        Email = getIntent().getStringExtra("Email");
        Github = getIntent().getStringExtra("Github");
        Linkedin = getIntent().getStringExtra("Linkedin");
        Degree = getIntent().getStringExtra("Degree");
        College = getIntent().getStringExtra("College");
        Grade = getIntent().getStringExtra("Grade");
        Skill = getIntent().getStringExtra("Skill");
        Experience = getIntent().getStringExtra("Experience");
        Language = getIntent().getStringExtra("Language");
        Interest = getIntent().getStringExtra("Interest");
        Instagram = getIntent().getStringExtra("Instagram");
        Facebook = getIntent().getStringExtra("Facebook");
        Twitter = getIntent().getStringExtra("Twitter");

    }

    void initBinding() {
        imgResume1 = findViewById(R.id.imgResume1);
        imgResume2 = findViewById(R.id.imgResume2);
        imgResume3 = findViewById(R.id.imgResume3);
        imgResume4 = findViewById(R.id.imgResume4);
    }

    void initClick() {
        imgResume1.setOnClickListener(view -> {
            Intent intent = new Intent(layout.this, layout1.class);
            intent.putExtra("Name", Name);
            intent.putExtra("Surname", Surname);
            intent.putExtra("Address", Address);
            intent.putExtra("Contact", Contact);
            intent.putExtra("Email", Email);
            intent.putExtra("Github", Github);
            intent.putExtra("Linkedin", Linkedin);
            intent.putExtra("Degree", Degree);
            intent.putExtra("College", College);
            intent.putExtra("Grade", Grade);
            intent.putExtra("Skill", Skill);
            intent.putExtra("Experience", Experience);
            intent.putExtra("Language", Language);
            intent.putExtra("Interest", Interest);
            intent.putExtra("Instagram", Instagram);
            intent.putExtra("Facebook", Facebook);
            intent.putExtra("Twitter", Twitter);
            startActivity(intent);

        });

        imgResume2.setOnClickListener(view -> {
            Intent intent = new Intent(layout.this, layout2.class);
            intent.putExtra("Name", Name);
            intent.putExtra("Surname", Surname);
            intent.putExtra("Address", Address);
            intent.putExtra("Contact", Contact);
            intent.putExtra("Email", Email);
            intent.putExtra("Github", Github);
            intent.putExtra("Linkedin", Linkedin);
            intent.putExtra("Degree", Degree);
            intent.putExtra("College", College);
            intent.putExtra("Grade", Grade);
            intent.putExtra("Skill", Skill);
            intent.putExtra("Experience", Experience);
            intent.putExtra("Language", Language);
            intent.putExtra("Interest", Interest);
            intent.putExtra("Instagram", Instagram);
            intent.putExtra("Facebook", Facebook);
            intent.putExtra("Twitter", Twitter);
            startActivity(intent);
        });

        imgResume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layout.this, layout3.class);
                intent.putExtra("Name", Name);
                intent.putExtra("Surname", Surname);
                intent.putExtra("Address", Address);
                intent.putExtra("Contact", Contact);
                intent.putExtra("Email", Email);
                intent.putExtra("Github", Github);
                intent.putExtra("Linkedin", Linkedin);
                intent.putExtra("Degree", Degree);
                intent.putExtra("College", College);
                intent.putExtra("Grade", Grade);
                intent.putExtra("Skill", Skill);
                intent.putExtra("Experience", Experience);
                intent.putExtra("Language", Language);
                intent.putExtra("Interest", Interest);
                intent.putExtra("Instagram", Instagram);
                intent.putExtra("Facebook", Facebook);
                intent.putExtra("Twitter", Twitter);
                startActivity(intent);
            }
        });
        imgResume4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layout.this, layout4.class);
                intent.putExtra("Name", Name);
                intent.putExtra("Surname", Surname);
                intent.putExtra("Address", Address);
                intent.putExtra("Contact", Contact);
                intent.putExtra("Email", Email);
                intent.putExtra("Github", Github);
                intent.putExtra("Linkedin", Linkedin);
                intent.putExtra("Degree", Degree);
                intent.putExtra("College", College);
                intent.putExtra("Grade", Grade);
                intent.putExtra("Skill", Skill);
                intent.putExtra("Experience", Experience);
                intent.putExtra("Language", Language);
                intent.putExtra("Interest", Interest);
                intent.putExtra("Instagram", Instagram);
                intent.putExtra("Facebook", Facebook);
                intent.putExtra("Twitter", Twitter);
                startActivity(intent);
            }
        });
    }






}
