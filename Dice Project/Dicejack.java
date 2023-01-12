import java.util.Scanner;

public class Dicejack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        // System.out.println(roll1);
        // System.out.println(roll2);
        // System.out.println(roll3);

        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("The number can't be lesser than 1.Shutting down the game!!!");
            System.exit(0);
        }
        
        if(num1 > 6 || num2 > 6|| num3 > 6){
            System.out.println("The number can't be greater than 6.shutting down the game!!!");
            System.exit(0);
        }

        int sumOfNumbers = num1+ num2+ num3;
        int sumDiceRolls = roll1 + roll2+ roll3;
        System.out.println("Dice Sum = " +sumDiceRolls+ " . Number Sum = " +sumOfNumbers );
        checkWin(sumDiceRolls, sumOfNumbers);

        sc.close();
        
    }


    public static int rollDice() {
        double randomNumber = Math.random() *6;
        randomNumber += 1;
        return(int) randomNumber;
        
    }
    public static void checkWin(int sumDiceRolls, int sumOfNumbers){
        if(sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3){
            System.out.println("Congratulation, You win!");
        }
        else{
            System.out.println("Sorry, You lost!");
        }
    }
}