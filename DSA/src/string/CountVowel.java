package string;

public class CountVowel {
    public static void main(String[] args) {
        String s1 = "Yogesh";

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = Character.toLowerCase(s1.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
