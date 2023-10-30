public class NumberPrinting{
    public static void main(String[] args) {


       /*  Problem Statement : 
       
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
        
        */
        

        
        // initialise how much row we want to print
        int rows=5;

        // outer for loop. i=5(rows) after this loop will contineus till i>=1.
        for(int i=rows; i >= 1; i--){

            // inner loop which printing i's values 1 by 1 till loop is not break.
            for(int j=i; j>=1; j--){

                // printing values of i for every loop.
                System.out.print(j+" ");
            }

            // this line break the line after outer loop exicuted ones.
            System.out.println();
        }
    }
}