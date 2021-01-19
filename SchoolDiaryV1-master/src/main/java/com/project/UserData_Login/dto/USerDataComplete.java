package com.project.UserData_Login.dto;


public class USerDataComplete {



    String userId;
    String fName;

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

    public String getfName_f() {
        return fName_f;
    }

    public void setfName_f(String fName_f) {
        this.fName_f = fName_f;
    }

    public String getlName_f() {
        return lName_f;
    }

    public void setlName_f(String lName_f) {
        this.lName_f = lName_f;
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

    public String getEmail_id_f() {
        return email_id_f;
    }

    public void setEmail_id_f(String email_id_f) {
        this.email_id_f = email_id_f;
    }

    public String getMobile_no_f() {
        return mobile_no_f;
    }

    public void setMobile_no_f(String mobile_no_f) {
        this.mobile_no_f = mobile_no_f;
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


    public String getDisApprovalR() {
        return disApprovalR;
    }

    public void setDisApprovalR(String disApprovalR) {
        this.disApprovalR = disApprovalR;
    }

    String fName_f;
    String lName_f;
    String lName;
    String address;
    String city;
    String state;
    String country;
    int role_id;
    String email_id_f;
    String mobile_no_f;
    String dob;
    String gender;
    int student_class;
    int faculty_class;
    String joining_date;
    String securityQuestionId_S;
    String securityQuestionId_F;
    String sQanswer_S;

    public String getSecurityQuestionId_F() {
        return securityQuestionId_F;
    }

    public void setSecurityQuestionId_F(String securityQuestionId_F) {
        this.securityQuestionId_F = securityQuestionId_F;
    }

    String sQanswer_F;

    public String getSecurityQuestionId_S() {
        return securityQuestionId_S;
    }

    public void setSecurityQuestionId_S(String securityQuestionId_S) {
        this.securityQuestionId_S = securityQuestionId_S;
    }


    public String getsQanswer_S() {
        return sQanswer_S;
    }

    public void setsQanswer_S(String sQanswer_S) {
        this.sQanswer_S = sQanswer_S;
    }

    @Override
    public String toString() {
        return "USerDataComplete{" +
                "userId='" + userId + '\'' +
                ", fName='" + fName + '\'' +
                ", fName_f='" + fName_f + '\'' +
                ", lName_f='" + lName_f + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", role_id=" + role_id +
                ", email_id_f='" + email_id_f + '\'' +
                ", mobile_no_f='" + mobile_no_f + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", student_class=" + student_class +
                ", faculty_class=" + faculty_class +
                ", joining_date='" + joining_date + '\'' +
                ", securityQuestionId_S='" + securityQuestionId_S + '\'' +
                ", SecurityQuestionId_F='" + securityQuestionId_F + '\'' +
                ", sQanswer_S='" + sQanswer_S + '\'' +
                ", sQanswer_F='" + sQanswer_F + '\'' +
                ", password='" + password + '\'' +
                ", email_id='" + email_id + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", isActive=" + isActive +
                ", isApproved=" + isApproved +
                ", disApprovalR='" + disApprovalR + '\'' +
                '}';
    }

    public String getsQanswer_F() {
        return sQanswer_F;
    }

    public void setsQanswer_F(String sQanswer_F) {
        this.sQanswer_F = sQanswer_F;
    }

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

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public int getFaculty_class() {
        return faculty_class;
    }

    public void setFaculty_class(int faculty_class) {
        this.faculty_class = faculty_class;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;
    String email_id;
    String mobile_no;
    int isActive;
    int isApproved;
    String disApprovalR;

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(int isApproved) {
        this.isApproved = isApproved;
    }
}
