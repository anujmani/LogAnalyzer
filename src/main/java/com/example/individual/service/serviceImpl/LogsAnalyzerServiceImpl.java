package com.example.individual.service.serviceImpl;

import com.example.individual.entity.LogsCheck;
import com.example.individual.service.LogsAnalyzerService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.example.individual.constant.LogConstants.*;

@Service
public class LogsAnalyzerServiceImpl implements LogsAnalyzerService  {

    @Override
    public Object getLogs() throws IOException {


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        countryCount.clear();
        dayTimeCount.clear();
        osCount.clear();
        browserCount.clear();
        FileReader file = new FileReader("C:\\Users\\Lenovo\\Downloads\\Csv-dcp\\Csv-dcp\\src\\main\\resources\\data" +
                "\\Web_Server_Log.csv");

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread());
                readFile(file);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new LogsCheck(countryCount, browserCount, osCount, dayTimeCount);


    }

    public static void readFile(FileReader file) throws IOException {
        System.out.println("hojfog");
        BufferedReader reader = new BufferedReader(file);

        reader.lines().parallel().forEach(line -> {
            String[] values = line.split(",");
            String time = values[0].trim();
            String day = values[3].trim();


            countryCount.merge(values[1], 1, Integer::sum);
            osCount.merge(values[4], 1, Integer::sum);
            browserCount.merge(values[5], 1, Integer::sum);
            dayTimeCount
                    .computeIfAbsent(day, k -> new HashMap<>())
                    .merge(time, 1, Integer::sum);
        });
    }
}
