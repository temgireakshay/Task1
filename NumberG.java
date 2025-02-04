import java.util.*;

public class NumberG {
    public static void main(String[] args){
        generateNumber();
    }

 public static void generateNumber(){
    Random r=new Random();
    int randomNum=r.nextInt(101);
    guess(randomNum);
}
  public static void guess(int randomNum){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Numer Game:");
    System.out.print("Enter the number between 0 to 100\n");
    int guess=sc.nextInt();
    System.out.println(" ");

    while(guess<0 || guess>100){
        System.out.println("Invalid number ,Enter the number between 0 to 100");
        guess=sc.nextInt();
        System.out.println(" ");
    }
    int count=0;
    while(guess!=randomNum){
        count++;
        System.out.println("Wrong guess:");
        System.out.println("Try again:");
        if(guess<randomNum){
            System.out.println("Your guess is too low");
        }
        else{
            System.out.println("Your guess is too high");
        }
        guess=sc.nextInt();
        System.out.println("");
        

        while(guess<0 || guess>100){
            System.out.println("Invalid number ,Enter the number between 0 to 100");
            guess=sc.nextInt();
            System.out.println(" ");
        }
    }
    System.out.println("correct answer !you win!!");
    System.out.println("Number of guesses taken by you to guess the number is:"+count);
    System.out.println(" ");
    System.out.println("1: for play again...");
    System.out.println("2: for exit...");
    int ch=sc.nextInt();
    if(ch==1){
        generateNumber();
    }
    else{
        System.out.println("Thanks for playing");
    }
}

}