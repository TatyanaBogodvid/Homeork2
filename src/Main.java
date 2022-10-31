public class Main {
    public static void main(String[] args) {
    //Задача 1
        System.out.println ("Задача 1");
     var dog = 8;
     var cat = 3.6;
     var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    //Задача 2
        System.out.println ("Задача 2");
     dog = dog + 4;
     cat = cat+4;
     paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
     //Задача 3
        //При вычитании из целочисленного значения dog значения с точкой 3.5 выдается ошибка.
        // Введена новая переменная dog1
        System.out.println ("Задача 3");
     var dog1 = 8.0;
     dog1 = dog1 - 3.5;
     cat = cat - 1.6;
     paper = paper -7639;
        System.out.println (dog1);
        System.out.println (cat);
        System.out.println (paper);
     //Задача 4
        System.out.println ("Задача 4");
     var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
     //Задача 5
        System.out.println ("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
      //Задача 6
        System.out.println ("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight= 82.7;
        System.out.println("Общий вес двух бойцов " + (boxer1Weight + boxer2Weight) + " кг.");
        System.out.println("Разница между весами бойцов " + (boxer2Weight - boxer1Weight) + " кг.");
     //Задача 7
        System.out.println ("Задача 7");
        System.out.println("Разница между весами бойцов (1 способ) " + (boxer2Weight - boxer1Weight) + " кг.");
        System.out.println("Разница между весами бойцов (2 способ) " + (boxer2Weight % boxer1Weight) + " кг.");
     //Задача 8
        System.out.println ("Задача 8");
        var totalWorkingHours = 640;
        var hoursePerDay = 8;
        var totalEmployees = totalWorkingHours / hoursePerDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек");
        totalEmployees = totalEmployees+ 94;
        totalWorkingHours = totalEmployees * hoursePerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingHours  +
                " часов работы может быть поделено между сотрудниками");


    }
}