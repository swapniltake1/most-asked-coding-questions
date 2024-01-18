package Java;
/*
  Write a Java function that reverses the order of words in a given string.
 Assume that words are separated by a single space and that there are no leading or trailing spaces. 
 The function should not use any built-in library functions for reversing a string.
 
*/
public class ReverseWords {
    
    public static String reverseWords(String str){
               
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]);

            if(i>0){
                sb.append(" "); // if i is gretter that 0 then add space 
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
      //  ReverseWords.reverseWords("Hello Guys");
      
      String input = " Hii guys we are rev words ";

      System.out.println(reverseWords(input));

    }

}
