package com.neonsec.PSNarayanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mTitle = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mDuration = new ArrayList<>();
    private CircleImageView circle_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle_iv = findViewById(R.id.profile_image);
        circle_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphIntent = new Intent(MainActivity.this,GraphActivity.class);
                startActivity(graphIntent);
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();
            }
        });
        initData();

    }

   private void initData(){

       mTitle.add("");
       mDuration.add("");
       mDesc.add("Swipe right to see more >>");

       mTitle.add("TorBot");
       mDuration.add("2017 - Present");
       mDesc.add("TorBot is an OSINT tool for deep Web. The project is actively maintained and has already got a decent amount of contributions from open-source contributers around the globe.");

       mTitle.add("ML/DM Algorithms");
       mDuration.add("2017 - 2018");
       mDesc.add("Python implementation of well known Machine Learning and Data Mining Algorithms.");

       mTitle.add("Mega Mp3 Downloader App");
       mDuration.add("2017");
       mDesc.add("Developed Android mobile application for Downloading mp3 from online videos. Available on Google Play Store.");

       mTitle.add("Adhrit");
       mDuration.add("2017");
       mDesc.add("Adhrit is an open source Android APK reversing and analysis tool that can help secuity researchers and CTF enthusiasts alike. The tool is an effort to cut down on the amount of time spent on reversing and basic reconnassaince of Android applications.");

       mTitle.add("Rudhra Android");
       mDuration.add("2017");
       mDesc.add("Rudhra is an open source project aimed at protecting Android devices in the hands of laymen. The application tells the user about the vulnerable configurations in his device (like, settings) and explains to him why it could prove to be dangerous, gives inforamtion about the overall health of the device, checks for root access etc.");

       mTitle.add("Digital Kalotsavam");
       mDuration.add("2017");
       mDesc.add("Digital Kalotsavam 17 is a small step to the future of Amrita Kalotsavam. This project helped the students to register for events and the core committee was able to display score into a screen including a bar graph.");

       mTitle.add("DOMJudge Analyzer");
       mDuration.add("2016 - 2017");
       mDesc.add("DOMJudge Analyzer module will analyze the results from a dataset and will print graphical analytics to end users about the performance of the participants. This can be used to analyze the problems given in the contest.");

       mTitle.add("ViPER");
       mDuration.add("2016");
       mDesc.add("Viper is a simple penetration testing tool developed in python as a part of UG project. This tool scans for OWASP top vulnerabilities in a Web-app/Web site and prints the result as graph as well as raw output. Viper has a command-line interface as well as a web-interface.\n");

       mTitle.add("MIHU");
       mDuration.add("2016");
       mDesc.add("May I Help You is a Seva of Amritavarsham.MIHU Web App is developed by a team of BCA.This app is kind of a knowledge base which has almost every information regarding the Amritavarsham 63 campaign. The project got succesfully deployed in about 10 days. Project Source can be found at github.com/PSNAppz/MIHU-AMMA.");

       mTitle.add("The Open Blog");
       mDuration.add("2016");
       mDesc.add("The Open Blog is an OpenSource blogging platform developed in PHP Laravel 5.2.3 framework. It has a beautiful user interface and analytics dashboard. Project can be found at github.com/TheOpenBlog.");

       mTitle.add("Zany");
       mDuration.add("2016");
       mDesc.add("Zany is a simple social networking site developed in php from scratch.");

       mTitle.add("AUMS Windows App");
       mDuration.add("2015");
       mDesc.add("Developed Windows mobile application for Amrita University Management System.");

       mTitle.add("Key Logger");
       mDuration.add("2013 - 2014");
       mDesc.add("Developed a keylogger which records every key stroke and sends the data anonymously to Hacker via E-mail.The Keylogger is hidden from the victim and is obfuscated with custom crypters to prevent Anti-Virus softwares from detecting.");



       initRecyclerView();
   }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mTitle, mDuration,mDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(),0);
        recyclerView.addItemDecoration(decoration);
    }


}
