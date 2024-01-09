package com.example.individual.constant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LogConstants {
    public static final Map<String, Integer> countryCount = new ConcurrentHashMap<>();
    public static final Map<String, Integer> browserCount =  new ConcurrentHashMap<>();
    public static final Map<String, Integer> osCount =  new ConcurrentHashMap<>();
    public static final Map<String, Map<String, Integer>> dayTimeCount =  new ConcurrentHashMap<>();
}
