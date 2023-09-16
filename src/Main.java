public class Main {
    public static void main(String[] args) {
//  Домашнее задание - Переменные

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+"\n"+cat+"\n"+paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog+"\n"+cat+"\n"+paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog+"\n"+cat+"\n"+paper);

        var friend = 19;
        friend = (friend+2)/7;     // либо - System.out.println((friend+2)/7);
        System.out.println(friend);

        var frog = 3.5;
        frog = (frog*10)/3.5+4;  // либо - System.out.println((frog*10)/3.5+4);
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight); //  общая масса
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println(differenceWeight);

        differenceWeight = secondBoxer - firstBoxer;
        System.out.println(differenceWeight);
        var massDifference = secondBoxer % firstBoxer;
        System.out.println(massDifference);

        var Bmw = 666;
        System.out.println(Bmw);
        var hourOpening = 640;
        var workOpening = 8;
        var totalEmployees = hourOpening / workOpening;
        System.out.println("Всего работников в компании "+totalEmployees+" человек");

        totalEmployees = totalEmployees + 94;
        var workHour = hourOpening / totalEmployees;
        System.out.println("Если в компании работает "+totalEmployees+" человек, то всего "+workHour+" часов работы может быть поделено между сотрудниками");

    }
}