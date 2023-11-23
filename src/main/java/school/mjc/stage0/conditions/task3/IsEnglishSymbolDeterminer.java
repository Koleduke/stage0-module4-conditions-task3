package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char c = symbol;
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        {System.out.println("English");}
        else{System.out.println("Non English");}
    }
}
