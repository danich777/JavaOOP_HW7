/*

Методы были вынесены в отдельный класс в соответствии с
S - Single Responsibility Principle - принципом единственной ответственности.
Остальные принципы:
O - Open closed Principle - принцип открытости-закрытости.
L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
I -  Interface Segregation Principle - принцип разделения интерфейсов.
D - Dependency Inversion Principle - принцип инверсии зависимостей.
также были соблюдены.

Основные принципы ООП также выполняются.
Такие как:
Абстракция, Инкапсуляция, Наследование, Полиморфизм,

 */

import java.util.ArrayList;

public class School {

    public static ArrayList<Student> studList = new ArrayList<>();


    public String getList(int groupNumber) {
        String res = "Учащиеся класса: " + groupNumber + "\n";
        for (Student st : studList) {
            if (st.getGroup() == groupNumber) {
                res = st.getName() + " " + st.getPhone() + "\n";

            }

        }
        return res;

    }


}