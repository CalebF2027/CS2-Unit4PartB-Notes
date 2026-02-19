public class Main {

   public static void main(String []args) {
      
      // 4.7 WRAPPER CLASSES wrap primitives into obkects
      // why? some methods NEED obkects
      Integer fancyInt = new Integer(13);
      Double fancyDoub = new Double(4.00);
      // calling the constructor is no longer neccesary
      // can just declare them like you would primitives
      Integer fancierInt = 13;
      System.out.println(fancierInt);
      // AUTOBOXING: Java converts int to Integer
      // (we passed 13, primitive value, then Java printed it to be an Integer)
      int regularInt = fancierInt; // UNBOXING

      // another use of Wrappers: you can use some methods
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String stringNums = "13.0";
      double parseD = Double.parseDouble(stringNums);
      System.out.println(parseD);
      String stringyNums2 = "13";
      int parsedI = Integer.parseInt(stringyNums2);
      System.out.println(parsedI);


   }
}
