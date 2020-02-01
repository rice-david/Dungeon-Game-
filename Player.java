import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    private int health;
    private int gold;
    private int damage;
    private String playerClass;
    private double lootModifier;
    private int xPos = 9;
    private int yPos = 0;

    public int getX(){
        return xPos;
    }
    public void setX(int x){
        xPos = x;
    }
    public int getY(){
        return yPos;
    }
    public void setY(int y){
        yPos = y;
    }

    public void setPlayerClass(String playerClass){
        this.playerClass = playerClass;
    }
    public String getPlayerClass(){
        return playerClass;
    }


    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }


    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }


    public void setLootModifier(double lootModifier){
        this.lootModifier = lootModifier;
    }

    public void attack(Monster target) {

    }

    public void onHit(int damage) {

    }

    public void onHeal(int health) {

    }

    public void onLoot(int gold) {

    }
}
