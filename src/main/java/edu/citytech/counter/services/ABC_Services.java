package edu.citytech.counter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import jakarta.inject.Singleton;

@Singleton
// @Singleton is a Micronaut annotation that indicates that this class is a singleton bean.
public class ABC_Services {
    //start t use Map
    Map<String, Supplier<List<String>>> map = new HashMap<>();

    public ABC_Services(){
        System.out.println("I am alive, and today is "+ new Date());
        map.put("v",this::getVowelsLower);
        map.put("V",this::getVowelsUpper);
        map.put("c",this::getConsonantLower);
        map.put("C",this::getConsonantUpper);
        map.put("a",this::get_abc);
        map.put("A",this::get_ABC);
    }

    public Object getData(String keyWord){
        List<String> data = map.get(keyWord).get();

        Map<String, Object> mapResult = new HashMap<>();
        mapResult.put("size", data.size());
        mapResult.put("data", data);
        mapResult.put("developver", " - YUZHEN CHEN -");
        return mapResult;
    }

    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";

    private static final String[] alphabet = ABC.split("");
    private static final String[] ALPHABET = ABC.toUpperCase().split("");

    public List<String> get_abc() {
        return Arrays.asList(alphabet);
    }
    public List<String> get_ABC() {
        return Arrays.asList(ALPHABET);
    }

    public boolean isVowel(String letter){
        return "AEIOUaeiou".indexOf(letter)>-1;
    }
    public List<String> getVowels() {
        var letters = Arrays.asList(ALPHABET);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

    public List<String> getVowelsLower() {
        var letters = Arrays.asList(alphabet);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

    public List<String> getVowelsUpper() {
        var letters = Arrays.asList(ALPHABET);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

    public List<String> getConsonantLower() {
        var letters = Arrays.asList(alphabet);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (!isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

    public List<String> getConsonantUpper() {
        var letters = Arrays.asList(ALPHABET);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (!isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

}
