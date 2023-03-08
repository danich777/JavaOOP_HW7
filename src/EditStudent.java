/**
 * Метод вынесен в отдельный класс в соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
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
