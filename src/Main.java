public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 85, 100, 70, 75, 90);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 120, 85, 90, 95);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 110, 60, 80, 70);

        Slytherin draco = new Slytherin("Драко Малфой", 90, 150, 85, 80, 88, 90, 95);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 75, 125, 70, 65, 60, 72, 68);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 78, 100, 82, 85, 80);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 88, 130, 90, 92, 85);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 80, 110, 90, 85, 80, 75);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 85, 115, 82, 78, 75, 80);

        harry.printDescription();
        hermione.printDescription();
        ron.printDescription();

        draco.printDescription();
        graham.printDescription();

        zacharias.printDescription();
        cedric.printDescription();

        cho.printDescription();
        padma.printDescription();

        Gryffindor.compare(hermione, ron);
        Slytherin.compare(draco, graham);
        Hufflepuff.compare(zacharias, cedric);
        Ravenclaw.compare(cho, padma);

        if(harry.getMagicPower() > zacharias.getMagicPower()) {
            System.out.println(harry.getName() + " обладает большей мощностью магии, чем " + zacharias.getName());
        } else {
            System.out.println(zacharias.getName() + " обладает большей мощностью магии, чем " + harry.getName());
        }
    }
}