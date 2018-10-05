package com.codingblocks.mynotes;

public class Notes {
    String note,time;

    public Notes(String note, String time) {
        this.note = note;
        this.time = time;

    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
