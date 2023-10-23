package JavaQuestions;
//Print Star console using Loop
public class PrintStars {
    public static void main(String[] args) {
        
    int row, noOfStars;

    for(row=1; row<=10; row++){
        for(noOfStars=1; noOfStars<=row; noOfStars++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
