/*
Метод вынесен в отдельный класс в соответствии с
S - Single Responsibility Principle - принципом единственной ответственности.
Остальные принципы:
O - Open closed Principle - принцип открытости-закрытости.
L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
I -  Interface Segregation Principle - принцип разделения интерфейсов.
D - Dependency Inversion Principle - принцип инверсии зависимостей.
также были соблюдены.
 */

public class AddStudent extends School {

    public static String addStudent(String name, int phone, int group) {

        Student st = new Student(name, phone, group);
        studList.add(st);
        return "Учащийся добавлен";

    }
}
