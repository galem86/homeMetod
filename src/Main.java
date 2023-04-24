// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" задача1");
        String firstName = " Ivan ";
        String middleName = "Ivanovich";
        String  lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        System.out.println("Задача2");
        String firstName1 = " Ivanov Ivan Ivanovich";
        String firstNameTrue = firstName1.replace("i", "I");
        System.out.println(firstNameTrue);
        System.out.println("");

        System.out.println("Задача3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2True = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullName2);


    }
}