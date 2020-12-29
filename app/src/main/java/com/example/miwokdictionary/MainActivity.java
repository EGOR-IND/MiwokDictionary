package com.example.miwokdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numbers;
    private TextView family;
    private TextView colors;
    private TextView phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = (TextView) findViewById(R.id.numbers);
        family = (TextView)findViewById(R.id.family);
        colors = (TextView)findViewById(R.id.colors);
        phrases = (TextView)findViewById(R.id.phrases);

        numbers.setOnClickListener(this);
        family.setOnClickListener(this);
        colors.setOnClickListener(this);
        phrases.setOnClickListener(this);

        numbers.setTextColor(getResources().getColor(R.color.titleEnableColor));
        numbersView();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.numbers:
                numbers.setTextColor(getResources().getColor(R.color.titleEnableColor));
                family.setTextColor(getResources().getColor(R.color.titleDisableColor));
                colors.setTextColor(getResources().getColor(R.color.titleDisableColor));
                phrases.setTextColor(getResources().getColor(R.color.titleDisableColor));
                numbersView();
                break;

            case R.id.family:
                numbers.setTextColor(getResources().getColor(R.color.titleDisableColor));
                family.setTextColor(getResources().getColor(R.color.titleEnableColor));
                colors.setTextColor(getResources().getColor(R.color.titleDisableColor));
                phrases.setTextColor(getResources().getColor(R.color.titleDisableColor));
                familyView();
                break;

            case R.id.colors:
                numbers.setTextColor(getResources().getColor(R.color.titleDisableColor));
                family.setTextColor(getResources().getColor(R.color.titleDisableColor));
                colors.setTextColor(getResources().getColor(R.color.titleEnableColor));
                phrases.setTextColor(getResources().getColor(R.color.titleDisableColor));
                colorsView();
                break;

            case R.id.phrases:
                numbers.setTextColor(getResources().getColor(R.color.titleDisableColor));
                family.setTextColor(getResources().getColor(R.color.titleDisableColor));
                colors.setTextColor(getResources().getColor(R.color.titleDisableColor));
                phrases.setTextColor(getResources().getColor(R.color.titleEnableColor));
                phrasesView();
                break;
        }
    }

    public void numbersView(){
        ArrayList<String> numbersListEng = new ArrayList<String>();
        numbersListEng.add("one");
        numbersListEng.add("two");
        numbersListEng.add("three");
        numbersListEng.add("four");
        numbersListEng.add("five");
        numbersListEng.add("six");
        numbersListEng.add("seven");
        numbersListEng.add("eight");
        numbersListEng.add("nine");
        numbersListEng.add("ten");

        ArrayList<String> numbersListMiwok = new ArrayList<String>();
        numbersListMiwok.add("lutti");
        numbersListMiwok.add("otiiko");
        numbersListMiwok.add("tolookosu");
        numbersListMiwok.add("oyyisa");
        numbersListMiwok.add("massokka");
        numbersListMiwok.add("temmokka");
        numbersListMiwok.add("kenekaku");
        numbersListMiwok.add("kawinta");
        numbersListMiwok.add("wo’e");
        numbersListMiwok.add("na’aacha");

        ArrayList<Integer> numberImg = new ArrayList<Integer>();
        numberImg.add(R.drawable.number_one);
        numberImg.add(R.drawable.number_two);
        numberImg.add(R.drawable.number_three);
        numberImg.add(R.drawable.number_four);
        numberImg.add(R.drawable.number_five);
        numberImg.add(R.drawable.number_six);
        numberImg.add(R.drawable.number_seven);
        numberImg.add(R.drawable.number_eight);
        numberImg.add(R.drawable.number_nine);
        numberImg.add(R.drawable.number_ten);

        ArrayList<User> data = new ArrayList<User>();
        for(int i=0;i<10;i++){
            data.add(new User(numbersListMiwok.get(i), numbersListEng.get(i), numberImg.get(i)));
        }

        RecyclerView.Adapter adapter = new UserAdapter(data);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rootView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);
    }

    public void familyView(){
        ArrayList<String> numbersListMiwok = new ArrayList<String>();
        numbersListMiwok.add("әpә");
        numbersListMiwok.add("әṭa");
        numbersListMiwok.add("angsi");
        numbersListMiwok.add("tune");
        numbersListMiwok.add("taachi");
        numbersListMiwok.add("chalitti");
        numbersListMiwok.add("teṭe");
        numbersListMiwok.add("kolliti");
        numbersListMiwok.add("ama");
        numbersListMiwok.add("paapa");

        ArrayList<String> numbersListEng = new ArrayList<String>();
        numbersListEng.add("father");
        numbersListEng.add("mother");
        numbersListEng.add("son");
        numbersListEng.add("daughter");
        numbersListEng.add("older brother");
        numbersListEng.add("younger brother");
        numbersListEng.add("older sister");
        numbersListEng.add("younger sister");
        numbersListEng.add("grandmother");
        numbersListEng.add("grandfather");

        ArrayList<Integer> numberImg = new ArrayList<Integer>();
        numberImg.add(R.drawable.family_father);
        numberImg.add(R.drawable.family_mother);
        numberImg.add(R.drawable.family_son);
        numberImg.add(R.drawable.family_daughter);
        numberImg.add(R.drawable.family_older_brother);
        numberImg.add(R.drawable.family_younger_brother);
        numberImg.add(R.drawable.family_older_sister);
        numberImg.add(R.drawable.family_younger_sister);
        numberImg.add(R.drawable.family_grandmother);
        numberImg.add(R.drawable.family_grandfather);

        ArrayList<User> data = new ArrayList<User>();
        for(int i=0;i<10;i++){
            data.add(new User(numbersListMiwok.get(i), numbersListEng.get(i), numberImg.get(i)));
        }

        RecyclerView.Adapter adapter = new UserAdapter(data);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rootView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);
    }

    public void colorsView(){
        ArrayList<String> numbersListEng = new ArrayList<String>();
        numbersListEng.add("red");
        numbersListEng.add("green");
        numbersListEng.add("brown");
        numbersListEng.add("gray");
        numbersListEng.add("black");
        numbersListEng.add("white");
        numbersListEng.add("dusty yellow");
        numbersListEng.add("mustard yellow");

        ArrayList<String> numbersListMiwok = new ArrayList<String>();
        numbersListMiwok.add("weṭeṭṭi");
        numbersListMiwok.add("chokokki");
        numbersListMiwok.add("ṭakaakki");
        numbersListMiwok.add("ṭopoppi");
        numbersListMiwok.add("kululli");
        numbersListMiwok.add("kelelli");
        numbersListMiwok.add("ṭopiisә");
        numbersListMiwok.add("chiwiiṭә");

        ArrayList<Integer> numberImg = new ArrayList<Integer>();
        numberImg.add(R.drawable.color_red);
        numberImg.add(R.drawable.color_green);
        numberImg.add(R.drawable.color_brown);
        numberImg.add(R.drawable.color_gray);
        numberImg.add(R.drawable.color_black);
        numberImg.add(R.drawable.color_white);
        numberImg.add(R.drawable.color_dusty_yellow);
        numberImg.add(R.drawable.color_mustard_yellow);

        ArrayList<User> data = new ArrayList<User>();
        for(int i=0;i<8;i++){
            data.add(new User(numbersListMiwok.get(i), numbersListEng.get(i), numberImg.get(i)));
        }

        RecyclerView.Adapter adapter = new UserAdapter(data);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rootView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);
    }

    public void phrasesView(){
        ArrayList<String> numbersListEng = new ArrayList<String>();
        numbersListEng.add("Where are you going?");
        numbersListEng.add("What is your name?");
        numbersListEng.add("My name is...");
        numbersListEng.add("How are you feeling?");
        numbersListEng.add("I'm feeling good.");
        numbersListEng.add("Are you coming?");
        numbersListEng.add("Yes, I’m coming.");
        numbersListEng.add("I’m coming.");
        numbersListEng.add("Let’s go.");
        numbersListEng.add("Come here.");

        ArrayList<String> numbersListMiwok = new ArrayList<String>();
        numbersListMiwok.add("minto wuksus");
        numbersListMiwok.add("tinnә oyaase'nә");
        numbersListMiwok.add("oyaaset...");
        numbersListMiwok.add("michәksәs?");
        numbersListMiwok.add("kuchi achit");
        numbersListMiwok.add("әәnәs'aa?");
        numbersListMiwok.add("hәә’ әәnәm");
        numbersListMiwok.add("әәnәm");
        numbersListMiwok.add("yoowutis");
        numbersListMiwok.add("әnni'nem");

        ArrayList<phrases> data = new ArrayList<phrases>();
        for(int i=0;i<9;i++){
            data.add(new phrases(numbersListMiwok.get(i), numbersListEng.get(i)));
        }

        RecyclerView.Adapter adapter = new phrasesAdapter(data);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rootView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);
    }
}
