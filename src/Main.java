import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int ageDriver = 18; //задаем возраст человека
         if (ageDriver >= 18) {
            System.out.println("Если возраст человека равен "+ageDriver+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+ageDriver+", то он несовершеннолетний");
            System.out.println();
        };
        System.out.println("Task 2");
        int tmp = 2; // задаем температуру
        if (tmp < 5) {
            System.out.println("на улице " + tmp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("на улице " + tmp + " градусов, можно идти без шапки.");
        };
            System.out.println();
        ;
        System.out.println("Task3");
        int speed = 70; //задаем скорость
        if (speed > 60) {
            System.out.println(" Если скорость больше" + speed + " км, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость меньше " + speed + " можно ездить спокойно");
            System.out.println();
        }
        ;
        System.out.println("Task4");
        {
            int age = 20; // ввести значение возраста
            if (age >= 2 && age <= 6) {
         System.out.println( "Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            } if (age >= 7 && age <= 17) {
         System.out.println( "Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } if (age >= 18 && age <= 24) {
         System.out.println( "Если возраст человека равен " + age + ", то его место в университете.");
            } else {
         System.out.println( "Если возраст человека равен " + age + ", то ему пора ходить на работу.");};
        System.out.println("Task5");
        {  int age2 = 15;
            if (age2 < 5) {
                System.out.println("Если возраст ребенка меньше " + age2 + ", тогда ему нельзя кататься" +
                        " на каруселях.");
                if (age2 >= 5 && age2 < 14) {
                    System.out.println("Если возраст ребенка больше " + age2 + " , и меньше " + age + ", тогда ему" +
                            " можно кататься только в сопровождении взрослого." +
                            " Если взрослого нет, кататься нельзя.");
                };
            }else{
                System.out.println("Если возраст ребенка больше " + age2 + ",то он может кататься" +
                " без сопровождения взрослого.");};
                System.out.println();
                System.out.println("Task 6");
            {
                int capacity = 102;
                int passengers = 200;
                int sittingPlaces = 60;
                if (passengers < sittingPlaces && sittingPlaces + passengers < capacity) {
                    System.out.println("В вагоне есть сидячие и стоячие места");
                }
                if (passengers > sittingPlaces && passengers < capacity) {
                    System.out.println("В вагоне есть только стоячие места");
                }  else  {
                    System.out.println("В вагоне нет свободных мест");
                         System.out.println();
                };
        System.out.println("Task7");
        int one = 12;
        int two = 50;
        int three= 33;

        if (one>two && one>three) {
            System.out.println("Первое число самое большое и равно"+one);};
            if (two>one && two>three) {
                System.out.println("Второе число самое большое и равно" + two);
            }else {
                System.out.println("Третье число самое большое и равно"+ three);
    };
}}}}};






