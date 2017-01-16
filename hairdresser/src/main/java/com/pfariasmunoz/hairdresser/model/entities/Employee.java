package com.pfariasmunoz.hairdresser.model.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author pablo
 */
@Entity
public class Employee {
    
    @Id
    @Column(name = "id")
    private long mId;
    
    @Column(name = "first_name")
    private String mFirstName;
    
    @Column(name = "last_name")
    private String mLastName;
    
    @OneToMany(mappedBy = "mEmployee")
    private List<Schedule> mSchedules;

    public Employee() {
        mSchedules = new ArrayList<Schedule>();
    }   

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
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

    public List<Schedule> getmSchedules() {
        return mSchedules;
    }

    public void setmSchedules(List<Schedule> mSchedules) {
        this.mSchedules = mSchedules;
    }
    
    
}
