package java_basics;

interface MyInterface {
    int operate(int a, int b);
}

public class Lamda {
    public static void main(String[] args) {
        MyInterface add = (a, b) -> a + b;
        System.out.println(add.operate(2, 3)); // Output: 5
    }
}
