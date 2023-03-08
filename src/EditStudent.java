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


public class EditStudent extends School{

    public static String editStudent(String name, int phone, int group) {
        for (Student st : studList) {
            if (st.getName().equals(name)) {
                st.setPhone(phone);
                st.setGroup(group);
                break;
            }

        }
        return "Информация обновлена";
    }

}
