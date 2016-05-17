package io.akeredolu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */
public class PhoneNumbers {
    List<String>phoneNumbers;

   // private String number;

/*
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
*/
    public PhoneNumbers(String number){
        //this.number = number;
        phoneNumbers = new ArrayList<>();
        addIndividualNumber(number);
    }

    public int getListOfPhoneNumbers(){
        return phoneNumbers.size();

    }

    public List<String> getAllNumbers(){

        return phoneNumbers;
    }

    public void removePhoneNumber(int index){
        phoneNumbers.remove(index - 1);
    }

    public void addIndividualNumber(String number){
        phoneNumbers.add(number);

    }



    public void removeIndividualNumbers(String number){
        phoneNumbers.remove(number);
    }

}
