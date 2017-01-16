/*
 * Copyright (C) 2017 pfariasmunoz@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.pfariasmunoz.hairdresser.model.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "appointment")
public class Appointment {
    
    @Id
    @Column(name = "id")
    private long mId;
    
    @Column(name = "date_created")
    @Type(type = "date")
    private Date mDateCreated;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_created", nullable = true)
    private Employee mEmployeeCreated;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = true)
    private Client mClient;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = true)
    private Employee mEmployee;
    
    @Column(name = "client_name")
    private String mClientName;
    
    @Column(name ="client_contact")
    private String mClientContact;
    
    @Column(name = "start_time")
    @Type(type = "timestamp")
    private Date mStartTime;
    
    @Column(name = "end_time_expected")
    @Type(type = "timestamp")
    private Date mEndTimeExpected;
    
    @Column(name = "end_time", nullable = true)
    @Type(type = "timestamp")
    private Date mEndTime;
    
    @Column(name = "price_expected")
    private BigDecimal mPriceExpected;
    
    @Column(name = "price_full", nullable = true)
    private BigDecimal mPriceFull;
    
    @Column(name = "discount", nullable = true)
    private BigDecimal mDiscount;
    
    @Column(name = "price_final", nullable = true)
    private BigDecimal mPriceFinal;
    
    @Column(name = "canceled")
    private boolean mCanceled;
    
    @Column(name = "cancellation_reason", nullable = true)
    private String mCancellationReason;

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public Date getmDateCreated() {
        return mDateCreated;
    }

    public void setmDateCreated(Date mDateCreated) {
        this.mDateCreated = mDateCreated;
    }

    public String getmClientName() {
        return mClientName;
    }

    public void setmClientName(String mClientName) {
        this.mClientName = mClientName;
    }

    public String getmClientContact() {
        return mClientContact;
    }

    public void setmClientContact(String mClientContact) {
        this.mClientContact = mClientContact;
    }

    public Date getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(Date mStartTime) {
        this.mStartTime = mStartTime;
    }

    public Date getmEndTimeExpected() {
        return mEndTimeExpected;
    }

    public void setmEndTimeExpected(Date mEndTimeExpected) {
        this.mEndTimeExpected = mEndTimeExpected;
    }

    public Date getmEndTime() {
        return mEndTime;
    }

    public void setmEndTime(Date mEndTime) {
        this.mEndTime = mEndTime;
    }

    public BigDecimal getmPriceExpected() {
        return mPriceExpected;
    }

    public void setmPriceExpected(BigDecimal mPriceExpected) {
        this.mPriceExpected = mPriceExpected;
    }

    public BigDecimal getmPriceFull() {
        return mPriceFull;
    }

    public void setmPriceFull(BigDecimal mPriceFull) {
        this.mPriceFull = mPriceFull;
    }

    public BigDecimal getmDiscount() {
        return mDiscount;
    }

    public void setmDiscount(BigDecimal mDiscount) {
        this.mDiscount = mDiscount;
    }

    public BigDecimal getmPriceFinal() {
        return mPriceFinal;
    }

    public void setmPriceFinal(BigDecimal mPriceFinal) {
        this.mPriceFinal = mPriceFinal;
    }

    public boolean ismCanceled() {
        return mCanceled;
    }

    public void setmCanceled(boolean mCanceled) {
        this.mCanceled = mCanceled;
    }

    public String getmCancellationReason() {
        return mCancellationReason;
    }

    public void setmCancellationReason(String mCancellationReason) {
        this.mCancellationReason = mCancellationReason;
    }

    public Employee getmEmployeeCreated() {
        return mEmployeeCreated;
    }

    public void setmEmployeeCreated(Employee mEmployeeCreated) {
        this.mEmployeeCreated = mEmployeeCreated;
    }

    public Client getmClient() {
        return mClient;
    }

    public void setmClient(Client mClient) {
        this.mClient = mClient;
    }

    public Employee getmEmployee() {
        return mEmployee;
    }

    public void setmEmployee(Employee mEmployee) {
        this.mEmployee = mEmployee;
    }
    
}
