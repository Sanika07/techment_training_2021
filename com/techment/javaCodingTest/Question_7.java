package javaCodingTest;

import java.util.ArrayList;
import java.util.List;
  
public class Question_7 {
  
    // function to split a list into two sublists in Java
    public static List[] split(List<String> list)
    {
        // create two empty lists
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();
  
        // get size of the list
        int size = list.size();
  
       //first half of the list getting copied
        for (int i = size/2; i < size; i++)
            first.add(list.get(i));
  
       //second half of the list getting copied
        for (int i = 0; i < size / 2; i++)                       
            second.add(list.get(i));
  
        // return a List of array
        return new List[] { first, second };
    }
  
    public static void main(String[] args)
    {
        // create an ArrayList
        List<String> list = new ArrayList<String>();
  
        list.add("java");
        list.add("coding");
        list.add("test");
        list.add("techment");
        list.add("training");
        list.add("sanika");
        list.add("awasthi");
        list.add("splitting");
        list.add("lists");
  
        // call split method which return List of array
        List[] lists = split(list);
  
        System.out.println(lists[0]);
        System.out.println(lists[1]);
    }
}

