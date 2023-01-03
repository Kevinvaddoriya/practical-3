

class X{
    int a = 5;
    X(){
        System.out.println('X');
    }
    public void disp(){
        System.out.println('x');
    }
}

class Y extends X{
    int b=10;
    Y(){
        System.out.println('Y');
    }
    public void disp(){
        super.disp();
        System.out.println('y');
        System.out.println("inherit a variable "+super.a);
    }
}

class Z extends Y{
    Z(){
        System.out.println('Z');
    }
    public void disp(){
        super.disp();
        System.out.println("inherit b variable"+super.b);
    }
}

public class pa3 {
    public static void main(String[] args) {
//        new Z();
        new Z().disp();
    }
}
