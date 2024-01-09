package com.example.individual.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor


public class LogsCheck {
    private Map<String, Integer> countries;

    private Map<String, Integer> browsers;

    private Map<String, Integer> operatingSystems;

    private Map<String, Map<String, Integer>> dayAndTime;


}
