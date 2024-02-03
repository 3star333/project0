import java.util.Scanner;

public class NumberToWords {

   public static String digitToWord(int digitIn) {

      switch (digitIn) {
         case 0:
            return "zero";
         case 1:
            return "one";
         case 2:
            return "two";
         case 3:
            return "three";
         case 4:
            return "four";
         case 5:
            return "five";
         case 6:
            return "six";
         case 7:
            return "seven";
         case 8:
            return "eight";
         case 9:
            return "nine";
         default:
            return ""; // or handle the out-of-range case appropriately
      }
   }

   public static String tensDigitToWord(int digitIn) {
      switch (digitIn) {
         case 2:
            return "twenty";
         case 3:
            return "thirty";
         case 4:
            return "forty";
         case 5:
            return "fifty";
         case 6:
            return "sixty";
         case 7:
            return "seventy";
         case 8:
            return "eighty";
         case 9:
            return "ninety";
         default:
            return ""; // or handle the out-of-range case appropriately
      }
   }

   public static String twoDigitNumToWords(int numIn) {
      if (numIn < 0 || numIn > 99) {
         return "Out of range";
      }

      int tens = numIn / 10;
      int ones = numIn % 10;
      return tensDigitToWord(tens) + " " + digitToWord(ones);
   }

   public static void main(String[] args) {
      System.out.println("Enter a number between 0 and 99");
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();
      String words = twoDigitNumToWords(num);
      System.out.println(words);
   }
}
