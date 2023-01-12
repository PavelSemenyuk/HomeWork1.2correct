public class HomeWork {
    public static void main(String[] args) {
        // write your code here
        var box=5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);

        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        var boxer1 = 78.2;
        System.out.println("Вес первого боксера: " + boxer1 + " кг.");
        var boxer2 = 82.7;
        System.out.println("Вес второго боксера: " + boxer2 + " кг.");
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров: " + totalWeight + " кг.");
        var weightDefference = boxer2 - boxer1;
        System.out.println("Разница между весом боксеров: " + weightDefference + " кг.");
        var weightDefference2 = boxer2 % boxer1;
        System.out.println("Разница между весом боксеров (остаток от деления): " + weightDefference2 + " кг.");

        var workingHours = 640;
        var workers = workingHours / 8;
        System.out.println("Всего работников в компании - " + workers + " человек.");
        workers = workers + 94;
        var totalHours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками." );




    }
}
