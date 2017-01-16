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
 * 
 * La tabla <em>employee</em> guarda una lista de los empleados. Sólo contiene
 * datos básicos (nombres y numeros de ID) en vez de otros datos especificos.
 * 
 */
@Entity
@Table(name = "employee")
public class Employee {
    
    @Id
    @Column(name = "id")
    private long mId;
    
    @Column(name = "first_name")
    private String mFirstName;
    
    @Column(name = "last_name")
    private String mLastName;
    
    @OneToMany(mappedBy = "mEmployee")
    private List<Schedule> mScheduleList;
    
    // for the foreing key for employee_created
    @OneToMany(mappedBy = "mEmployeeCreated")
    private List<Schedule> mAppointmentsMadeList;
    
    // for the foreing key employee_id
    @OneToMany(mappedBy = "mEmployee")
    private List<Schedule> mAppointmentList;

    public Employee() {
        mScheduleList = new ArrayList<>();
        mAppointmentsMadeList = new ArrayList<>();
        mAppointmentList = new ArrayList<>();
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
        return mScheduleList;
    }

    public void setmSchedules(List<Schedule> mSchedules) {
        this.mScheduleList = mSchedules;
    }

    public List<Schedule> getmScheduleList() {
        return mScheduleList;
    }

    public void setmScheduleList(List<Schedule> mScheduleList) {
        this.mScheduleList = mScheduleList;
    }

    public List<Schedule> getmAppointmentsMadeList() {
        return mAppointmentsMadeList;
    }

    public void setmAppointmentsMadeList(List<Schedule> mAppointmentsMadeList) {
        this.mAppointmentsMadeList = mAppointmentsMadeList;
    }

    public List<Schedule> getmAppointmentList() {
        return mAppointmentList;
    }

    public void setmAppointmentList(List<Schedule> mAppointmentList) {
        this.mAppointmentList = mAppointmentList;
    }
    
    
}
