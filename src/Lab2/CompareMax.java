package Lab2;

public class CompareMax{

    public static <T extends Comparable<T>> void maximum(T num1, T num2, T num3){
        //1 number is max
        if(num1.compareTo(num2)>0 && num1.compareTo(num3)>0){
            System.out.println(num1 + " is the maximum value among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }
        else if(num2.compareTo(num1)>0 && num2.compareTo(num3)>0){
            System.out.println(num2 + " is the maximum value among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }
        else if(num3.compareTo(num1)>0 && num3.compareTo(num2)>0){
            System.out.println(num3 + " is the maximum value among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }

        //2 numbers are max{(1,2),(1,3),(2,3)}
        else if(num1.compareTo(num2)>0 && num1.compareTo(num3)==0){
            System.out.println(num1 + " is the maximum values among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }
        else if(num1.compareTo(num2)==0 && num1.compareTo(num3)>0){
            System.out.println(num1 + " is the maximum values among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }
        else if(num2.compareTo(num1)>0 && num2.compareTo(num3)==0){
            System.out.println(num2 + " is the maximum values among the numbers : " + num1 + ", " + num2 + " & " + num3);
        }
        //All 3 numbers are same
        else{
            System.out.println("All 3 numbers are same value!");
        }
    }
}

class tester3 extends CompareMax{
    public static void main(String[] args) {
        maximum(1,3,2);
    }
}
