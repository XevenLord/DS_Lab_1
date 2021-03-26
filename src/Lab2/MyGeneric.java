package Lab2;

public class MyGeneric <T>{
    T e;

    public MyGeneric() {
    }

    public MyGeneric(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
}

class tester2{
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("This is MyGeneric answer");
        MyGeneric<Integer> intObj = new MyGeneric<>(666);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
