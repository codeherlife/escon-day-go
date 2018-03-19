package com.codeherlife.escondaygo;

/**
 * Created by melanie on 3/5/18.
 */

public class Event {

    public enum Weekday {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }


    public Event (String name, Weekday day){

        this.name = name;
        this.day = this.day;
    }

    public String name;
    public Weekday day;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setDay(Weekday day) {this.day = day; }

    public Weekday getDay(){
        return day;
    }


    // methods
    @Override
    public String toString() {
        return "Event: " + name;
    }



}
