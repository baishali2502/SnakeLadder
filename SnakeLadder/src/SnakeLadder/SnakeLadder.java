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
