package com.company;

public class ExceptionTest{
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exception B");
        } catch (com.company.ExceptionA e) {
            e.printStackTrace();
        }

        try {
            throw new ExceptionC("Exception C");
        } catch (com.company.ExceptionA e) {
            e.printStackTrace();
        }
    }

}