package com.VB2020.Adapter;

public class TimeTableRunner {
    public static void main(String[] args) {
        TimeTable timeTable = new AdapterEventToTimetable();
        // можно еще и сам класс Event создать
        timeTable.add("Birthday");
        timeTable.add("Party");
        timeTable.select("Party");
        timeTable.delete("Birthday");
        timeTable.update();
    }
}
