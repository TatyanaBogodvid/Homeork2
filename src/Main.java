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
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var overallWeight = boxerFirst + boxerSecond;
        System.out.println("Общий вес двух бойцов " + overallWeight + "кг.");
        var difference = boxerSecond - boxerFirst;
        System.out.println("Разница между весами бойцов " + difference + "кг.");
     //Задача 7
        System.out.println ("Задача 7");
var raznitsa = boxerSecond - boxerFirst;
System.out.println(raznitsa);
var Ostatok = boxerSecond % boxerFirst;
System.out.println(Ostatok);
     //Задача 8
        System.out.println ("Задача 8");
        var rabVremya = 640;
        var rabVemyaSotrudnika = 8;
        var sotrudniki = rabVremya / rabVemyaSotrudnika;
        System.out.println("Всего работников в компании – " + sotrudniki + " человек");
        var sotrudniki2 = sotrudniki + 94;
        var rabVremya2 = sotrudniki2 * rabVemyaSotrudnika;
        System.out.println("Если в компании работает " + sotrudniki2 + " человек, то всего " + rabVremya2 +
                " часов работы может быть поделено между сотрудниками");


    }
}