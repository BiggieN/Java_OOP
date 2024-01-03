abstract public class Heroes {
    
    protected int health, healthMax, armor;
    String nameHero;
    int[] damage;

    public Heroes(int health, int healthMax, int armor, int[] damage, String nameHero) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
    }
}
