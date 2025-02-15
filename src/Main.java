public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println("\n ----- =====   Задание № 1   ===== -----");
        String firstName = "Иванов";
        String middleName = "Иван";
        String lastName = "Иванович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

//        ----- =====   Задание № 2   ===== -----

        System.out.println("\n ----- =====   Задание № 2   ===== -----");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

//        ----- =====   Задание № 3   ===== -----

        System.out.println("\n ----- =====   Задание № 3   ===== -----");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}