package org.personal.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    private static final Map<String, Object> objects = new HashMap<>();

    public static void put(String name, Object value) {
        objects.put(name, value);
    }

    public static Object get(String name) {
        return objects.get(name);
    }
}
