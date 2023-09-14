import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

  interface Exercise {

    //4.1 method
    public static double convertLireEuro(int x){
      return  x * 1427.78;
    }
    //4.2
     public static boolean sumOverflow(byte x ,byte y){

         return x + y >= Byte.MAX_VALUE;
     }
     //4.3
     public static void printDiv(int x, int y){
       System.out.println(x/y);
     }
     public static void root(int product){
       System.out.println(Math.sqrt(product));
     }

     public static void comparison(int x,int y){
       System.out.printf("둘 중에 큰 수는 %d이고 작은 수는 %d입니다",Math.max(x,y),Math.min(x,y));
     }

     public static boolean even(Long x){
          return x % 2 == 0;
     }







}


public class Exercise4{
  public static void main(String[] args) {

    //4.5
      short x = 22;
      byte y = (byte) x;
    System.out.println(y);

    //4.6
    /*
      1.Long
      2.Long
      3.
      4.
      5.char
      6.float
      7.boolean
      8.
      9.
       */

      //4.8  100 200


      //4.9
      Product lamp = new Product("Lamp 60 watt");
      System.out.println("Before the loading : "+ lamp);
      lamp.downLoad(1000);
      lamp.upLoad(100);
      System.out.println("After the loading : "+ lamp);
  }

}
//4.9

class Product{
      private final String name;
      private int productNumber;

      Product(String name){
          this.name = name;
          this.productNumber = 0;
      }

      public void downLoad(int number){
            this.productNumber += number;
    }
     public void upLoad(int number){
          this.productNumber -= number;
     }

     @Override
    public String toString(){
          return this.name + ", "+ productNumber  + "pieces";
     }


     //4.10
     public static char lastCharacter(String s){
         return s.charAt(s.length()- 1);
     }







}
