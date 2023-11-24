package SnakeLadder;
import java.util.*;

class SnakeNLadder
{
     //define constant WINPOINT with value 100
    final static int WINPOINT = 100;
     
	/*
	 * snake is a static Hashmap which stores key as a starting point of snake and
	 * value as tailing point of snake.
	 */
    static Map < Integer , Integer > snake = new HashMap < Integer , Integer >();
	/*
	 * ladder is a static Hashmap which stores key as a lower point of ladder and
	 * value as uppoer point of ladder.
	 */
    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
    
    
    //initialized vlaues of both the Hashmap in static block.
    static{
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);
         
        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
    }
     
     int rolls=0;
     //List of positions of player1 & player2 throughout the game
     ArrayList<Integer> pos1 = new ArrayList<>();
     ArrayList<Integer> pos2 = new ArrayList<>();
     
     
		/*
		 * @desc:This method is used to start the game. This method keeps running until any
		 * player reaches to WINPOINT.
		 * 
		 * Players need to press 'r' key to call rollDice() method. currentPlayer keeps
		 * on changing after each rollDice() call.
		 */
     public void startGame()
     {
     	//positions of player 1 & 2 are initially 0
         int player1 =0, player2=0;
         
         int currentPlayer=-1; // denotes player 1 
         Scanner s = new Scanner(System.in);
         String str;
         int diceValue =0;
         while(player1<WINPOINT && player2<WINPOINT)
         {
             System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
             System.out.println("Press r to roll Dice");
             str = s.next();
             diceValue = rollDice();
             System.out.println("Dice value = "+diceValue);
             rolls++;  
               
             if(currentPlayer == -1)
             {
                 player1 = calculatePlayerValue(player1,diceValue);
                 System.out.println("First Player :: " + player1);
                 System.out.println("Second Player :: " + player2);
                 System.out.println("------------------");
                 pos1.add(player1);
                 pos2.add(player2);
                 if(isWin(player1))
                 {
                     System.out.println("First player wins");
                     return;
                 }
             }
             else
             {
                 player2 = calculatePlayerValue(player2,diceValue);
                 System.out.println("First Player :: " + player1);
                 System.out.println("Second Player :: " + player2);
                 System.out.println("------------------");
                 pos1.add(player1);
                 pos2.add(player2);
                 if(isWin(player2))
                 {
                     System.out.println("Second player wins");
                     return;
                 }
             }
               
             currentPlayer= -currentPlayer;     
         }
     }
     
     
   //@desc:method is used to generate a random number between 1 to 6.
 	public int rollDice() {
 		int n = 0;
 		Random r = new Random();
 		n = r.nextInt(7);
 		return (n == 0 ? 1 : n);
 	}
 	
 	
 	//@desc: returns true, if the player value reaches to WINPOINT.
    public boolean isWin(int player)
    {
        return WINPOINT == player;
    }
 	
}



public class SnakeLadder 
{	
    public static void main(String[] args) {
    	SnakeNLadder sn = new SnakeNLadder();
    	System.out.println("WELCOME TO SNAKE & LADDER GAME\n");
    	sn.startGame();
    	sn.report();
    }
}
