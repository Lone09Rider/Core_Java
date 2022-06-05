package com.Exception_Handling.Own_Exception;

public class Age_Invalid_Exception extends Exception
{
    Age_Invalid_Exception()
    {
        super("Age is Invalid");
    }
    Age_Invalid_Exception(String msg)
    {
        super(msg);
    }
}

