package nz.zoltan;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NCopies {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Collections.nCopies(8, 3));
        System.out.println(arrayList);
    }
}
