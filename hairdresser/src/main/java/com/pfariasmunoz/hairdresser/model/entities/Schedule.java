/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfariasmunoz.hairdresser.model.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "schedule")
public class Schedule {
    
    @Id
    @Column(name = "id")
    private  long mId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee mEmployee;
    
    private Date mFrom;
    
    private Date mTo;

    public Schedule() {
    }
       

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public Employee getmEmployee() {
        return mEmployee;
    }

    public void setmEmployee(Employee mEmployee) {
        this.mEmployee = mEmployee;
    }

    public Date getmFrom() {
        return mFrom;
    }

    public void setmFrom(Date mFrom) {
        this.mFrom = mFrom;
    }

    public Date getmTo() {
        return mTo;
    }

    public void setmTo(Date mTo) {
        this.mTo = mTo;
    }     
    
}
