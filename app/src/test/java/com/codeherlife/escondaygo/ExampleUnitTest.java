package com.codeherlife.escondaygo;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getsCountOfWeekday() throws Exception {
        // Arrange
        ArrayList<Event> eventsList1 = new ArrayList<Event>();
        eventsList1.add( new Event("event", Event.Weekday.Monday));
        eventsList1.add( new Event("event", Event.Weekday.Monday));
        eventsList1.add( new Event("event", Event.Weekday.Tuesday));
        eventsList1.add( new Event("event", Event.Weekday.Tuesday));
        eventsList1.add( new Event("event", Event.Weekday.Tuesday));

        ArrayList<Event> eventsList2 = new ArrayList<Event>();
        eventsList1.add( new Event("event", Event.Weekday.Wednesday));
        eventsList1.add( new Event("event", Event.Weekday.Wednesday));
        eventsList1.add( new Event("event", Event.Weekday.Thursday));
        eventsList1.add( new Event("event", Event.Weekday.Friday));
        eventsList1.add( new Event("event", Event.Weekday.Saturday));

        // Act
        int countTuesday1 = EventHelper.getCountByWeekday(eventsList1, 2);
        int countMonday1 = EventHelper.getCountByWeekday(eventsList1, 1);

        int countTuesday2 = EventHelper.getCountByWeekday(eventsList2, 2);
        int countWednesday2 = EventHelper.getCountByWeekday(eventsList2, 3);

        // Assert
        assertEquals(3, countTuesday1);
        assertEquals(2, countMonday1);

        assertEquals(0, countTuesday2);
        assertEquals(2, countWednesday2);
    }
}