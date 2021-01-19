package com.project.UserData_Login.userService;

import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;

import javax.mail.MessagingException;
import java.util.List;

public interface userService {

    public UserData addUserSep(USerDataComplete u) throws MessagingException;
    public UserData addUser(UserData user);
    public void removeUser(int id);
    public UserData getUser(String id);
    public void modifyUser(UserData user);
    public List<UserData> getAll();
    public UserData UserLogin(UserData user);
    public void aprove(List<UserData> ud);


    public int forget(UserData userdata);
}
