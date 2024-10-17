class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int apparitionDistance;

    public Hogwarts(String name, int magicPower, int apparitionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
    }
    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }

    public void printDescription() {
        System.out.println("Студент: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + apparitionDistance);
    }
}