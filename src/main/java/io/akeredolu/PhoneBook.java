package io.akeredolu;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by mikailaakeredolu on 5/16/16.
 */

public class PhoneBook {

    Map<String,PhoneNumbers>phoneBookMap;

    public PhoneBook(){

        phoneBookMap = new HashMap<>();

    }

    public PhoneNumbers lookUp(PhoneNumbers number){
        return phoneBookMap.get(number);

    }

    public void addEntries(String name, PhoneNumbers number){
        phoneBookMap.put(name,number);

    }

    public void removeEntries(String name){
        phoneBookMap.remove(name);

    }

    public PhoneNumbers reverseLookUp(PhoneNumbers number){
        for(String p : phoneBookMap.keySet()){
            number = phoneBookMap.get(p);
        }
        return number;
    }

    public Map<String, PhoneNumbers> getPhoneBookMap() {
        return phoneBookMap;
    }

    //getter




}