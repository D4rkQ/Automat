package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Max on 28.03.2017.
 */
public class Automat {

    public enum Zustand {z0, z1, z2, z3}
    public enum Buchstabe {a0, a1, a2}

    public Zustand delta(Zustand z, Buchstabe a) {

        Map<String,Zustand> map = new HashMap<>();

        for (Zustand zu:Zustand.values()) {
            for (Buchstabe bu:Buchstabe.values()) {
//                System.out.println(zu.name()+bu.name());
                map.put(zu.name()+bu.name(),Zustand.z0);
            }
        }

//        System.out.println(map.get(z.name()+a.name()));

        return map.get(z.name()+a.name());
    }
}
