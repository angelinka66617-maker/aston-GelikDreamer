package lesson_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        StudentManager studentManager = new StudentManager();

        students.add(new Student("Федя", "Группа А", 2, Arrays.asList(5, 8, 7, 1)));
        students.add(new Student("Надя", "Группа А", 1, Arrays.asList(3, 1, 1, 1)));
        students.add(new Student("Света", "Группа А", 2, Arrays.asList(6, 8, 7, 1)));
        students.add(new Student("Антон", "Группа А", 3, Arrays.asList(4, 2, 7, 1)));
        students.add(new Student("Клава", "Группа А", 2, Arrays.asList(2, 2, 2, 2)));

        studentManager.removeLowAverage(students);
        studentManager.promoteStudents(students);
        studentManager.printStudents(students, 2);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+35748658596");
        phoneBook.add("Петров", "+37565458541");
        phoneBook.add("Теплова", "+37213658782");
        phoneBook.add("Огурцов", "+35555239511");
        phoneBook.add("Иванов", "+35656566665");

        phoneBook.printPhoneBook();

        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Теплова: " + phoneBook.get("Теплова"));
        System.out.println("Огурцов: " + phoneBook.get("Огурцов"));
    }
}
