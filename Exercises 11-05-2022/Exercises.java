public class Exercises {
    public static void main(String[] args) throws Exception {
  
        char [][] myWord = {{'S','L','A','M'}, {'T','I','L', 'E'}, {'E','A','T', 'S'}, {'P', 'R', 'O', 'S'}};

  
        // WORD 1
        System.out.print("1. ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    System.out.print(myWord[i][j] + " ");
                }
            }
        }
        
        // WORD 2
        System.out.println("");
        System.out.print("2. ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1) {
                    System.out.print(myWord[i][j] + " ");
                }
            }
        }
        
        // WORD 3
        System.out.println("");
        System.out.print("3. ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2) {
                    System.out.print(myWord[i][j] + " ");
                }
            }
        }
        
        // WORD 4
        System.out.println("");
        System.out.print("4. ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 3) {
                    System.out.print(myWord[i][j] + " ");
                }
            }
        }
        
        
      
         // WORD 5
         System.out.println("");
         System.out.print("5. ");

        for (int i = 0; i < 4; i++) {
             System.out.println("");
            for (int j = 0; j < 4; j++) {
                 if (j == 0) {
             System.out.print("  "+ myWord[i][j]);
         }
     }
 }

        // WORD 6
        System.out.println("");
        System.out.print("6. ");

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    System.out.print("  "+ myWord[i][j]);
                }
            }
        }

        // WORD 7 ALTO
        System.out.println("");
        System.out.print("7. ");

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    System.out.print("  "+myWord[i][j]);
                }
            }
        }

         // WORD 8
         System.out.println("");
         System.out.print("8. ");
 
         for (int i = 0; i < 4; i++) {
             System.out.println("");
             for (int j = 0; j < 4; j++) {
                 if (j == 3) {
                     System.out.print("  " + myWord[i][j]);
                 }
             }
         }
        // WORD 9 PETS
        System.out.println("");
        System.out.print("9. ");

        for (int i = 3; i >= 0; i--) {
            System.out.println("");
            for (int j = 0; j  >= 0; j--) {
                if (j == 0) {
                    System.out.print("  "+ myWord[i][j]);
                }
            }
        }
         
        // WORD 10 PET
         System.out.println("");
         System.out.print("10. ");
 
         for (int i = 3; i > 0; i--) {
             System.out.println("");
             for (int j = 0; j  >= 0; j--) {
                 if (j == 0) {
                     System.out.print("  "+ myWord[i][j]);
                 }
             }
         }

          // WORD 11 AIL
          System.out.println("");
          System.out.print("11. ");
  
          for (int i = 2; i >= 0; i--) {
              System.out.println("");
              for (int j = 1; j  >= 1; j--) {
                  if (j == 1) {
                      System.out.print("  "+ myWord[i][j]);
                  }
              }
          }

        
          // WORD 12
          System.out.println("");
          System.out.print("12.");
  
          for (int i = 0; i < 4; i++) {
              System.out.println(""); 
              for (int j = 0; j < 4; j++) { 
                  if (i == 1 && (j == 2)) { 
                      System.out.print(myWord[i][j]);
                  }
                  else if (i == 2 && (j == 1)) {
                      System.out.print(myWord[i][j]);
                  }
                  else if (i == 0 && (j == 3)) {
                      System.out.print(myWord[i][j]);
                  }
                  else if (i == 3 && (j == 0)) {
                      System.out.print(myWord[i][j]);
                  }
                  else{
                      System.out.print(" ");
                  }
              }
          }
        
            // WORD 13
            System.out.println("");
            System.out.print("13. ");

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 2) {
                        System.out.print(myWord[i][j] + " ");
                    }
                }
            }
       
            // WORD 14 PETS
            System.out.println("");
            System.out.print("14. ");

            for (int i = 2; i >= 0; i--) {
                System.out.println("");
                for (int j = 3; j  >= 3; j--) {
                    if (j == 3) {
                        System.out.print("  "+ myWord[i][j]);
                    }
                }
            }

    // WORD 15 PAL
    System.out.println("");
    System.out.print("15. ");

    for (int i = 0; i < 4; i++) {
        System.out.println(""); 
        for (int j = 0; j < 4; j++) { 
            if (i == 1 && (j == 2)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 3 && (j == 0)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }
    // WORD 16
    System.out.println("");
    System.out.print("16. ");

    for (int i = 3; i >= 0; i--) {
        System.out.println(""); 
        for (int j = 3; j >= 0; j--) { 
            if (i == 1 && (j == 2)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 3 && (j == 0)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }

    // WORD 17
    System.out.println("");
    System.out.print("17. ");

    for (int i = 0; i < 4; i++) {
        System.out.println(""); 
        for (int j = 0; j < 4; j++) { 
            if (i == 0 && (j == 0)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 1 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 2)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 3 && (j == 3)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }

    // WORD 18
    System.out.println("");
    System.out.print("18. ");

    for (int i = 0; i < 4; i++) {
        System.out.println(""); 
        for (int j = 0; j < 4; j++) { 
            if (i == 0 && (j == 0)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 1 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 2)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }

    // WORD 19

    System.out.println("");
    System.out.print("19. ");

    for (int i = 3; i >= 0; i--) {
        System.out.println(""); 
        for (int j = 3; j >= 0; j--) { 
            if (i == 3 && (j == 2)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 1 && (j == 0)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }

    // WORD 20
    System.out.println("");
    System.out.print("20. ");

    for (int i = 0; i < 4; i++) {
        System.out.println(""); 
        for (int j = 0; j < 4; j++) { 
            if (i == 1 && (j == 0)) { 
                System.out.print(myWord[i][j]);
            }
            else if (i == 2 && (j == 1)) {
                System.out.print(myWord[i][j]);
            }
            else if (i == 3 && (j == 2)) {
                System.out.print(myWord[i][j]);
            }
            else{
                System.out.print(" ");
            }
        }
    }
     
    }
}
