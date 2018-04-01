package com.codeherlife.escondaygo;
import java.util.ArrayList;

/**
 * Created by melanie on 3/18/18.
 */

public class EventHelper {

    public static int getCountByWeekday(ArrayList<Event> eventsList, Event.Weekday day) {

        // write a for loop, use a local counter to count if x
        // the day for each event is equal to the day
        // passed in as a parameter
        //for (){

        //}
        int count = 0;

        for (int i = 0; i < eventsList.size() -1; i++) {
            Event thisEvent = eventsList.get(i);
            Event.Weekday dayOfEvent = thisEvent.getDay();
            if (dayOfEvent == day) {
                count = count + 1;
                //++count;
                System.out.println(count);
            }


        }

        return count;

    }

}
