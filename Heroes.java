import java.util.ArrayList;

abstract public class Heroes {
    
    protected int health, healthMax, armor;
    protected Vector2 position;
    String nameHero;
    int[] damage;

    public Heroes(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }
    public void printEnemysDistance(ArrayList<Heroes> enemys){
        enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position)+", "));
        System.out.println();
    }
}
