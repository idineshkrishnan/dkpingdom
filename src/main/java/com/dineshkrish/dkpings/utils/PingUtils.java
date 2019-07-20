package com.dineshkrish.dkpings.utils;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PingUtils {

    public static boolean isAlive(final String url) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        try {
            HttpResponse response = httpClient.execute(new HttpGet(url));
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode == HttpStatus.SC_OK) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }



    public static void main(String[] args) {

        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if(isAlive("http://localhost:8080")) {
                    System.out.println("All Good");
                } else {
                    System.out.println("Down");
                }
            }
        }, 10, 10, TimeUnit.SECONDS);
    }
}
