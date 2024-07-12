package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class TaskManager {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    //вывод на экран
    public void printCollection(String categoryName, HashMap<Integer, Epic> epicsList,
                                HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList) {
        if (categoryName.equals("эпик")) {
            System.out.println(epicsList);
        } else if (categoryName.equals("задача")) {
            System.out.println(tasksList);
        } else if (categoryName.equals("подзадача")) {
            System.out.println(subTasksList);
        } else {
            System.out.println("Такого объекта нет");
        }
    }


    //удалить коллекцию
    public void deleteCollection(String categoryName, HashMap<Integer, Epic> epicsList,
                                 HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList) {
        if (categoryName.equals("эпик")) {
            epicsList.clear();
        } else if (categoryName.equals("задача")) {
            tasksList.clear();
        } else if (categoryName.equals("подзадача")) {
            subTasksList.clear();
        } else {
            System.out.println("Такого объекта нет");
        }
    }


    //поиск по id
    public Integer idSearch(String categoryName, HashMap<Integer, Epic> epicsList,
                            HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList, int id) {
        if (categoryName.equals("эпик")) {
            for (Integer ID : epicsList.keySet()) {
                if (ID == id) {
                    id = ID;
                }
            }
        } else if (categoryName.equals("задача")) {
            for (Integer ID : tasksList.keySet()) {
                if (ID == id) {
                    id = ID;
                }
            }
        } else if (categoryName.equals("подзадача")) {
            for (Integer ID : subTasksList.keySet()) {
                if (ID == id) {
                    id = ID;
                }
            }
        } else {
            System.out.println("Такого объекта нет");
        }
        return id;
    }




    //создание епика, задачи или подзадачи
    public void makeObject(String name, String description, String categoryName, HashMap<Integer, Epic> epicsList,
                           HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList) {
        if (categoryName.equals("эпик")) {
            count++;
            epicsList.put(count, new Epic(name, description, Status.NEW));
        } else if (categoryName.equals("задача")) {
            count++;
            tasksList.put(hashCode(), new Task(name, description, Status.NEW));
        } else if (categoryName.equals("подзадача")) {
            count++;
            subTasksList.put(hashCode(), new SubTask(name, description, Status.IN_PROGRESS));
        } else {
            System.out.println("Такого объекта нет");
        }
    }


    //обновление объекта
    public void updateObject(String categoryName, HashMap<Integer, Epic> epicsList,
                             HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList, int id,
                             String name, String description) {
        if (categoryName.equals("эпик")) {
            for (Integer ID : epicsList.keySet()) {
                if (ID == id) {
                    epicsList.put(id, new Epic(name, description, Status.NEW));
                }
            }
        } else if (categoryName.equals("задача")) {
            for (Integer ID : tasksList.keySet()) {
                if (ID == id) {
                    epicsList.put(id, new Task(name, description, Status.NEW));
                }
            }
        } else if (categoryName.equals("подзадача")) {
            for (Integer ID : subTasksList.keySet()) {
                if (ID == id) {
                    epicsList.put(id, new SubTask(name, description, Status.NEW));
                }
            }
        } else {
            System.out.println("Такого объекта нет");
        }
    }

    public void deleteForId(String categoryName, HashMap<Integer, Epic> epicsList,
                            HashMap<Integer, SubTask> subTasksList, HashMap<Integer, Task> tasksList, int id) {
        if (categoryName.equals("эпик")) {
            for (Integer ID : epicsList.keySet()) {
                if (ID == id) {
                    epicsList.remove(id);
                }
            }
        } else if (categoryName.equals("задача")) {
            for (Integer ID : tasksList.keySet()) {
                if (ID == id) {
                    tasksList.remove(id);
                }
            }
        } else if (categoryName.equals("подзадача")) {
            for (Integer ID : subTasksList.keySet()) {
                if (ID == id) {
                    subTasksList.remove(id);
                }
            }
        } else {
            System.out.println("Такого объекта нет");
        }
    }
}