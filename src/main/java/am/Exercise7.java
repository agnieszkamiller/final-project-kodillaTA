package am;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);
    }
}
