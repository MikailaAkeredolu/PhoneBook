package io.akeredolu;

import java.util.ArrayList;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */
public class App {

    public static void main(String[] args) {

        PhoneBook person1 = new PhoneBook();
        PhoneNumbers person1Number = new PhoneNumbers("718-243-2603");
        person1.addEntries("Booby Digital", person1Number);

        PhoneBook person2 = new PhoneBook();
        PhoneNumbers person2Number = new PhoneNumbers("718-419-0003");
        person2.addEntries("OG Bobby Johnson", person2Number);

        System.out.println(person1Number.getNumber());
    }
}
