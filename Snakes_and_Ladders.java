import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Snakes_and_Ladders{
    public static void main(String[] args) {
        System.out.println("<---------------------This is a game of snakes and ladder------------------------>");
        System.out.println("<---Enter r to roll the dice----Enter end to End the Game---Enter reset to Reset the game--->");
        System.out.println("-x-x-x-x-Warning : Don't Enter reset multiple times or the game gets angry-x-x-x-x-x-");
        int x = 1;
        boolean p = true;
        boolean o = false;
        boolean i = false;
        Random z = new Random();
        Scanner sc = newr Scanner(System.in);
        while (x < 100) {
            System.out.println("please Enter r to roll a dice");
            String a = sc.next();
            if (Objects.equals(a, "r")) {
                p = true;
                o = false;
                i = false;
                int j = z.nextInt(1,7);
                x = x + j;
                if (x>100){
                    x = x - j;
                    System.out.println("all you need is "+(100-x)+ " but you have got "+j+" try again to win this game");
                }else {
                    switch (x) {
                        case 30 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x - 23;
                            System.out.println("ohh no...you've stepped on a snake at 30 and now you are at 7");
                        }
                        case 47 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x - 32;
                            System.out.println("ohh no...you've stepped on a snake at 47 and now you are at 15");
                        }
                        case 56 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x - 37;
                            System.out.println("ohh no...you've stepped on a snake at 56 and now you are at 19");
                        }
                        case 73 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x - 22;
                            System.out.println("ohh no...you've stepped on a snake at 73 and now you are at 51");
                        }
                        case 98 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x - 43;
                            System.out.println("ohh no...you've stepped on a snake at 98 and now you are at 55");
                        }
                        case 4 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x + 21;
                            System.out.println("Hurray.... you have Stepped on a Ladder at 4 and now you are at 25");
                        }
                        case 43 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x + 33;
                            System.out.println("Hurray.... you have Stepped on a Ladder at 43 and now you are at 76");
                        }
                        case 71 -> {
                            System.out.println("dice number is " + j + " and now your place is " + x + " But Wait....");
                            x = x + 18;
                            System.out.println("Hurray.... you have Stepped on a Ladder at 71 and now you are at 89");
                        }
                        default -> System.out.println("dice number is " + j + " and now your place is " + x);
                    }

                }
            }
            else if (Objects.equals(a, "end")) {
                break;
            } else if (Objects.deepEquals(a,"reset")) {
                if (x == 1 && p == true){
                    System.out.println("you already at 1");
                    p = false;
                    o = true;
                } else if (x == 1 && o == true) {
                    System.out.println("You are already at 1 bro please stop playing around...");
                    o = false;
                    i = true;

                } else if (x == 1 && i == true ) {
                    System.out.println("I am ending this game because i think you are not interested in playing anymore...\nhave a nice day...!");
                    i = false;
                    break;
                } else {
                    x = 1;
                    System.out.println(" The Game Has Been Reset....now you are again at 1");
                }

            } else{
                System.out.println(" you've Entered incorrect alphabet please Enter r");
            }
        }
        if (x == 100) {
            System.out.println("<---------OOOOOOO------congrats you have won the game-------OOOOOOO----------->");
        }
        else {
            System.out.println(" you've Exited this game..see you again");
        }
    }
}