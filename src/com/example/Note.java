package com.example;

import android.content.Context;
import com.orm.SugarRecord;

public class Note extends SugarRecord<Note>{

    private String title;
    private String description;
    private Tag tag;

    public Note(Context context){
        super(context);
    }

    public Note(Context context, String title, String description, Tag tag) {
        super(context);
        this.title = title;
        this.description = description;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Tag getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return  title + " - " + tag;

    }
}
