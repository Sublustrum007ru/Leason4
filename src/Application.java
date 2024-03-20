import gb_collections.GbList;
import gb_collections.lists.GbArrayList;

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
//        System.out.println("Index =  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,  10, 11]");
//        System.out.println("Number = " + list + " - " + "Size = " + list.size());
        list.removeByIndex(1);
//        System.out.println("Number = " + list + " - " + "Size = " + list.size());
        list.remove(5);
        System.out.println("Before added Number = " + list + " - " + "Size = " + list.size());
        list.add(5, 777);
        System.out.println("Aftep added Number = " + list + " - " + "Size = " + list.size());

        GbList<String> stringList = new GbArrayList<>();
        stringList.add("sdsdf");
        stringList.add("test1");
//        System.out.println(stringList);
    }
}
