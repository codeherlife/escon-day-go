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


        eventsList.add(new Event("Escondido Writers Group (adults)- Escondido Public Library 1-4p- Every first Tuesday",
                Event.Weekday.Tuesday));


        eventsList.add(new Event("Farmer's market- 2:30-6:30 pm on Grand ave", Event.Weekday.Tuesday));

        eventsList.add(new Event("P.J. storytime (ages 4-12)- Escondido Public Library 6-6:30p- every third Tuesday",
                Event.Weekday.Tuesday));

        eventsList.add(new Event("Baby Lapsit story time- Escondido Public Library, 10:30-11am", Event.Weekday.Wednesday));


        eventsList.add(new Event("Teen Advisory Board (ages 12-18)- Escondido Public Library 3:30-5p- Every first " +
                "Wednesday", Event.Weekday.Wednesday));

        eventsList.add(new Event("Create it @ Your Library (ages 12-18)- Escondido Public Library 3:30-5:30p- " +
                "every third Wednesday",
                Event.Weekday.Wednesday));


        eventsList.add(new Event("Toddler Tales story time- Escondido Public Library, 11am", Event.Weekday.Thursday));

        eventsList.add(new Event("Read to a Dragon (ages 5-12)- Escondido Public Library 2:30-4p- every second Thursday",
                Event.Weekday.Thursday));

        eventsList.add(new Event("Safe Space Escondido (ages 12-17)- Escondido Public Library 4:15-5:45p- every second Thursday",
                Event.Weekday.Thursday));


        eventsList.add(new Event("Crusing Grand", Event.Weekday.Friday));

        eventsList.add(new Event("Children's story time- 11am, Barnes and Nobles on Valley Parkway", Event.Weekday.Saturday));

        eventsList.add(new Event("2nd Saturday Concert Series (all ages)- Escondido Public Library 3-4:30p- every second Saturday",
                Event.Weekday.Saturday));

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
