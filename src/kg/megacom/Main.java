package kg.megacom;

import kg.megacom.models.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Создать TreeSet содержащий HeavyBox.
//        HeavyBox должен реализовать интерфейс Comparable.
//        Распечатать содержимое с помощью for each.

        ArrayList<HeavyBox> boxList = new ArrayList<>();

        boxList.add(new HeavyBox("box1", 28));
        boxList.add(new HeavyBox("box2", 16));
        boxList.add(new HeavyBox("box3", 35));
        boxList.add(new HeavyBox("box4", 24));

        TreeSet<HeavyBox> treeSetBox = new TreeSet<>(boxList);
        System.out.println("Вариант 1");
        treeSetBox.forEach(System.out::println);

        System.out.println("Вариант 2");
        for (HeavyBox item: treeSetBox){
            System.out.println(item);
        }


//        Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//        Избавиться от повторяющихся элементов в строке.
//        Вывести результат на экран.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,4,5));
        HashSet<Integer> hashSetNum = new HashSet<>(numbers);
        System.out.println(hashSetNum);



    }
}
