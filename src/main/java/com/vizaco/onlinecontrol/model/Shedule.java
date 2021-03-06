package com.vizaco.onlinecontrol.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 *  Simple business object representing a shedule.
 *
 */
@Entity
@Table(name = "shedule")
public class Shedule extends BaseEntity{

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
    private Date startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
    private Date endDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="subject_id")
    private Subject subject;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="clazz_id")
    private Clazz clazz;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="teacher_id")
    private Teacher teacher;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
