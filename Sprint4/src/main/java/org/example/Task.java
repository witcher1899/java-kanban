package org.example;

public class Task extends Epic{
     String name;
     String description;
     Status status;

    public Task (String name, String description, Status status) {
        super(name,  description, status);
    }


}
