class phone{
    public void showtime(){
        System.out.println("it is show time");
    }
    public void on(){
        System.out.println("hello");
    }
}
class smartphone extends phone{
    public void call(){
        System.out.println("call my friend");
    }
    public void on(){
        System.out.println("hemlo");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
         phone p = new smartphone();
         p.showtime();
         p.on();

        
    }
    
}
