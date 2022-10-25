package week6._221025.study.datastructure.hash;

public class Hash {
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i) * (i + 1);
        }
        return asciiSum / key.length();
    }

    public static void main(String[] args) {
        System.out.println(new Hash().hash("minwoo"));
        System.out.println(new Hash().hash("oownim"));
    }
}
