import java.util.HashMap;
import java.util.Map;

class Scrabble {
    
    private String word;
    private static Map<Character, Integer> letterScores = new HashMap<Character,Integer>();
    static{
    letterScores.put('A', 1);
    letterScores.put('E', 1);
    letterScores.put('I', 1);
    letterScores.put('O', 1);
    letterScores.put('U', 1);
    letterScores.put('L', 1);
    letterScores.put('N', 1);
    letterScores.put('R', 1);
    letterScores.put('S', 1);
    letterScores.put('T', 1);

    letterScores.put('D', 2);
    letterScores.put('G', 2);

    letterScores.put('B', 3);
    letterScores.put('C', 3);
    letterScores.put('M', 3);
    letterScores.put('P', 3);

    letterScores.put('F', 4);
    letterScores.put('H', 4);
    letterScores.put('V', 4);
    letterScores.put('W', 4);
    letterScores.put('Y', 4);

    letterScores.put('K', 5);
    
    letterScores.put('J', 8);
    letterScores.put('X', 8);
    
    letterScores.put('Q', 10);
    letterScores.put('Z', 10);
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += letterScores.get(word.charAt(i));
        }
        return score;
    }
    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("cabbage");
    }
}
