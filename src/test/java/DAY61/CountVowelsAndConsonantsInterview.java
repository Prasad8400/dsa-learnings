package DAY61;

public class CountVowelsAndConsonantsInterview {
  public static void main(String[] args) {
    String s = "automation testing";
    s = s.replace(" ", "");
    int vowels = 0;
    int consonants = 0;

    for (char word : s.toCharArray()) {
      if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
        vowels++;
      } else {
        consonants++;
      }
    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
  }

}
