package com.company;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String meetPlace;
    private String relation;
    private String phoneNumber;
    private boolean validName = true;
    private General general = new General();
    private Specific specific = new Specific();
    public ArrayList<String> description = new ArrayList<>();
    private Notification notificationObj = new Notification();

    /**
     * this constructor get the arguments from user in method main and evaluate the fields of Person class
     */
    public Person(String firstName, String lastName, String meetPlace, String relation, String phoneNumber) {
        /**this if checks if the Entered arguments is a valid name because a name can't contain numbers or symbols*/
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

    /**
     * this methods evaluate the fields of specific objects of person objects
     */
    public void setSpecific(Specific specific) {
        this.specific = specific;
    }

    public Specific getSpecific() {
        return this.specific;
    }

    /**
     * this methods evaluate the fields of General objects of person objects
     */
    public void setGeneral(General general) {
        this.general = general;
    }

    public General getGeneral() {
        return this.general;
    }

    // here are the Getters for person primitive information
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //    public boolean isValidName() {
//        return validName;
//    }
//
    public void addNotification(String notification) {
        notificationObj.notifications.add(notification);
    }
}
