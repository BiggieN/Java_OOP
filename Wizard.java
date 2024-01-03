public class Wizard extends Heroes {
    public Wizard(String nameHero) {
        super(50, 50, 1, new int[]{-10, -5}, nameHero);
    }

    @Override
    public String toString() {
        return ("Колдун: " + nameHero + " " + "здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}
