package com.company;
//TODO Question : i wanted to use ArrayList people in other class (as seen Notification) and intellij has recommended
// that i import people from Main, is that a efficient was or there is better options?
//      َAnswer = yes, we have better option for do this.
//      When you define a feature static, this is meaning that the feature living is in all of program.
//      people define in Main class and it is static.
//      So, when you want to access it in another class like Notification. just write this.
//      Main.people without any object.
//      with Main.people you access the people in Main class that have all of values that save in it.

import java.util.ArrayList;

//import static com.company.Main.people;

public class Notification {
    private ArrayList<String> notifications = new ArrayList<>();
    Person person ; //TODO Are you sure about it? the mean is all Notification have a person.
    public static Person notification (){
        for(Person person : Main.people)
            System.out.println(person.getNotification());
//        TODO you should write getNotification() method in Person class and then access it here.
        return null;
    }
    public ArrayList<String> getNotofication(){
    return notifications;
    }
}
