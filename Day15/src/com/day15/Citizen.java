package com.day15;

public class Citizen {
  private String name;
  private String aadharNumber;
  private String mobileNumber;
void details(){
    System.out.println("name is"+name);
    System.out.println("adhar card is"+aadharNumber);
    System.out.println("mobile number "+mobileNumber);
}
    public Citizen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
