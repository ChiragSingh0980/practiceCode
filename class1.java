public class  class1{
    public void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\nNumber is negative, can not calculate square");
        }
        else{
            System.out.println("Square of" + num + "is" + (num*num));
        }
    }
    public static void main(String[] args) {
        class1 obj = new class1();
        obj.checkNum(-3);
        System.out.println("rest of the code");

    }
}