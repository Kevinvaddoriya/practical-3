public class q1{
//    public final void disp(int a){
//        System.out.println(a);
//    }

    public static void main(String[] args) {

        //final int a = 5;
        // a = 52; can not change a value because a is final variable
        int a = 5;
        new demo().disp(a);

    }

}

final class demo {
//    can not override disp method because it is final method
//    public void disp(int a){
//        System.out.println(a);
//    }
    // when class is final then you can not extend the class
public void disp(int a){
    System.out.println(a);
}

}