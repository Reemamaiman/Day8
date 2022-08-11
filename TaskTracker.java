package com.example.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor @Data

public class TaskTracker {
    private int ID;
    private String title;
    private String describtion;
    private String status;
}
