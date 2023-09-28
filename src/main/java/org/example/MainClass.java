package org.example;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Компот", 75, 0, 75);
        Cat cat2 = new Cat("Коржик", 50, 0, 50);
        Cat cat3 = new Cat("Карамелька", 35, 0,35);
        Plate plate1 = new Plate(200);


        plate1.info();
        cat1.eat();
        plate1.setFood(plate1.getFood() - cat1.getAppetite());



        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        printResults(plate1, cats);
    }

    public static void printResults(Plate plate1, Cat[] cats){
        for (Cat kot: cats) {
            if (kot.getAppetite() <= plate1.getFood()) {
                kot.eat();
                plate1.setFood(plate1.getFood() - kot.getAppetite());
                System.out.println(kot.getName());
                System.out.println("Котик наелся)");
                plate1.info();
            }
            else {
                System.out.println(kot.getName());
                System.out.println("Котику не хватило еды и он ушел(");
                plate1.info();
            }


        }


    }
}
