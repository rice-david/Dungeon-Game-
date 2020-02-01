import java.util.InputMismatchException;
import java.util.Scanner;

public class DungeonGame {
    Scanner input = new Scanner(System.in);
    private DungeonMap map;
    private Player player;
    private int command = 0;
    public void play() {
        System.out.println("Adventure awaits young player! Please select your class!");
        System.out.println("[1] for Warrior");
        System.out.println("[2] for theif");
        while (true){
            try {
                int command = input.nextInt();
                if (command != 2 && command != 1){
                    System.out.println("Please select a valid choice: ");
                }
                else{
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Please select a valid choice: ");
                input.next();
            }
        }

        if (command == 1){
            player.setPlayerClass("W");
            player.setHealth(100);
            player.setDamage(15);
            player.setLootModifier(1);
        }
        if (command == 2){
            player.setPlayerClass("T");
            player.setHealth(70);
            player.setDamage(10);
            player.setLootModifier(1.2);
        }



    }
}
