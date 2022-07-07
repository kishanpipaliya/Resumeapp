package com.example.resumeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class datacreate extends AppCompatActivity {

    EditText edtInterest,edtLanguage,edtExperience,edtSkills,edtGrade,edtCollege,edtTwitter,edtFacebook,edtInstagram;
    EditText edtDegree,edtLinkedin,edtGithub,edtEmail,edtContact,edtAddress,edtName,edtSurname;
    Button btnView;
    String Name,Surname,Address,Contact,Email,Github,Linkedin,Degree,College,Grade,Skill,Experience,Language,Interest,Instagram,Facebook,Twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datacreate);
        initBinding();
        initClick();
    }
    void initBinding()
    {
        edtName = findViewById(R.id.edtName);
        edtSurname = findViewById(R.id.edtSurname);
        edtAddress = findViewById(R.id.edtAddress);
        edtContact = findViewById(R.id.edtContact);
        edtEmail = findViewById(R.id.edtEmail);
        edtGithub = findViewById(R.id.edtGithub);
        edtLinkedin = findViewById(R.id.edtLinkedin);
        edtDegree = findViewById(R.id.edtDegree);
        edtCollege = findViewById(R.id.edtCollege);
        edtGrade = findViewById(R.id.edtGrade);
        edtSkills = findViewById(R.id.edtSkills);
        edtExperience = findViewById(R.id.edtExperience);
        edtLanguage = findViewById(R.id.edtLanguage);
        edtInterest = findViewById(R.id.edtInterest);
        edtTwitter = findViewById(R.id.edtTwitter);
        edtFacebook = findViewById(R.id.edtFacebook);
        edtInstagram = findViewById(R.id.edtInstagram);
        btnView = findViewById(R.id.btnView);
    }
    void initClick()
    {
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name = edtName.getText().toString();
                Surname = edtSurname.getText().toString();
                Address = edtAddress.getText().toString();
                Contact = edtContact.getText().toString();
                Email = edtEmail.getText().toString();
                Github = edtGithub.getText().toString();
                Linkedin = edtLinkedin.getText().toString();
                Degree = edtDegree.getText().toString();
                College = edtCollege.getText().toString();
                Grade = edtGrade.getText().toString();
                Skill = edtSkills.getText().toString();
                Experience = edtExperience.getText().toString();
                Language = edtLanguage.getText().toString();
                Interest = edtInterest.getText().toString();
                Instagram = edtInstagram.getText().toString();
                Facebook = edtFacebook.getText().toString();
                Twitter = edtTwitter.getText().toString();

                Intent intent = new Intent(datacreate.this,layout.class);

                intent.putExtra("Name",Name);
                intent.putExtra("Surname",Surname);
                intent.putExtra("Address",Address);
                intent.putExtra("Contact",Contact);
                intent.putExtra("Email",Email);
                intent.putExtra("Github",Github);
                intent.putExtra("Linkedin",Linkedin);
                intent.putExtra("Degree",Degree);
                intent.putExtra("College",College);
                intent.putExtra("Grade",Grade);
                intent.putExtra("Skill",Skill);
                intent.putExtra("Experience",Experience);
                intent.putExtra("Language",Language);
                intent.putExtra("Interest",Interest);
                intent.putExtra("Instagram",Instagram);
                intent.putExtra("Facebook",Facebook);
                intent.putExtra("Twitter",Twitter);
                startActivity(intent);
            }
        });
    }
}