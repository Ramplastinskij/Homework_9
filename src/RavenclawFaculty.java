class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int creativity;
    private final int wittiness;

    public Ravenclaw(String name, int magicPower, int apparitionDistance, int intelligence, int wisdom, int creativity, int wittiness) {
        super(name, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
        this.wittiness = wittiness;
    }
    public void printDescription() {
        super.printDescription();
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Creativity: " + creativity);
        System.out.println("Wittiness: " + wittiness);
    }
    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.intelligence + student1.wisdom + student1.creativity + student1.wittiness;
        int score2 = student2.intelligence + student2.wisdom + student2.creativity + student2.wittiness;

        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}