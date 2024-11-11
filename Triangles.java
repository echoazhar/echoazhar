
// Program prints four triangles, one below the other
public class Triangles {
   // draws four triangles
   public static void main(String[] args) {
      int row; // the row position
      int column; // the column position
      int space; // number of spaces to print

      // first triangle
      for (row = 1; row <= 10; row++) {
         for (column = 1; column <= row; column++) {
            System.out.print("*");
         }

         System.out.println();
      }

      System.out.println();

      // second triangle
      for (row = 10; row >= 1; row--) {
         for (column = 1; column <= row; column++) {
            System.out.print("*");
         }

         System.out.println();
      }

      System.out.println();

      // third triangle
      for (row = 10; row >= 1; row--) {
         for (space = 10; space > row; space--) {
            System.out.print(" ");
         }

         for (column = 1; column <= row; column++) {
            System.out.print("*");
         }

         System.out.println();
      } 

      System.out.println();

      // fourth triangle
      for (row = 10; row >= 1; row--) {
         for (space = 1; space < row; space++) {
            System.out.print(" ");
         }

         for (column = 10; column >= row; column--) {
            System.out.print("*");
         }

         System.out.println();
      } 
   } 
}

