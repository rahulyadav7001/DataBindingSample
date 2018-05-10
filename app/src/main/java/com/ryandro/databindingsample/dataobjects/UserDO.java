package com.ryandro.databindingsample.dataobjects;

public class UserDO {
    String  userName= "";
    String  userLastName= "";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public UserDO(String userName, String userLastName) {
        this.userName = userName;
        this.userLastName = userLastName;
    }
}
