package models;

import java.io.Serializable;
import java.sql.Date;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private Date release_date;
    private double sales;
    private String genre;

    public Album() {}
}
