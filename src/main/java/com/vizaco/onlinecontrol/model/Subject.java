package com.vizaco.onlinecontrol.model;

import javax.persistence.*;

/**
 *  Simple business object representing a attendance.
 *
 */
@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String subjectId;

    @Column(name = "name")
    private String name;

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}