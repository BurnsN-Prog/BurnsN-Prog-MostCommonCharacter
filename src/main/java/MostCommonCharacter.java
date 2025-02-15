import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer> count = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char letter : charArray){
            if(count.containsKey(letter)){
                count.put(letter, count.get(letter)+1);
            }else{
                count.put(letter, 1);
            }
        }

        char mostCommon = ' ';
        int highestCount =0;
        for(HashMap.Entry<Character, Integer> entry : count.entrySet()){
            if(entry.getValue()> highestCount){
            mostCommon = entry.getKey();
            highestCount = entry.getValue();
            }
        
        }
        return mostCommon;
    }
}
