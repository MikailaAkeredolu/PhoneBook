package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */
public class App {

    public static void main(String[] args) {
        /*
        Person person1 = new Person();
        PhoneNumbers person1Number = new PhoneNumbers("718-243-2603");
        person1.addEntries("Booby Digital", "2127867654");
        */

        Person person2 = new Person();
        //PhoneNumbers person2Number = new PhoneNumbers("718-243-2603");

        person2.addEntries("Digital", "132467654");
        String result = person2.reverseLookUp("132467654");
        System.out.println(result+"oo");


        //System.out.println(person1Number.getPhoneNumbers());
    }
}
