public class Main {
    public static void main(String[] args) {
//Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного пожить. ");
        }
//Задание 2
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
//Задание 3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
//Задание 4
        int ageToo = 10;
        if (1 < ageToo && ageToo < 7) {
            System.out.println("Если возраст человека равен " + ageToo + ", то ему нужно ходить в детский сад.");
        }
        if (6 < ageToo && ageToo < 18) {
            System.out.println("Если возраст человека равен " + ageToo + ", то ему нужно ходить в школу.");
        }
        if (17 < ageToo && ageToo < 25) {
            System.out.println("Если возраст человека равен " + ageToo + ", то ему нужно ходить в университет.");
        }
        if (24 < ageToo) {
            System.out.println("Если возраст человека равен " + ageToo + ", то ему пора ходить на работу.");
        }
//Задание 5
        int ageChildren = 12;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageChildren > 5 && ageChildren < 15) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе в только сопровождении взрослого.");
        }
        if (ageChildren > 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
//Задание 6 Считаю что условие задания поставлено не корректно. Возникает много вариантов и вопросов, прошу конкретизировать. к примеру дать заполненность вагона. Или количество желающих купить билеты как на сидячие так и на стоячие места.
        System.out.println("        Считаю что условие задания N6 поставлено не корректно. Возникает много вариантов и вопросов, прошу конкретизировать. к примеру дать заполненность вагона. Или количество желающих купить билеты как на сидячие так и на стоячие места.");
//        int carriageAll = 120;
//        int seating = 60;
//        int standing = 60;
//Задание 7
        int one = 10;
        int two = 20;
        int three = 30;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чисел " + two + " и " + three + ".");
        }
        if (one < two && two > three) {
            System.out.println("Число " + two + " больше чисел " + one + " и " + three + ".");
        } else {
            System.out.println("Число " + three + " больше чисел " + two + " и " + one + ".");
        }

    }
}