package com.example.demo3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class TaskClass {

        ArrayList<TaskTracker> Task=new ArrayList<>();

        @PostMapping("/Task")
        public String addUser(@RequestBody TaskTracker Class){
            Task.add(Class);
            return  "all Task";
        }


        @PutMapping("/Task/{index}")
        public usermessage updateUser(@PathVariable int index,@RequestBody TaskTracker Class){
            Task.set(index,Class);
            return "Update Task";
        }



        @DeleteMapping("/Task/{index}")
        public usermessage delete(@PathVariable int index){
            Task.remove(index);
            return new usermessage("Delete");
        }
}
