package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> people = new ArrayList<>(); // person will save in people
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        TODO 2- is asked if user want to add a person or add information to an existing person
        // the outputs are text files that contain information about people around
//        TODO 1- when user say no as answer to keep adding ro not, program will come back to the loop again, this
//         should be loosed
        Boolean key2 = true;
        while (key2) {
            System.out.println("Enter -1- if you want to add a person\nEnter -2- if you want to add " +
                    "information to a person\nEnter -3- if you want to search a person in system");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                inputPerson();
                System.out.println("if you don't want to add any other person enter (N)\n if not press an " +
                        "other key");
                String ans = scanner.nextLine();
                if (ans.toUpperCase().equals("N")) {
                    key2 = false;
                }
            } else if (choice.equals("2")) {
//                here the mentioned person should be received
                System.out.println("To which person do you want to add?\nwrite the exact First name down");
                String thePerson = scanner.nextLine();
                Person person = findPerson(thePerson);
                if (person != null) {
                    addToPerson(person);
                } else {
                    System.out.println("ERROR: the name is not in the list");
                }
                System.out.println("if you don't want to add to any other person enter (N)\n if not press an" +
                        " other key");
                String ans = scanner.nextLine();
                if (ans.toUpperCase().equals("N")) {
                    key2 = false;
                }
            } else if (choice.equals("3")) {
                System.out.println("which person do you want to search?\nwrite the exact First name down");
                String thePerson = scanner.nextLine();
                Person person = findPerson(thePerson);
//              TODO HINWISE : because we dont collect the information when we start the program and choose the
//               search option program will have error, because there is no information to be shown, we need to write in
//               text or excel file
                System.out.println(person.getFirstName());
                System.out.println(person.getLastName());
                System.out.println(person.getPhoneNumber());
                System.out.println(person.getRelation());
                System.out.println(person.getMeetPlace());
                System.out.println("What other information do you want to see from this person\n -1- General\n " +
                        "-2- Specific");

            }
        }
    }

    //Static means that from this method just one time exist and won't end
//    in method you should write the material of the object method export and the material and name of the imported
//    object
    private static Person findPerson(String thePerson) {
        for (Person person : people) {
            if (person.getFirstName().equals(thePerson)) {
                return person;
            }
        }
        return null;
    }

    /**
     * This method will get a person features and add it to people.
     */
    private static void inputPerson() {
        System.out.println("Enter the Firstname");
        String firstName = scanner.nextLine();
        System.out.println("Enter the Lastname");
        String lastName = scanner.nextLine();
        System.out.println("Enter the place you know him from");
        String meetPlace = scanner.nextLine();
        System.out.println("Enter the relationship type you had with him/her");
        String relation = scanner.nextLine();
        System.out.println("Enter the the Phone number");
        String phoneNumber = scanner.nextLine();
        Person person = new Person(firstName, lastName, meetPlace, relation, phoneNumber);
//        Boolean key1 = true;
//        while (key1) {
//            addToPerson(person); // person is called(passive) by reference because it's an object of a class(Person)
//            System.out.println("Do you want to keep adding information?\nif no press 'N'");
//            String exitAns = scanner.nextLine();
//            if (exitAns == "N") {
//                key1 = false;
//            }
//        }
        people.add(person);
    }

    /**
     * This method will get some details about person and save them.
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
                person.setGeneral(general); // this is the same object we made above
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
                person.setSpecific(specific);// so as this
                break;
            case "3":
                System.out.println("Enter a description for " + person.getFirstName() + " " + person.getLastName() + ".");
                String description = scanner.nextLine();
                person.description.add(description);// or here as before
                break;
            default:
                break;
        }
    }
}
