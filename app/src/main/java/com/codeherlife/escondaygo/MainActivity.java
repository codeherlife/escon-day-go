package com.codeherlife.escondaygo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)this.findViewById(R.id.text_view_title);
        textView.setText(R.string.events_title);

        ArrayList<Event> eventsList = new ArrayList<Event>();

        eventsList.add(new Event("Farmer's market- 3-7 pm at Welk Resort", Event.Weekday.Monday));

        eventsList.add(new Event("Rhymes and Reading story time (ages 4-5)- Escondido Public Library 11-11:30a",
                Event.Weekday.Monday));


        eventsList.add(new Event("Knights Realm Chess Club (ages 6-12)- Escondido Public Library 3:30-5:30p",
                Event.Weekday.Monday));


        eventsList.add(new Event("Farmer's market- 2:30-6:30 pm on Grand ave", Event.Weekday.Tuesday));

        eventsList.add(new Event("Baby Lapsit story time- Escondido Public Library, 10:30-11am", Event.Weekday.Wednesday));

        eventsList.add(new Event("Toddler story time- Escondido Public Library, 11am", Event.Weekday.Thursday));

        eventsList.add(new Event("Crusing Grand", Event.Weekday.Friday));

        eventsList.add(new Event("Children's story time- 11am, Barnes and Nobles on Valley Parkway", Event.Weekday.Saturday));


//        eventsList.add("Monday");
//        eventsList.add("Tuesday");
//        eventsList.add("Wednesday");
//        eventsList.add("Thursday");
//        eventsList.add("Friday");


        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(
                this,
                R.layout.list_item_candy,
                R.id.text_view_candy,
                eventsList
        );

        ListView listView = (ListView)this.findViewById(R.id.list_view_candy);
        listView.setAdapter(adapter);


        Context context = this;
        String text = "Welcome to Escon-day-go!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
}
