public class VariableAdder2 {

    public String bookc;
    private int bookA = 24;


    int bookC;
    static int bookD = 31;

    public void method() {
        final int bookE = 33;


    }


    public static void main(String[] args) {
        VariableAdder2 obj = new VariableAdder2();
        System.out.println(obj.bookD);


        int BookB = 12;


        int result = BookB + bookD;
        System.out.println(result);
    }
}

