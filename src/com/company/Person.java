package com.company;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String meetPlace;
    private String relation;
    private boolean validName = true;
    private String phoneNumber;
    public ArrayList<String> description = new ArrayList<>();
    private Specific specific = new Specific();
    private General general = new General();

    public Person(String firstName, String lastName, String meetPlace, String relation,String phoneNumber) {
        if (isName(firstName)) {
            this.firstName = firstName;
        } else {
            System.out.println("The first name was wrong.");
            validName = false;
            return;
        }
        if (isName(lastName)) {
            this.lastName = lastName;
        } else {
            System.out.println("The last name was wrong.");
            validName = false;
            return;
        }
        if (isName(meetPlace)) {
            this.meetPlace = meetPlace;
        } else {
            System.out.println("The meetPlace name was wrong.");
            validName = false;
            return;
        }
        if (isName(relation)) {
            this.relation = relation;
        } else {
            System.out.println("The relation was wrong.");
            validName = false;
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    private boolean isName(String fName) {
        for (int i = 0; i < fName.length(); i++) {
            if (!(fName.charAt(i) >= 'a' && fName.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }
    public void setSpecific(Specific specific){
        this.specific = specific;
    }
    public Specific getSpecific(){
        return this.specific;
    }
    public void setGeneral(General general){
        this.general = general;
    }
    public General getGeneral(){
        return this.general;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMeetPlace() {
        return meetPlace;
    }

    public String getRelation() {
        return relation;
    }

    public boolean isValidName() {
        return validName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
