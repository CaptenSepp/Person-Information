package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> people = new ArrayList<>(); // person will save in people
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        TODO 2- is asked if user want to add a person or add information to an existing person
        // the outputs are text files that contain information about people around
        while (true) {

            inputPerson();
            System.out.println("if you don't want to add any other person. enter (N)");
            String ans = scanner.nextLine();
            if (ans.toUpperCase().equals("N")) {
                break;
            }
//            TODO 3- creat a while loop that if user want to add details
//            TODO 4- here should method addToPerson be called
        }
    }

    /**
     * This method will get a person features and add it to people.
     */
    private static void inputPerson() {
        System.out.println("Enter the Firstname and then the Lastname");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Enter the place you know him from");
        String meetPlace = scanner.nextLine();
        System.out.println("Enter the relationship type you had with him/her");
        String relation = scanner.nextLine();
        System.out.println("Enter the the Phonenumber");
        String phoneNumber = scanner.nextLine();
        Person person = new Person(firstName, lastName, meetPlace, relation, phoneNumber);
        while (true) {
            addToPerson(person); // person is called(passive) by reference because it's an object of a class(Person)
//            TODO 1- breaking when user don't want to keep adding information
            break;
        }
        people.add(person);
    }

    /**
     * This method will get some details information about person and save them.
     */
    private static void addToPerson(Person person) { // get person object reference here.
//        here is asked in which part user wants to add

        System.out.println("what do you want to add?\n1.General\n2.Specific\n3.Description\n4.press other keys to exit.");
        String choice1 = scanner.nextLine();
        switch (choice1) {
            case "1":// thans for you that follow with high  :))))) your wellcomeدقت
                System.out.println("what do you want to add?\n1.bornPlace\n2.livePLace\n3.height");
                String choice2 = scanner.nextLine();
                General general = new General();
                System.out.println("Enter your input");
                String input = scanner.nextLine();
                switch (choice2) {
                    case "1":
                        general.setBornPlace(input);
                        break;
                    case "2":
                        general.addLivePlaces(input);
                        break;
                    case "3":
                        general.setHeight(input);
                        break;
                }
                person.setGeneral(general); // این همون object هستش که تو main تعریف کرده بودیم با همون آدرس و در اینجا ازش استفاده میکنیم. یعنی برای add کردن به همون person مورد نظر add میشه.
                break;
            case "2":
                System.out.println("what do you want to add?\n1.workField\n2.studyField");
                choice2 = scanner.nextLine();
                Specific specific = new Specific();
                System.out.println("Enter your input");
                input = scanner.nextLine();
                switch (choice2) {
                    case "1":
                        specific.addWorkField(input);
                        break;
                    case "2":
                        specific.addStudyField(input);
                        break;
                }
                person.setSpecific(specific);// اینجا هم همین طور.
                break;
            case "3":
                System.out.println("Enter a description for " + person.getFirstName() + " " + person.getLastName() + ".");
                String description = scanner.nextLine();
                person.description.add(description);// اینجا هم همین طور
                break;
            default:
                break;
        }
    }
}
