
public class SudokuSolverEngine {

   public static void main(String[] args) {
      // Here I have called my class `MySudokuBoard` if you named your class
      // differently, modify the line below to use your own class name
      MySudokuBoard board = new MySudokuBoard("boards/very-fast-solve.sdk");
      System.out.println("Initial board");
      System.out.println(board);
      System.out.println();

      System.out.print("Solving board...");
      long start = System.currentTimeMillis();
      board.solve();
      long stop = System.currentTimeMillis();
      System.out.printf("SOLVED in %.3f seconds.\n", ((stop-start)/1000.0));
      System.out.println();
      System.out.println(board);
      
   }
}

/*
# PROGRAM OUTPUT

  ----jGRASP exec: java SudokuSolverEngine
 Initial board
 My Board:
 
 .34678912
 .72195348
 198342567
 ..9.61423
 .26853791
 .13924.56
 .61537284
 .8.419635
 345.86179
 
 
 Solving board...SOLVED in 0.890 seconds.
 
 My Board:
 
 534678912
 672195348
 198342567
 859761423
 426853791
 713924856
 961537284
 287419635
 345286179
 
 
  ----jGRASP: Operation complete.

*/