public class Sniper extends Heroes {
    public Sniper(String nameHero) {
        super(75, 75, 2, new int[]{10, 15}, nameHero);
    }

    int rangeMaxDamage;

    @Override
    public String toString() {
        return ("Снайпер: " + nameHero + " " + "здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}
