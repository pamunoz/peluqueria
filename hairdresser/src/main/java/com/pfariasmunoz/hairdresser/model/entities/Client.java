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

import com.pfariasmunoz.hairdresser.model.util.Contract.ClientEntity;
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
@Table(name = ClientEntity.TABLE_NAME)
public class Client {
    
    @Id
    @Column(name = ClientEntity.ID)
    private long mId;
    
    @Column(name = ClientEntity.NAME_COLUMN)
    private String mName;
    
    @Column(name = ClientEntity.CONTACT_MOBILE_COLUMN, nullable = true)
    private String mMovile;
    
    @Column(name = ClientEntity.CONTACT_MAIL_COLUMN, nullable = true)
    private String mMail;
    
    @OneToMany(mappedBy = "mClient")
    private List<Appointment> mAppointmentList;

    public Client() {
        this.mAppointmentList = new ArrayList<>();
    }
    
    public Client(String name) {
        this.mName = name;
        this.mAppointmentList = new ArrayList<>();
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

    public String getmMail() {
        return mMail;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail;
    }

    public List<Appointment> getmAppointmentList() {
        return mAppointmentList;
    }

    public void setmAppointmentList(List<Appointment> mAppointmentList) {
        this.mAppointmentList = mAppointmentList;
    }
    
    
}
