package SnakeLadder;
import java.util.*;

public class SnakeLadder 
{
	final static int WINPOINT = 100;	
    
	/*
	 * 1.) snake is a static HashMap which stores key as a starting point of snake and
	 *     value as tailing point of snake.
	 * 
	 * 2.) ladder is a static HashMap which stores key as a lower point of ladder 
	       and value as upper point of ladder.
	 */
	static Map < Integer , Integer > snake = new HashMap < Integer , Integer >();
    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
    //vlaues of both the Hashmap in static block.
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
    
    public static void main(String[] args) {
    	SnakeLadder s = new SnakeLadder();
    	System.out.println("WELCOME TO SNAKE & LADDER GAME");
    }
}
