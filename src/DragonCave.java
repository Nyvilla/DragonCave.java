import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you, you see two caves. \n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n"+
                "Which cave will you go into? (1 or 2)\n");
        int playerInput = input.nextInt();


        if(playerInput == 1) {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! and Eats you! \n" +
                    "Game over.");
        }
        else{
            System.out.println("You approach the cave...\n" +
                    "it is dark and spooky...\n" +
                    "A large dragon jumps out and...\n" +
                    "spits out his treasure! \n" +
                    "congratulations you are now rich!");
        }
    }
}
