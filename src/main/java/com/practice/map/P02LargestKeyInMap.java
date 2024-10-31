package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class P02LargestKeyInMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "adi");
        hm.put(2, "diva");
        hm.put(3, "mina");
        largest(hm);

    }
        static void largest(Map<Integer, String> hm){
            int largest = 0;

            for(Map.Entry<Integer, String> entry: hm.entrySet()){
                if(entry.getKey() > largest){
                    largest = entry.getKey();
                }
            }

            System.out.println(largest);

        }
    }

