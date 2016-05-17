package io.akeredolu;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by mikailaakeredolu on 5/17/16.
 */
public class PhoneNumberTest {

    @Test
    public void addIndividualNumberTest(){
        PhoneNumbers theNumber = new PhoneNumbers("7182432603");
        theNumber.addIndividualNumber("3027504171");
        int actualNumber = theNumber.getListOfPhoneNumbers();
        int expectedNumber = 1;
        assertEquals(expectedNumber,actualNumber);
    }
    @Test
    public void testNumber(){

        assertEquals("8182123333", new PhoneNumbers("8182123333").getPhoneNumbers());
    }

    @Test
    public void removeIndividualNumbers(){
        PhoneNumbers theNumber = new PhoneNumbers("123456");

        theNumber.addIndividualNumber("1234567");
        theNumber.removePhoneNumber(1);

        int actualNumber = theNumber.getListOfPhoneNumbers();
        int expectedNumber  = 0;
        assertEquals(expectedNumber, actualNumber);

    }
}
