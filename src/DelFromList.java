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


public class DelFromList extends School{
    public static String delFromList(String name, int phone) {
        boolean result = false;
        for (Student st : studList) {
            if (st.getName().equals(name) && st.getPhone() == phone) {
                studList.remove(st);
                result = true;
                break;
            }
        }
        if (result) {
            return "Учащийся отчислен!";
        } else {
            return "Учащийся не обнаружен.";
        }

    }

}
