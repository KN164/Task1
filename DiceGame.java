import java.util.Random;

class DiceGame{
  public static void main(String args[]) {

      System.out.println("Rolling dice...");
      
      Random rand = new Random();
      int num1 = rand.nextInt(5)+1;
      int num2 = rand.nextInt(5)+1;

      System.out.println("Dic 1: "+num1);
      System.out.println("Dic 2: "+num2);
      
      System.out.println("Total value: "+(num1+num2));
  }
    
}
