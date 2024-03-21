import gb_collections.GbList;
import gb_collections.lists.GbArrayList;
import gb_collections.lists.GbLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Application {
    public static void application(){
        System.out.print("Hello world!\n");
        System.out.println("My name is Sublustrum007");
        System.out.println("*****************************");

        GbList<Integer> list = new GbArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println("Index =  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,  10, 11]");
        System.out.println("Number = " + list + " - " + "Size = " + list.size());
        list.removeByIndex(1);
        System.out.println("Number = " + list + " - " + "Size = " + list.size());
        list.remove(5);
        System.out.println("Before added Number = " + list + " - " + "Size = " + list.size());
        list.add(5, 777);
        System.out.println("Aftep added Number = " + list + " - " + "Size = " + list.size());

        GbList<String> stringList = new GbArrayList<>();
        stringList.add("sdsdf");
        stringList.add("test1");
        System.out.println(stringList);
        System.out.println();

        System.out.println("*****************************");
        System.out.println("Begin LinkedList");
        GbList<String> linkList = new GbLinkedList<>();
        linkList.add("test1");
        linkList.add("test2");
        linkList.add("test3");
        linkList.add("test4");
        linkList.add("test5");
        linkList.add("test6");
        linkList.add("test7");
        linkList.add("test8");
        linkList.add("test9");
        linkList.add("test10");
        linkList.add("test11");
        linkList.add("test12");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());
        System.out.println("*****************************");
        linkList.add(10, "testing");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());
        linkList.add(12, "testoviy");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());
        linkList.add(0, "qwerty");
        linkList.add(200, "Altair");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());
        System.out.println("*****************************");
        System.out.println("Before delete");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());
        linkList.removeByIndex(12);
        System.out.println("*****************************");
        System.out.println("After delete");
        System.out.println("String = " + linkList + " - " + "Size = " + linkList.size());

    }
}
