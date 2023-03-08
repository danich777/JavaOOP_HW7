/**
 * Метод вынесен в отдельный класс в соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
 */

public class AddStudent extends School {

    public static String addStudent(String name, int phone, int group) {

        Student st = new Student(name, phone, group);
        studList.add(st);
        return "Учащийся добавлен";

    }
}
