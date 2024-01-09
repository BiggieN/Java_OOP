public class Sniper extends Heroes {
    public Sniper(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10, 15}, nameHero, posX, posY);
        rangeMaxDamage = 4;
        //quantityShots = 5;
        Vector2 position;
    }
    protected int rangeMaxDamage;

    @Override
    public String toString() {
        return ("Снайпер: " + nameHero + " " + "здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}
