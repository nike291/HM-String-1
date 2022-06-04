public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        //Задача 1 - Сложение строк
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println(" ");

        //Задача 2 - Перевод в верхний регистр
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println(" ");

        //Задача 3 - Замена символа ё на е
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё', 'е'));


    }
}