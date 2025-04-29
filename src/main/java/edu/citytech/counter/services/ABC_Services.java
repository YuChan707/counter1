package edu.citytech.counter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABC_Services {
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
        return "AEIOUaeiou".indexOf(letter)>0;
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
        var letters = Arrays.asList(ALPHABET);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

    public List<String> getVowelsUper() {
        var letters = Arrays.asList(ALPHABET);
        var vowels = new ArrayList<String>();
        
        for (String l : letters) {
            if (isVowel(l)) {
                vowels.add(l);
            }
        }
        return vowels;
    }

}
