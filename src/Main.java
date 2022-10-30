public class Main {
    public static void main(String[] args) {
    //Задача 1
     var dog = 8;
     var cat = 3.6;
     var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    //Задача 2
     dog = dog + 4;
     cat = cat+4;
     paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
     //Задача 3
        //При вычитании из целочисленного значения dog значения с точкой 3.5 выдается ошибка.
        // 3.5 изменено на 3.
     dog = dog - 3;
     cat = cat - 1.6;
     paper = paper -7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
     //Задача 4
     var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
     //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
      //Задача 6
        var BoxerFirst = 78.2;
        var BoxerSecond = 82.7;
        var OverallWeight = BoxerFirst + BoxerSecond;
        System.out.println("Общий вес двух бойцов " + OverallWeight + "кг.");
        var Difference = BoxerSecond - BoxerFirst;
        System.out.println("Разница между весами бойцов " + Difference + "кг.");
     //Задача 7
var Raznitsa = BoxerSecond - BoxerFirst;
System.out.println(Raznitsa);
var Ostatok = BoxerSecond % BoxerFirst;
System.out.println(Ostatok);
     //Задача 8
        var RabVremya = 640;
        var RabVemyaSotrudnika = 8;
        var Sotrudniki = RabVremya / RabVemyaSotrudnika;
        System.out.println("Всего работников в компании – " + Sotrudniki + " человек");
        var Sotrudniki2 = Sotrudniki + 94;
        var RabVremya2 = Sotrudniki2 * RabVemyaSotrudnika;
        System.out.println("Если в компании работает " + Sotrudniki2 + " человек, то всего " + RabVremya2 +
                " часов работы может быть поделено между сотрудниками");


    }
}