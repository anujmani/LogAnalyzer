package com.example.individual.controller;

import com.example.individual.service.LogsAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController

public class LogController {
    @Autowired
    private LogsAnalyzerService logsAnalyzerService;
    @CrossOrigin("*")
    @GetMapping("/logsCheck")
    private ResponseEntity<?> getLogsData() throws IOException {
        return  ResponseEntity.ok(logsAnalyzerService.getLogs());
    }
}
