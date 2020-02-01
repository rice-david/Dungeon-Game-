import java.util.*;
public class Main {
    public static void main(String[] args) {
        Player Name = new Player();
        Name.setPlayerClass("T");
        DungeonMap Hart = new DungeonMap(10,10,Name);
        DungeonGame newGame = new DungeonGame();
        newGame.play();


        Hart.print();

    }
}