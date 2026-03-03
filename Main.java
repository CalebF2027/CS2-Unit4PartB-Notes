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

      // list.get(int index) returns the items
      // at that specified index
      String firstItem = toDo.get(0);
      // return type matches what the ArrayList holds
      System.out.println("Do this first: " + firstItem);

      // list.set(int index, obj newItem)
      // replaces item at that index with a new one!
      String replacedItem = toDo.set(0, "Play more games");
      System.out.println(toDo);
      System.out.println("We replaced: " + replacedItem);

   // list.remove(int index) deletes the item at that index
   // shifting everything else back one number
   // also returns the removed item! (called E on the quick ref.)
   String removedItem = toDo.remove(2);
   System.out.println(toDo);
   System.out.println("We removed the item: " + removedItem);

   // 4.9 ARRAYLIST TRAVERSAL
      ArrayList<Integer> scores = new ArrayList<Integer>();
      scores.add(80);
      scores.add(87);
      scores.add(93);
      System.out.println(scores);

      // ENHANCED FOR EACH LOOP
      // to "visit" every item in order
      // does not keep track of current index/position
      for(Integer currentScore: scores) {
         System.out.println("Test Score: " + currentScore);
      }
      // typical example: count up all items
      double sum = 0;
      for (Integer score: scores ) {
         sum = sum + score; // OR sum += score;
      }
      double avg = sum/scores.size();
      System.out.println("Test Average: " + avg);

      
      // STANDARD FOR LOOP: when you need to keep
      // track of the current INDEX (position)
      // like if you want to use a method (get, set, etc.)
      for (int i = 0; i < scores.size(); i++) {
         // get item at current index
         int currentItem = scores.get(i);
         int curvedScore = currentItem + 100;
         scores.set(i, curvedScore); // replace item
      }
      System.out.println(scores);

      // WHILE LOOP (iterate until condition is false)
      ArrayList<String> groceries = new ArrayList<String>();
      groceries.add("bread");
      groceries.add("brocolli");
      groceries.add("potato");
      groceries.add("apples");
      // guess what this list is trying to do?
      boolean found = false;
      int index = 0;
      // !found is the same as found == false
      while (index < groceries.size() && !found) {
         if ("bread".equals(groceries.get(index))) {
            // if current item in list is "bread"
            groceries.remove(index);
            found = true;
         }
         else {
            index++; // continue through list
         }
      }
      System.out.println(groceries);


   } // END MAIN METHOD
} // END CLASS
