/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfariasmunoz.hibernatejpaexample.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    private Long mId;
    
    @Column(name = "first_name")
    private String mFirstName;
    
    @Column(name = "last_name")
    private String mLastName;
    
    @Column(name = "birthdate")
    private Date mBirthDate;

    public Employee() {
    }

    public Employee(Long mId, String mFirstName, String mLastName, Date mBirthDate) {
        this.mId = mId;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mBirthDate = mBirthDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "Id=" + mId + ", firstName=" + mFirstName + ", lastName=" + mLastName + ", birthDate=" + mBirthDate + '}';
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public Date getmBirthDate() {
        return mBirthDate;
    }

    public void setmBirthDate(Date mBirthDate) {
        this.mBirthDate = mBirthDate;
    }
    
        
}
