package io.akeredolu;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */

public class Person {

    Map<String,PhoneNumbers>phoneBookMap;

    public Person(){

        phoneBookMap = new HashMap<>();

    }

    public void addEntries(String name, String number){
        if(phoneBookMap.containsKey(name)){
            phoneBookMap.get(name).addIndividualNumber(number);
        }else {
           PhoneNumbers myPhoneNum =  new PhoneNumbers(number);
            phoneBookMap.put(name,myPhoneNum);
        }


    }

    public void removeEntries(String name){
        phoneBookMap.remove(name);

    }

    public String reverseLookUp(String number){

        //loop through the hashmap and then loop through list of phone numbers
        String foundName = "";
        for (Map.Entry<String,PhoneNumbers>tempPerson : phoneBookMap.entrySet()){

            for(String peopleNumbers : lookup(tempPerson.getKey()).getAllNumbers()){
                if(peopleNumbers.equals(number)){
                     foundName += tempPerson.getKey();
                }

            }
        }


        return foundName;
    }

    public Map<String, PhoneNumbers> getPhoneBookMap() {

        return phoneBookMap;
    }

    public PhoneNumbers lookup(String name) {

        return phoneBookMap.get(name);
    }

}
