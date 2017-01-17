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

import com.pfariasmunoz.hairdresser.model.util.Contract.AppointmentEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = AppointmentEntity.TABLE_NAME)
public class Appointment {
    
    @Id @GeneratedValue
    @Column(name = AppointmentEntity.ID)
    private long mId;
    
    @Column(name = AppointmentEntity.DATE_CREATED_COLUMN)
    @Type(type = "date")
    private Date mDateCreated;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = AppointmentEntity.EMPLOYEE_CREATED_FK, nullable = true)
    private Employee mEmployeeCreated;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = AppointmentEntity.CLIENT_FK, nullable = true)
    private Client mClient;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = AppointmentEntity.EMPLOYEE_FK, nullable = true)
    private Employee mEmployee;
    
    @Column(name = AppointmentEntity.CLIENT_NAME_COLUMN)
    private String mClientName;
    
    @Column(name = AppointmentEntity.CLIENT_CONTACT_COLUMN)
    private String mClientContact;
    
    @Column(name = AppointmentEntity.START_TIME_COLUMN)
    @Temporal(TemporalType.TIME)
    private Date mStartTime;
    
    @Column(name = AppointmentEntity.END_TIME_EXPECTED_COLUMN)
    @Temporal(TemporalType.TIME)
    private Date mEndTimeExpected;
    
    @Column(name = AppointmentEntity.END_TIME_COLUMN, nullable = true)
    @Temporal(TemporalType.TIME)
    private Date mEndTime;
    
    @Column(name = AppointmentEntity.PRICE_EXPECTED_COLUMN)
    private BigDecimal mPriceExpected;
    
    @Column(name = AppointmentEntity.PRICE_FULL_COLUMN, nullable = true)
    private BigDecimal mPriceFull;
    
    @Column(name = AppointmentEntity.DISCOUNT_COLUMN, nullable = true)
    private BigDecimal mDiscount;
    
    @Column(name = AppointmentEntity.PRICE_FINAL_COLUMN, nullable = true)
    private BigDecimal mPriceFinal;
    
    @Column(name = AppointmentEntity.CANCELED_COLUMN)
    private boolean mCanceled;
    
    @Column(name = AppointmentEntity.CANCELATION_REASON_COLUMN, nullable = true)
    private String mCancellationReason;
    
    @OneToMany(mappedBy = "mAppointment")
    private List<ServiceBooked> mServicesBookedList;
    
    @OneToMany(mappedBy = "mAppointment")
    private List<ServiceProvided> mServicesProvidedList;

    public Appointment() {
        this.mServicesBookedList = new ArrayList<>();
        this.mServicesProvidedList = new ArrayList<>();
    }

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

    public List<ServiceBooked> getmServicesBookedList() {
        return mServicesBookedList;
    }

    public void setmServicesBookedList(List<ServiceBooked> mServicesBookedList) {
        this.mServicesBookedList = mServicesBookedList;
    }

    public List<ServiceProvided> getmServicesProvidedList() {
        return mServicesProvidedList;
    }

    public void setmServicesProvidedList(List<ServiceProvided> mServicesProvidedList) {
        this.mServicesProvidedList = mServicesProvidedList;
    }
    
}
