public class RemoveWhitespace {

    // Creating method
    public static String removeSpace(String str){
       // creating string builder object
        StringBuilder builder = new StringBuilder();
      // creating char array to strore strinng in array
        char[] chararray = str.toCharArray();
      // loop for traverce array and remove whitespace
        for(char c: chararray){
            // if whitespace available then remove and append string
            if(!Character.isWhitespace(c)){
                builder.append(c);
            }
            
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        
      //  RemoveWhitespace.removespace("Swapnil is coder");

        System.out.println(removeSpace("hello team, We are going to start !!"));
    }
}
