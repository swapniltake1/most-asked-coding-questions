
// write a java program to find fibonancy series from input 


public class FibonancySeries {
    public static void printFibonancySeries(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=0; i<=count; i++){
            System.out.println(a + ", ");
             
            a=b;

            b=c;

            c=a+b;

        }
    }

    public static void main(String[] args) {
        printFibonancySeries(10);
    }
}
