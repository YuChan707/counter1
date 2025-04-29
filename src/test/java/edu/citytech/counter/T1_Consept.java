package edu.citytech.counter;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;


public class T1_Consept {
    public int boobooo(){
        return 4 *3;
    }
    public int ItDoesNotMatter(){
        return 4 *5;
    }
    public String _2doExample(){
        return 20 * 4 *5 + "";
    }

    @Test 
    public void t1(){
        Supplier<Integer> s1 = this::boobooo;
        Supplier<Integer> s2 = this::ItDoesNotMatter;
        Supplier<String> s3 = this::_2doExample;

        int x = s2.get();
        int y = s1.get();
        String z = s3.get();

        System.out.println("s2 = this::ItDoesNotMatter = " + x);
        System.out.println("s1 = this::boobooo = " + y);
        System.out.println("s3 = this::_2doExample = " + z);
    }

    @Test
    public void t2(){
        int a = 0;
        Supplier<Integer> s1 = this::boobooo;
        Supplier<Integer> s2 = this::ItDoesNotMatter;
        
        Map<Integer, Supplier<Integer>> map = new HashMap<>();
        map.put(1, s1);
        map.put(2, s2);

        Supplier<Integer> o = map.get(1);
        System.out.println("o = map.get(1) = " + o.get());

        o = map.get(2);
        System.out.println("o = map.get(2) = " + o.get());
    }
}
