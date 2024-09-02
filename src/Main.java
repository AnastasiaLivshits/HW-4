import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Task1");
            int ageDriver = 45; //задаем возраст человека
            if (ageDriver >= 18) {
                System.out.println("Если возраст человека равен " + ageDriver + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + ageDriver + ", то он несовершеннолетний");
                System.out.println();

                System.out.println("Task 2");
                int tmp = 2; // задаем температуру
                if (tmp < 5) {
                    System.out.println("на улице " + tmp + " градусов, нужно надеть шапку.");
                } else {
                    System.out.println("на улице " + tmp + " градусов, можно идти без шапки.");
                }
                System.out.println();

                System.out.println("Task3");
                int speed = 70; //задаем скорость
                if (speed >= 60) {
                    System.out.println(" Если скорость больше" + speed + " км, то придется заплатить штраф");
                } else {
                    System.out.println("Если скорость меньше " + speed + " можно ездить спокойно");
                }
                System.out.println();

                System.out.println("Task4");
                int age = 70; // ввести значение возраста
                if (age >= 2 && age <= 6) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
                } else if (age >= 7 && age <= 17) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
                } else if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
                }
                System.out.println();

                System.out.println("Task5");
                int ageMin = 5;
                int ageChild = 20; //  вводим возраст ребенка
                if (ageChild < ageMin) {
                    System.out.println("Если возраст ребенка меньше " + ageMin + ", тогда ему нельзя кататься" + " на каруселях.");
                } else if (ageChild >= 5 && ageChild <= 14) {
                    System.out.println("Если возраст ребенка больше 5 , и меньше 14, тогда ему можно кататься только в сопровождении взрослого." + " Если взрослого нет, кататься нельзя.");
                } else {
                    System.out.println("Если возраст ребенка больше 14и лет, ,то он может кататься без сопровождения взрослого.");
                }
                System.out.println();

                System.out.println("Task 6");
                int Total = 102;
                int busySittingPlace = 60;// ввести количество занятых сидячих мест
                int busyStayingPlace = 62; // ввести колличество занятых стоячих мест
                int sittingTotal = 60;
                if (busySittingPlace < sittingTotal && busyStayingPlace < Total - sittingTotal) {
                    System.out.println("В вагоне есть сидячие и стоячие места");
                } else if (busySittingPlace >= sittingTotal && busyStayingPlace < Total - sittingTotal) {
                    System.out.println("В вагоне есть только стоячие места");
                } else {
                    System.out.println("В вагоне нет свободных мест");
                }
                System.out.println();

                System.out.println("Task7");
                int one = 200;
                int two = 50;
                int three = 33;
                if (one > two && one > three) {
                    System.out.println("Первое число самое большое и равно" + one);
                } else if (two > one && two > three) {
                    System.out.println("Второе число самое большое и равно" + two);
                } else if (three > one && three > two) {
                    System.out.println("Третье число самое большое и равно" + three);
                } else {
                    System.out.println();
                }
            }
        }
    }
};







