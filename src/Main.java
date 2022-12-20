public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача №1: ");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача №2: ");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача №3: ");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача №4: ");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача №5: ");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача №6: ");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух боксеров " + boxersWeight + " кг!");
        var betweenBoxersWeight = secondBoxer % firstBoxer;
        System.out.println("Разница между весами боксеров " + betweenBoxersWeight + " кг!");
    }
    public static void task7() {
        System.out.println("Задача №7: ");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var betweenBoxersWeight1 = secondBoxer - firstBoxer;
        System.out.println("Разница между весами боксеров " + betweenBoxersWeight1 + " кг!");
        var betweenBoxersWeight2 = secondBoxer % firstBoxer;
        System.out.println("Разница между весами боксеров " + betweenBoxersWeight2 + " кг!");
    }
    public static void task8() {
        System.out.println("Задача №8: ");
        var officeHours = 640;
        var employeeHours = 8;
        var numberOfEmployees = officeHours / employeeHours;
        System.out.println("Всего рабоников в компании - " + numberOfEmployees + " человек");
        var increaseEmployees = 96;
        var newNumberOfEmployees = numberOfEmployees + increaseEmployees;
        var newOfficeHours = newNumberOfEmployees * employeeHours;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newOfficeHours
        + " часов работы может быть поделено между сотрудниками");
    }
}