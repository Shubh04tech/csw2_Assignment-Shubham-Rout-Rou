import java.util.HashMap;

public class q8 {
    public static void main(String[] args) {
        String str1 = "NERF";
        String str2 = "FERN";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (char ch : str2.toCharArray()) {
            if (!mapT.containsKey(ch)) {
                mapT.put(ch, 1);
            } else {
                mapT.put(ch, mapT.get(ch) + 1);
            }
        }
        q8 ob = new q8();
        System.out.println("Is Anagram:" + ob.isAnagram(map, mapT));

    }

    public boolean isAnagram(HashMap<Character, Integer> map, HashMap<Character, Integer> mapT) {
        if (map.size() != mapT.size())
            return false;
        for (char ch : map.keySet()) {
            if (mapT.get(ch) != map.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
