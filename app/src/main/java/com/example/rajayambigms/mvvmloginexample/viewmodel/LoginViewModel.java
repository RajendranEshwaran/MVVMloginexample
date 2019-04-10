package com.example.rajayambigms.mvvmloginexample.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;
import android.util.Patterns;

import com.example.rajayambigms.mvvmloginexample.model.User;

public class LoginViewModel extends BaseObservable {

    private User user;

    private String succMsg = "Login Successfully";
    private String errMsg = "Invalid Data";

    @Bindable
    private String toastMessage = null;


    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
    }

    public void setUseremail(String uname)
    {
         user.setUsername(uname);
    }
    @Bindable
    public String getUseremail()
    {
        return user.getUsername();
    }

    public void setUserPwd(String uPwd)
    {
        user.setPassword(uPwd);
    }

    @Bindable
    public String getUserPwd()
    {
        return user.getPassword();
    }

    public LoginViewModel()
    {
        user = new User("","");
    }

    public void isOnClicked()
    {
        if(isInputDataValid())
        {
            setToastMessage(succMsg);
        }
        else
        {
            setToastMessage(errMsg);
        }
    }

    public boolean isInputDataValid()
    {
        return !TextUtils.isEmpty(getUseremail()) && Patterns.EMAIL_ADDRESS.matcher(getUseremail()).matches() && getUserPwd().length() > 5;
    }

}
