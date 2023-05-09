import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Map<Character, Integer> letterMap = new HashMap<>();
        String transformedPhrase = phrase.toLowerCase()
            .replace("-", "")
            .replace(" ", "");
        for(Character letter : transformedPhrase.toCharArray()){
            if(letterMap.containsKey(letter)){
                return false;
            }else{
                letterMap.put(letter, 1);
            }
        }
        return true;
    }

}
