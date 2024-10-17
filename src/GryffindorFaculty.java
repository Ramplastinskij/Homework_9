class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void printDescription() {
        super.printDescription();
        System.out.println("Ноbility: " + nobility);
        System.out.println("Honor: " + honor);
        System.out.println("Bravery: " + bravery);
    }
    public static void compare(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.nobility + student1.honor + student1.bravery;
        int score2 = student2.nobility + student2.honor + student2.bravery;

        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}