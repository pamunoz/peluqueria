/*
 * Copyright (C) 2017 Your Organisation
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

import com.pfariasmunoz.hairdresser.model.util.Contract.ServiceBookedEntity;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = ServiceBookedEntity.ID)
public class ServiceBooked {
    
    @Id @GeneratedValue
    @Column(name = ServiceBookedEntity.ID)
    private long mId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ServiceBookedEntity.APPOINTMENT_FK)
    private Appointment mAppointment;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ServiceBookedEntity.SERVICE_FK)
    private Service mService;
    
    @Column(name = ServiceBookedEntity.PRICE_COLUMN)
    private BigDecimal mPrice;

    public ServiceBooked() {
    }

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public Appointment getmAppointment() {
        return mAppointment;
    }

    public void setmAppointment(Appointment mAppointment) {
        this.mAppointment = mAppointment;
    }

    public Service getmService() {
        return mService;
    }

    public void setmService(Service mService) {
        this.mService = mService;
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }
    
    
    
}
