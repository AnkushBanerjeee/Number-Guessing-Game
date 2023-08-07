import java.util.Random;
import java.util.Scanner;

class game{
    int no;
    int noOFGuess=0;
    int inputno;
    game()
    {
        Random rand=new Random();
      this.no=rand.nextInt(100);
    }
    public void setNoOFGuess(int noOFGuess1)
    {
        this.noOFGuess=noOFGuess1;
    }
    public int getNoOFGuess()
    {
        return noOFGuess;
    }
    void takeUserInput()
    {
        System.out.println("guess the no");
        Scanner sc=new Scanner(System.in);
        inputno=sc.nextInt();
    }
    boolean isCorrectNo()
    {
        noOFGuess++;
        if(inputno==no) {
            System.out.format("the no %d was guessed correctly\n",no);
            System.out.println("you guessed it right in " +noOFGuess+ " attempts");
            return true;
        }
        else if (inputno>no)
        {
            System.out.println("too high....");
        } else if (inputno<no)
        {
            System.out.println("tooo low...");
        }
        return false;
    }
}
public class guess_the_game {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNo();
        }
    }
}
