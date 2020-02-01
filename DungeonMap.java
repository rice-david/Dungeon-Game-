public class DungeonMap {
    private Room[][] rooms;
    private Player player;


    private int rows = 30;
    private int columns = 20;
    private boolean [][] ourMap = new boolean[rows][columns];



    public DungeonMap (int rows, int columns, Player player){
        this.rows = rows;
        this.columns = columns;
        this.player = player;

    }

    public void print() {
        for (int i = 0; i < columns;i++){
            System.out.print("--");
        }
        System.out.println();

        int counter = 0;
        for (int i = 0 ; i < rows; i++){
            System.out.print("|");
            for (int j = 0; j < 2*columns; j++){
                if (i== 2*player.getY() && j == 2*player.getX()){
                    System.out.print(player.getPlayerClass());
                }
                else if (ourMap[i][j] == true){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println("|");


        }
        for(int i =0; i < columns; i++){
            System.out.print("--");
        }



    }
}

