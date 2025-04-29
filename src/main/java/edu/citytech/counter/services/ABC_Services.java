package edu.citytech.counter.services;

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

}
