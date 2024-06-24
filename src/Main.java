import java.util.Scanner; /// Подключение библиотеки

public class Main {
    public static void main(String[] args) {

        ///Задача 1
        System.out.println("Задача 1");

        Scanner read = new Scanner(System.in); ///Создаем обьект, даем понять от куда запрашивать данные

        System.out.print("Введите возраст человека: ");
        int age = read.nextInt(); ///используем двнные введеные пользователем

        if (age >= 18) {
            System.out.println("Если возраст человека равен - " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен - " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        ///Задача 2
        System.out.println();
        System.out.println("Задача 2");

        System.out.print("Введите температуру на улице ");
        int temperature = read.nextInt();

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        ///Задача 3
        System.out.println();
        System.out.println("Задача 3");

        System.out.print("Введите скорость водителя ");
        int speed = read.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость - " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость - " + speed + ", то можно ездить спокойно");
        }

        /// Задача 4
        System.out.println();
        System.out.println("Задача 4");

        System.out.print("Введите возраст человека ");
        int age2 = read.nextInt();
        //boolean school = age2 > 7 && age2 <= 18; /// можно было решить и таким способом.

        if (age2 < 2) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему пора спать.");
        } else if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить в университет");
        } else if (age2 >= 24 && age2 <= 60) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему необходим отдых");
        }

        ///Задача 5
        System.out.println();
        System.out.println("Задача 5");

        System.out.print("Введите вораст ребенка ");
        int age3 = read.nextInt();

        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        ////задача6
        System.out.println();
        System.out.println("Задача 6");

        System.out.print("Введите количество пассажиров ");
        int numberOfPassengers = read.nextInt();

        if (numberOfPassengers < 60) {
            System.out.println("Если количество пассажиров равно " + numberOfPassengers + " в вагоне есть сидячие места");
        } else if (numberOfPassengers >= 60 && numberOfPassengers < 102) {
            System.out.println("Если количество пассажиров равно " + numberOfPassengers + " в вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }

        ////задача6
        System.out.println();
        System.out.println("Задача 7");

        System.out.print("Введите первое число ");
        int one = read.nextInt();

        System.out.print("Введите второе число ");
        int two = read.nextInt();

        System.out.print("Введите третье число ");
        int three = read.nextInt();

        if (one > two && one > three) {
            System.out.println("Чило " + one + " наибольшее" + " из введеных");
        } else if (two > one && two > three) {
            System.out.println("Чило " + two + " наибольшее" + " из введеных");
        } else if (one == two && one == three) {
            System.out.println("Все числа равны между собой45");
        } else {
            System.out.println("Чило " + three + " наибольшее" + " из введеных");
        }
    }
}