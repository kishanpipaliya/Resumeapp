package com.example.resumeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class layout2 extends AppCompatActivity {

    TextView txtName, txtSurname, txtAddress, txtContact, txtEmail, txtGithub, txtLinkedin, txtDegree, txtCollege, txtGrade;
    TextView txtSkill, txtTwitter, txtFacebook, txtInstagram, txtInterest, txtLanguage, txtExperience;
    String Name, Surname, Address, Contact, Email, Github, Linkedin, Degree, College, Grade, Skill;
    String Interest, Instagram, Facebook, Twitter, Experience, Language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        initBinding();
        initClick();
        txtName.setText(Name);
        txtSurname.setText(Surname);
        txtAddress.setText(Address);
        txtContact.setText(Contact);
        txtEmail.setText(Email);
        txtGithub.setText(Github);
        txtLinkedin.setText(Linkedin);
        txtDegree.setText(Degree);
        txtCollege.setText(College);
        txtGrade.setText(Grade);
        txtSkill.setText(Skill);
        txtTwitter.setText(Twitter);
        txtFacebook.setText(Facebook);
        txtInstagram.setText(Instagram);
        txtInterest.setText(Interest);
        txtLanguage.setText(Language);
        txtExperience.setText(Experience);
    }
    void initBinding()
    {
        txtName = findViewById(R.id.txtName);
        txtSurname = findViewById(R.id.txtSurname);
        txtAddress = findViewById(R.id.txtAddress);
        txtContact = findViewById(R.id.txtContact);
        txtEmail = findViewById(R.id.txtEmail);
        txtGithub = findViewById(R.id.txtGithub);
        txtLinkedin = findViewById(R.id.txtLinkedin);
        txtDegree = findViewById(R.id.txtDegree);
        txtCollege = findViewById(R.id.txtCollege);
        txtGrade = findViewById(R.id.txtGrade);
        txtSkill = findViewById(R.id.txtSkill);
        txtTwitter = findViewById(R.id.txtTwitter);
        txtFacebook = findViewById(R.id.txtFacebook);
        txtInstagram = findViewById(R.id.txtInstagram);
        txtInterest = findViewById(R.id.txtInterest);
        txtLanguage = findViewById(R.id.txtLanguage);
        txtExperience = findViewById(R.id.txtExperience);
    }
    void initClick()
    {
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
}