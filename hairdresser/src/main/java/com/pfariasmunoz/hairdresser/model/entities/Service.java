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

import com.pfariasmunoz.hairdresser.model.util.Contract.ServiceEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = ServiceEntity.TABLE_NAME)
public class Service {
    
    @Id @GeneratedValue
    @Column(name = ServiceEntity.ID)
    private long mId;
    
    @Column(name = ServiceEntity.NAME_COLUMN)
    private String mServiceName;
    
    @Column(name = ServiceEntity.DURATION_COLUMN)
    private int mDuration;
    
    @Column(name = ServiceEntity.PRICE_COLUMN)
    private BigDecimal mPrice;
    
    @OneToMany(mappedBy = "mService")
    List<ServiceBooked> mServiceBookedList;

    public Service() {
        this.mServiceBookedList = new ArrayList<>();
    }    

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public String getmServiceName() {
        return mServiceName;
    }

    public void setmServiceName(String mServiceName) {
        this.mServiceName = mServiceName;
    }

    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }

    public List<ServiceBooked> getmServiceBookedList() {
        return mServiceBookedList;
    }

    public void setmServiceBookedList(List<ServiceBooked> mServiceBookedList) {
        this.mServiceBookedList = mServiceBookedList;
    }
    
    
    
}
