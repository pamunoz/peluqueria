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

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "client")
public class Client {
    
    @Id
    @Column(name = "id")
    private long mId;
    
    @Column(name = "client_name")
    private String mName;
    
    @Column(name = "contact_movile")
    private String mMovile;
    
    @Column(name = "contact_phone")
    private String mPhone;
    
    @OneToMany(mappedBy = "mClient")
    private List<Appointment> mAppointmentList;

    public Client() {
        this.mAppointmentList = new ArrayList<Appointment>();
    }

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmMovile() {
        return mMovile;
    }

    public void setmMovile(String mMovile) {
        this.mMovile = mMovile;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public List<Appointment> getmAppointmentList() {
        return mAppointmentList;
    }

    public void setmAppointmentList(List<Appointment> mAppointmentList) {
        this.mAppointmentList = mAppointmentList;
    }
    
    
}