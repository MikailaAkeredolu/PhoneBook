package io.akeredolu;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */
public class PhoneBookSpec {

    @Test
    public void addEntriesTest(){
        Person person1 = new Person();
        String number = "7182432603";
        person1.addEntries("Booby Digital", number);
        boolean expectedEntry = true;
        boolean actualEntry = person1.lookup("Booby Digital").getAllNumbers().contains(number);
        Assert.assertEquals(expectedEntry,actualEntry);
    }

    @Test
    public void lookUpTest(){
        Person person = new Person();
        String contactName = "Mike Jones";
        String contactNumber = "7182432603";
        person.addEntries(contactName,contactNumber);
        boolean expectedValue = true;
        boolean actualValue = person.lookup(contactName).getAllNumbers().contains("7182432603");
        Assert.assertEquals(expectedValue,actualValue);


    }

    @Test
    public void removeEntriesSet(){
        Person james = new Person();
        String anotherEntry = "2122122122";
        james.addEntries(anotherEntry,"james");
        PhoneNumbers resultBeforeRemoval = james.lookup(anotherEntry);
        james.removeEntries(anotherEntry);
        PhoneNumbers resultAfterRemoval = james.lookup(anotherEntry);
        Assert.assertNull(resultAfterRemoval);
        Assert.assertNotEquals(resultBeforeRemoval,resultAfterRemoval);
    }



}
