

import java.util.Iterator;
import java.util.LinkedList;


public class main {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
       System.out.println(list);


        // set Iterator as descending
        // using descendingIterator() method
        Iterator reversedList = list.descendingIterator();
        while (reversedList.hasNext()) {
            System.out.println(reversedList.next());

        }
    }



    public static void reverse(LinkedList<String> list){
        for(int i = list.size()-1; i >= 0; i --){
            System.out.println(i);
        }
    }
}


