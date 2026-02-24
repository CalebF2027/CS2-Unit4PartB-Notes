import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      
      // 4.7 WRAPPER CLASSES wrap primitives into obkects
      // why? some methods NEED obkects
      Integer fancyInt = new Integer(13);
      Double fancyDoub = new Double(4.00);
      // calling the constructor is no longer neccesary
      // can just declare them like you would primitives
      Integer fancierInt = 13;
      // AUTOBOXING: Java converts int to Integer
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

      // 4.8 ARRAYLIST
      /* ArrayList is a RE-SIZABLE collection
         You can ADD or REMOVE items from lists!
         ArrayList is MUTABLE (can change during run)
      */

      // ArrayList<Type> name = new ArrayList<Type>();

      ArrayList<String> toDo = new ArrayList<String>();
      // For numbers, use WRAPPER classes (not primitives)
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubList = new ArrayList<Double>();

      // ARRAYLIST METHODS (assume "list" is an ArrayList)

      // list.size() returns an int
      // the number of items in the list
      int numTasks = toDo.size();
      System.out.println("Number of items on To Do Lists: " + numTasks);

      // list.add(obj) appends the obj to end of list
      // returns a boolean, but that's not important
      toDo.add("Play Fallout 4");
      toDo.add("Play God of War");
      toDo.add("Play Ghost of Yotei");
      // check size after adding stuff
      System.out.println("Number of items after adding: " + toDo.size());
      System.out.println(toDo); // ArrayList has a nice toString method

      // list.add(index, obj) inserts the obj
      // At a specific INDEX! (position)
      toDo.add(1, "Play RDR1");
      System.out.println(toDo);
      // REMEMBER that indexes start at 0
      // Sso 1 means we add to the SECOND index

   }
}
