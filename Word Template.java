import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
        /* part (a) */
        int index=word.indexOf("A");
        String result=word;
        String temp=word.subString(0,index);
        if(index==-1||(index==word.length()-1)){
            return word;
        }
        while(index!=-1&&(!word.subString(index+1,index+2).equals("A")){
            result=temp+word.subString(index+1+temp.length(),index+2+temp.length())+"A"+word.subString(index+2+temp.length());
            temp=temp+word.subString(index+1+temp.length(),index+2+temp.length())+"A";
            index=word.subString(index+temp.length()).indexOf("A");
        }
              return result;
            
    }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
        /* part (b) */
        List<String> haha=new ArrayList<String>;
        for(int i=0;i<wordList.size();i++){
            if(!wordList.get(i).equals(scrambleWord(wordList.get(i)){
                haha.add(wordList.get(i));
            }
        }
        wordList=haha;
0)
    }

    public static void main(String[] args)
    {
        
    }
}
