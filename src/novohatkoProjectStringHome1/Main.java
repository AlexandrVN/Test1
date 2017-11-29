package novohatkoProjectStringHome1;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Main {
    public static void main(String[] args) {
        /*
        Даны строки разной длины, необходимо вернуть их первую половину.
        Пример введения:
        firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc"
        */
        firstHalf("WooHoo");
        firstHalf("HelloThere");
        firstHalf("abcdef");
    }

    static void firstHalf(String s) {
        char buf[] = new char[s.length() / 2];
        s.getChars(0, (s.length() / 2), buf, 0);
        System.out.println(buf);

    }
}
