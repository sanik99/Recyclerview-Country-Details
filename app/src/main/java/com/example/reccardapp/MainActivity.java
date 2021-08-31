package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Countries lists");

        rcv = (RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(datavalue(), datavalue2(), getApplicationContext());
        rcv.setAdapter(adapter);

    }

    public ArrayList<Model> datavalue()
    {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1=new Model();
        ob1.setCountry("Nepal");
        ob1.setCode("+977");
        ob1.setImgname(R.drawable.npl);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setCountry("America");
        ob2.setCode("+91");
        ob2.setImgname(R.drawable.usa);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setCountry("England");
        ob3.setCode("+81");
        ob3.setImgname(R.drawable.uk);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setCountry("Dubai");
        ob4.setCode("+311");
        ob4.setImgname(R.drawable.dubai);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setCountry("China");
        ob5.setCode("+999");
        ob5.setImgname(R.drawable.chi);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setCountry("France");
        ob6.setCode("+411");
        ob6.setImgname(R.drawable.france);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setCountry("Belgium");
        ob7.setCode("+212");
        ob7.setImgname(R.drawable.bel);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setCountry("Portugal");
        ob8.setCode("+811");
        ob8.setImgname(R.drawable.por);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setCountry("Argentina");
        ob9.setCode("+111");
        ob9.setImgname(R.drawable.arg);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setCountry("Germany");
        ob10.setCode("+611");
        ob10.setImgname(R.drawable.germ);
        holder.add(ob10);

        return holder;
    }

    public ArrayList<Model2> datavalue2(){

        ArrayList<Model2> holder = new ArrayList<>();

        Model2 value1 = new Model2();
        value1.setCountryID("Nepal");
        value1.setAreaID("11 npll");
        value1.setReligionID("Hindu");
        value1.setPopulationID("1m npl");
        value1.setDetailsArea("this is Nepal");
        value1.setFlagID(R.drawable.npl);
        value1.setAnimalsID("goat nol");
        value1.setBirdsID("vulture npl");
        holder.add(value1);

        Model2 value2 = new Model2();
        value2.setCountryID("America");
        value2.setAreaID("11");
        value2.setReligionID("christian");
        value2.setPopulationID("1m");
        value2.setDetailsArea("this is america");
        value2.setFlagID(R.drawable.usa);
        value2.setAnimalsID("goat arm");
        value2.setBirdsID("vulture arm");
        holder.add(value2);

        Model2 value3 = new Model2();
        value3.setCountryID("England");
        value3.setAreaID("11");
        value3.setReligionID("christian");
        value3.setPopulationID("1m");
        value3.setDetailsArea("this is England");
        value3.setFlagID(R.drawable.uk);
        value3.setAnimalsID("goat eng");
        value3.setBirdsID("vulture eng");
        holder.add(value3);

        Model2 value4 = new Model2();
        value4.setCountryID("Dubai");
        value4.setAreaID("11");
        value4.setReligionID("Islam");
        value4.setPopulationID("1m");
        value4.setDetailsArea("this is Dubai");
        value4.setFlagID(R.drawable.dubai);
        value4.setAnimalsID("goat islam");
        value4.setBirdsID("vulture islam");
        holder.add(value4);

        Model2 value5 = new Model2();
        value5.setCountryID("China");
        value5.setAreaID("11");
        value5.setReligionID("Buddist");
        value5.setPopulationID("1m");
        value5.setDetailsArea("this is China");
        value5.setFlagID(R.drawable.chi);
        value5.setAnimalsID("goat chis");
        value5.setBirdsID("vulture chis");
        holder.add(value5);

        Model2 value6 = new Model2();
        value6.setCountryID("France");
        value6.setAreaID("11");
        value6.setReligionID("christian");
        value6.setPopulationID("1m");
        value6.setDetailsArea("this is France");
        value6.setFlagID(R.drawable.france);
        value6.setAnimalsID("goat frn");
        value6.setBirdsID("vulture frn");
        holder.add(value6);

        Model2 value7 = new Model2();
        value7.setCountryID("Belgium");
        value7.setAreaID("11");
        value7.setReligionID("christian");
        value7.setPopulationID("1m");
        value7.setDetailsArea("this is Belgium");
        value7.setFlagID(R.drawable.bel);
        value7.setAnimalsID("goat bel");
        value7.setBirdsID("vulture bel");
        holder.add(value7);

        Model2 value8 = new Model2();
        value8.setCountryID("Portugal");
        value8.setAreaID("11");
        value8.setReligionID("christian");
        value8.setPopulationID("1m");
        value8.setDetailsArea("this is Portugal");
        value8.setFlagID(R.drawable.por);
        value8.setAnimalsID("goat por");
        value8.setBirdsID("vulture por");
        holder.add(value8);

        Model2 value9 = new Model2();
        value9.setCountryID("Argentina");
        value9.setAreaID("11 arg");
        value9.setReligionID("christian arg");
        value9.setPopulationID("1m arg");
        value9.setDetailsArea("this is Argentina");
        value9.setFlagID(R.drawable.arg);
        value9.setAnimalsID("goat arg");
        value9.setBirdsID("vulture arg");
        holder.add(value9);

        Model2 value10 = new Model2();
        value10.setCountryID("Germany");
        value10.setAreaID("11 germ");
        value10.setReligionID("christian germ");
        value10.setPopulationID("1m germ");
        value10.setDetailsArea("this is Germnay");
        value10.setFlagID(R.drawable.germ);
        value10.setAnimalsID("goat germ");
        value10.setBirdsID("vulture germ");
        holder.add(value10);

        return holder;
    }

}
