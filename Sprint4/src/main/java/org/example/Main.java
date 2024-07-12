package org.example;

import java.util.HashMap;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager makeData = new TaskManager();
        HashMap<Integer, Epic> epicsList = new HashMap<>();
        HashMap<Integer, SubTask> subTasksList = new HashMap<>();
        HashMap<Integer, Task> tasksList = new HashMap<>();
        String name, description, status;
        String naming;
        int id, userPrintMenuInput;

        while (true) {
            printMenu();
            userPrintMenuInput = scanner.nextInt();
            switch (userPrintMenuInput) {
                case 1:
                    System.out.println("Введите объект для вывода информации");
                    naming = scanner.nextLine();
                    makeData.printCollection(naming, epicsList, subTasksList, tasksList);
                case 2:
                    System.out.println("Введите объект для удаления");
                    naming = scanner.nextLine();
                    makeData.deleteCollection(naming, epicsList, subTasksList, tasksList);
                case 3:
                    System.out.println("Введите объект для поиска");
                    naming = scanner.nextLine();
                    System.out.println("Введите ID");
                    id = scanner.nextInt();
                    makeData.idSearch(naming, epicsList, subTasksList, tasksList, id);
                case 4:
                    System.out.println("Введите объект для создания");
                    naming = scanner.nextLine();
                    System.out.println("Введите имя");
                    name = scanner.nextLine();
                    System.out.println("Введите описание");
                    description = scanner.nextLine();
                    makeData.makeObject(name, description, naming, epicsList, subTasksList, tasksList);
                case 5:
                    System.out.println("Введите объект для обновления");
                    naming = scanner.nextLine();
                    System.out.println("Введите ID");
                    id = scanner.nextInt();
                    System.out.println("Введите имя");
                    name = scanner.nextLine();
                    System.out.println("Введите описание");
                    description = scanner.nextLine();
                    makeData.updateObject(naming, epicsList, subTasksList, tasksList, id, name, description);
                case 6:
                    System.out.println("Введите объект для удаления");
                    naming = scanner.nextLine();
                    System.out.println("Введите ID для удаления");
                    id = scanner.nextInt();
                    makeData.deleteForId(naming, epicsList, subTasksList, tasksList, id);
            }
        }
    }


    public static void printMenu() {
        System.out.println("Напишите номер команды:\n" +
                    "1 - Получение списка всех объектов\n" +
                    "2 - Удаление всех объектов\n" +
                    "3 - Получение объекта по идентификатору\n" +
                    "4 - Создание обекта.\n" +
                    "5 - Обновление объекта.\n" +
                    "6 - Удаление объекта по идентификатору.\n");
    }
}
