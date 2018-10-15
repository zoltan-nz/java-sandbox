package nz.zoltan;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeMapping {
    public static void main(String[] args) {
        TreeMap<String, Object> treeMap1 = new TreeMap<String, Object>();
        treeMap1.put("key", 4);
        treeMap1.put("second", "hello world");

        TreeMap<String, Object> treeMap2 = new TreeMap<String, Object>();
        treeMap2.put("key", 4);
        treeMap2.put("second", "hello world");

        List<Object> aList = new ArrayList<Object>(treeMap1.values());
        List<Object> bList = new ArrayList<Object>(treeMap2.values());

        System.out.println(aList.size());

        boolean equal = aList.equals(bList);
        System.out.println(equal);
    }
}
