package com.example.ql_thuchi.database;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")
public class Thu {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String category;

    private String note;

    private String date;

    private String amount;

    public Thu(String category, String note, String date, String amount) {
        this.category = category;
        this.note = note;
        this.date = date;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getNote() {
        return note;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }
}
