package io.akeredolu;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */
public class PhoneBookSpec {

    @Test
    public void addEntriesTest(){
        PhoneBook person1 = new PhoneBook();
        PhoneNumbers person1Number = new PhoneNumbers("7182432603");
        person1.addEntries("Booby Digital", person1Number);

        String expectedEntry = "7182432603";
        String actualEntry = person1Number.getNumber();
        Assert.assertEquals(expectedEntry,actualEntry);
    }

    @Test
    public void lookUpTest(){

    }



}
