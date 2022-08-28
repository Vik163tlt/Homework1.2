public class Main {
    public static void main(String[] args) {
    //Задание 1
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    //Задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    //Задание 3
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    //Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

    //Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    //Задание 6
        System.out.println("Задание 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общий вес боксеров: " + (boxer1 + boxer2) + "кг.");
        System.out.println("Разница в весе: " + (boxer2 - boxer1) + "кг.");

    //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница в весе: " + (boxer2 - boxer1) + "кг.");
        System.out.println("Разница в весе: " + (boxer2 % boxer1) + "кг.");

    //Задание 8
        System.out.println("Задание 8");
        var hoursTotal = 640;
        var hoursOneEmployee = 8;
        var totalEmployees = hoursTotal / hoursOneEmployee;
        var hoursTotalPlus = hoursTotal + 94 * hoursOneEmployee;
        System.out.println("Всего работников в компании – " +(totalEmployees)+ " человек.");
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " +(hoursTotalPlus)+ " часа работы может быть поделено между сотрудниками.");



    }
}