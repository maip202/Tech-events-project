package com.example.demo.domain.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="events")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private  String description;
    private  String image;
    private Integer max_people =25;
    private String Date;

    public Event(String barcelona, String s, String s1) {
    }


    public Integer getMaxPeople() { return max_people; }

    public void setMaxPeople(Integer maxPeople) { this.max_people = max_people; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", maxPeople=" + max_people +
                ", Date=" + Date +
                '}';
}
}
