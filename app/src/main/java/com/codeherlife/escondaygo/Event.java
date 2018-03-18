package com.codeherlife.escondaygo;

/**
 * Created by melanie on 3/5/18.
 */

public class Event {


    public Event (String name, int weekday){

        this.name = name;
        this.weekday = weekday;
    }

    public String name;
    public int weekday;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setWeekday(int weekday) {this.weekday = weekday; }

    public int getWeekday(){
        return weekday;
    }


    // methods
    @Override
    public String toString() {
        return "Event: " + name;
    }



}
