package novohatkoProjectStringHome3;

import java.util.Scanner;

public class MainH3 {
    public static void main(String[] args) {
        /*
        Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:\t");
        String sentence = scanner.nextLine();
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine().replaceAll("\\s+", " ").trim();
        char[] arrChar = sentence.toCharArray();
        //считаем сколько слов в строке
        int count = 0;
        for (int i = 0; i < arrChar.length; i++) {
            char a = arrChar[i];
            if (' ' == a) {
                count++;
            }
        }
        //формируем массив слов
        String arr[] = new String[count + 1];
        int j = 0;
        arr[j] = "";
        for (int i = 0; i < arrChar.length; i++) {
            if (' ' == arrChar[i]) {
                j++;
                arr[j] = "";
                continue;
            }
            arr[j] += String.valueOf(arrChar[i]);
        }
        //сортируем и выводим массив
        for (int k = 0; k < arr.length; k++) {
            for (int i = k + 1; i < arr.length; i++) {
                if (arr[i].length() < arr[k].length()) { //меняем знак для сортировки по убыванию(возростанию) количества знаков в слове
                    String t = arr[k];
                    arr[k] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[k]);
        }
    }
}
