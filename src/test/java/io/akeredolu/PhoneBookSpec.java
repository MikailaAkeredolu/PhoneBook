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
        PhoneBook phoneBook = new PhoneBook();
        String contactNumber = "7182432603";
        phoneBook.addEntries(contactNumber, new PhoneNumbers(contactNumber));
        Assert.assertNotNull(phoneBook.lookup(contactNumber));
    }

    @Test
    public void removeEntriesSet(){
        PhoneBook urbanPhone = new PhoneBook();
        String anotherEntry = "2122122122";
        urbanPhone.addEntries(anotherEntry,new PhoneNumbers(anotherEntry));
        PhoneNumbers resultBeforeRemoval = urbanPhone.lookup(anotherEntry);
        urbanPhone.removeEntries(anotherEntry);
        PhoneNumbers resultAfterRemoval = urbanPhone.lookup(anotherEntry);
        Assert.assertNull(resultAfterRemoval);
        Assert.assertNotEquals(resultBeforeRemoval,resultAfterRemoval);
    }



}
