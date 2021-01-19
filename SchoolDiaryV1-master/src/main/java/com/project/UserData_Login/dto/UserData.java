package com.project.UserData_Login.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserData {

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }



    public int getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(int isApproved) {
        this.isApproved = isApproved;
    }

    @Id
    String userId;
    @Column(nullable = false)
    String fName;
    @Column(nullable = false)
    String lName;
    @Column(nullable = false)
    String address;
    @Column(nullable = false)
    String city;
    @Column(nullable = false)
    String state;
    @Column(nullable = false)
    String country;
    @Column(nullable = false)
    int role_id;

    @Column(unique=true)
    String email_id;
    @Column(unique=true)
    String mobile_no;
    @Column(nullable = false)
    String password;

    public String getSecurity_q_id() {
        return security_q_id;
    }

    public void setSecurity_q_id(String security_q_id) {
        this.security_q_id = security_q_id;
    }

    public String getSecurity_q_A() {
        return security_q_A;
    }

    public void setSecurity_q_A(String security_q_A) {
        this.security_q_A = security_q_A;
    }

    @Column(nullable = false)
    String security_q_id;
    @Column(nullable = false)
    String security_q_A;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    int isApproved;
    String dob;

    @Override
    public String toString() {
        return "UserData{" +
                "userId='" + userId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", role_id=" + role_id +
                ", email_id='" + email_id + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", password='" + password + '\'' +
                ", security_q_id='" + security_q_id + '\'' +
                ", security_q_A='" + security_q_A + '\'' +
                ", isApproved=" + isApproved +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    String gender;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
