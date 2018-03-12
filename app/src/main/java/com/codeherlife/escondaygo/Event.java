package com.codeherlife.escondaygo;

/**
 * Created by melanie on 3/5/18.
 */

public class Event {

    //this is the constructor
    // TODO: modify constructor to accept weekday and set it
    public Event (String name){
        Name = name;
    }

    public String Name;
    // TODO:add member that is of type int called Weekday

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    // TODO:add getter for weekday

    // TODO:add setter for weekday


    // methods
    @Override
    public String toString() {
        return "Event: " + Name;
    }



}
