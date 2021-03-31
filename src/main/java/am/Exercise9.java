package am;

public class Exercise9 {
    Object message(){
        return "Hello!";
    }

    public static void main(String[] args) {
        System.out.println(new Exercise9().message());
        System.out.println(new Exercise99().message());
    }
}

class Exercise99 extends Exercise9{
    String message(){
        return "World!";
    }
}