package com.sharedplanner.studyplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StudyplannerApplication {

    public StudyplannerApplication() {
        System.out.println("-<2>--> Constructor called");
    }

    public static void main(String[] args) {
        System.out.println("-<1>--> before Spring has been started");
        SpringApplication.run(StudyplannerApplication.class, args);
        System.out.println("-<4>--> after Spring has exited");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        System.out.println("-<3>--> doSomethingAfterStartup()");
    }
}