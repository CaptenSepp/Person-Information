package com.company;
//TODO Question : i wanted to use ArrayList people in other class (as seen Notification) and intellij has recommended
// that i import people from Main, is that a efficient was or there is better options?
import java.util.ArrayList;

//import static com.company.Main.people;

public class Notification {
    private ArrayList<String> notifications = new ArrayList<>();
    Person person ;
    public static Person notification (){
        for(Person person : Main.people)
            System.out.println(person.getNotification());
        return null;
    }
    public ArrayList<String> getNotofication(){
    return notifications;
    }
}
