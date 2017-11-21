package com.seapip.teunthomas.javakeep.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(
        name="Note.getAll", query = "SELECT n.id, n.name FROM Note n"
)
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;
    private Date date;

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}