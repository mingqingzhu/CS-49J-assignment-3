import java.util.HashMap;

public class Card {
    private String notation;
    HashMap<String, String> hashmap1 = new HashMap<>();
    HashMap<String, String> hashmap2 = new HashMap<>();

    public Card(String notation) {
        this.notation = notation.toUpperCase();
        hashmap1.put("A", "Ace");
        hashmap1.put("J", "Jack");
        hashmap1.put("Q", "Queen");
        hashmap1.put("K", "King");
        hashmap2.put("D", "Diamonds");
        hashmap2.put("H", "Hearts");
        hashmap2.put("S", "Spades");
        hashmap2.put("C", "Clubs");
    }


    public String getDescription() {
        String output = " ";
        String key1 = " ";
        String key2 = " ";
        int number = 0;
        if(notation.length() == 2) {
            key1 = notation.substring(0,1);
            key2 = notation.substring(1,2);
            if(Character.isDigit(key1.charAt(0))) {
                number = Integer.parseInt(key1);
            }
            if(number >= 2 && hashmap2.containsKey(key2)) {
                output = key1 + " of " + hashmap2.get(key2);
            } else if (hashmap1.containsKey(key1) && hashmap2.containsKey(key2)) {
                output = hashmap1.get(key1) + " of " + hashmap2.get(key2);
            } else {
                output = "Unknown";
            }
        } else if (notation.length() == 3) {
            char fstDigit = notation.charAt(0);
            char scdDigit = notation.charAt(1);
            key2 = notation.substring(2,3);
            if(fstDigit == '1' && scdDigit == '0' && hashmap2.containsKey(key2)) {
                output = "10 of " + hashmap2.get(key2);
            } else {
                output = "Unkown";
            }
        } else {
            output = "Unkown";
        }
        return output;
    }

}
