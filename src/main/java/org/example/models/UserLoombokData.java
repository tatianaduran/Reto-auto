package org.example.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserLoombokData {
    String  phoneNumber,pass, dynamicKey;



    public static List<UserLoombokData> setData(DataTable table){
        List<UserLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, UserLoombokData.class));
        }
        return data;
    }

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    /* public String getCountryCode() {return countryCode;} */

    public String getPass() {return pass;}

    public String getDynamicKey() {return dynamicKey;}

    public void setDynamicKey(String dynamicKey) {this.dynamicKey = dynamicKey;}

    public void setPass(String pass) {this.pass = pass;}

    /* public void setCountryCode(String countryCode) {this.countryCode = countryCode;} */
}
