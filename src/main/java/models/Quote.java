package models;

import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private String text;
    private String authorName;

    // Constructor
    public Quote(int id, String text, String name) {
        this.id = id;
        this.text = text;
        this.authorName = name;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorId(String name) {
        this.authorName = name;
    }
}
