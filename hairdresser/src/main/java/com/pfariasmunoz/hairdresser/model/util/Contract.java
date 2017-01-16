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
package com.pfariasmunoz.hairdresser.model.util;

/**
 *
 * @author pablo
 */
public class Contract {
    
    public static class ClientEntity {
        
        public static final String TABLE_NAME = "client";
        public static final String ID = "id";
        public static final String NAME_COLUMN = "client_name";
        public static final String CONTACT_MOBILE_COLUMN = "client_mobile";
        public static final String CONTACT_MAIL_COLUMN = "client_mail";      
    }
    
    public static class EmployeeEntity {
        
        public static final String TABLE_NAME = "employee";
        public static final String ID = "id";
        public static final String FIRST_NAME_COLUMN = "first_name";
        public static final String LAST_NAME_COLUMN = "last_name";
        
    }
    
    public static class ScheduleEntity {
        
        public static final String TABLE_NAME = "schedule";
        public static final String ID = "id";
        public static final String EMPLOYEE_FK = "employee_id";
        public static final String FROM_COLUMN = "from";
        public static final String TO_COLUMN = "to";
    }
    
    public static class AppointmentEntity {
        
        public static final String TABLE_NAME = "appointment";
        public static final String ID = "id";
        public static final String DATE_CREATED_COLUMN = "date_created";
        public static final String EMPLOYEE_CREATED_FK = "employee_created";
        public static final String CLIENT_FK = "client_id";
        public static final String EMPLOYEE_FK = "employee_id";
        public static final String CLIENT_NAME_COLUMN = "client_name";
        public static final String CLIENT_CONTACT_COLUMN = "client_contact";
        public static final String START_TIME_COLUMN = "start_time";
        public static final String END_TIME_EXPECTED_COLUMN = "end_time_expected";
        public static final String END_TIME_COLUMN = "end_time";
        public static final String PRICE_EXPECTED_COLUMN = "price_expected";
        public static final String PRICE_FULL_COLUMN = "price_full";
        public static final String DISCOUNT_COLUMN = "discount";
        public static final String PRICE_FINAL_COLUMN = "price_final";
        public static final String CANCELED_COLUMN = "canceled";
        public static final String CANCELATION_REASON_COLUMN = "cancellation_reason";
        
        
    }
    
    public static class ServiceEntity {
        
        public static final String TABLE_NAME = "service";
        public static final String ID = "id";
        public static final String NAME_COLUMN = "service_name";
        public static final String DURATION_COLUMN = "duration";
        public static final String PRICE_COLUMN = "price";
    }
    
    public static class ServiceBookedEntity {
        
        public static final String TABLE_NAME = "service_booked";
        public static final String ID = "id";
        public static final String APPOINTMENT_FK = "appointment_id";
        public static final String SERVICE_FK = "service_id";
        public static final String PRICE_COLUMN = "price";
        
        
    }
    
    public static class ServiceProvidedEntity {
        
    }
}
