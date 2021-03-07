package com.VB2020.Adapter;

public class AdapterEventToTimetable
             extends Application
             implements TimeTable
{
    @Override
    public void add(String event) {
        save_event();
    }

    @Override
    public void update() {
        update_event();
    }


    @Override
    public void select(String event) {
         load_event();
    }

    @Override
    public void delete(String event) {
         delete_event();
    }
}
