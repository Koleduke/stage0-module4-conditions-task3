package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char c = character;

        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'))
        {System.out.println("wrong alphabet!");}
        else{ if(isVowel(c)){
            System.out.println("Vowel");}
            else{System.out.println("Consonant");}
        }

    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
