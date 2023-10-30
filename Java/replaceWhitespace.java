public class replaceWhitespace {
    
    public static String replaceWhitespaceWithPercentLimitedSize(String input, int size)
     {

        StringBuilder resultBuilder = new StringBuilder();
        
        int currentSize = 0;

        for (char c : input.toCharArray())
         {
            if (Character.isWhitespace(c)) 
            {
                // If it's whitespace, add "%"
                if (currentSize + 1 <= size) 
                {
                    resultBuilder.append("%");
                    currentSize++;
                } 
                else 
                {
                    break; // Stop if adding "%" would exceed the size
                }
            } 

            else 
            {
                // If it's not whitespace, add the character
                if (currentSize + 1 <= size) {
                    resultBuilder.append(c);
                    currentSize++;
                } 
                else
                {
                    break; // Stop if adding the character would exceed the size
                }
            }
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string with spaces";
        int maxSize = 20;

        String modifiedString = replaceWhitespaceWithPercentLimitedSize(inputString, maxSize);
        System.out.println(modifiedString);
    }
}
