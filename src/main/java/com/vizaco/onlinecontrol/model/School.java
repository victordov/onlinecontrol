package com.vizaco.onlinecontrol.model;

import javax.persistence.*;
import java.util.Set;

/**
 *  Simple business object representing a school.
 *
 */
@Entity
@Table(name = "schools")
public class School extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "director")
    private String director;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school", fetch = FetchType.LAZY)
    private Set<Clazz> clazzes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school", fetch = FetchType.LAZY)
    private Set<News> news;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(Set<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }
}
