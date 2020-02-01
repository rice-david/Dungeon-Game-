public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setMonsterType(String monsterType){
        this.monsterType = monsterType;

        if (monsterType.equals("goblin")){
            this.setHealth(6);
            this.setDamage(2);

        }
    }

    public void attack(Player target) {


    }

    public void onHit(int damage) {

    }
}
