package org.example;

public class SubTask extends Epic{
    String name;
    String description;
    Status status;

    public SubTask(String name,  String description, Status status) {
        super(name, description, status);
    }
}
