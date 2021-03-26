package Lab2;

public class Question4<T>{
    public static <T extends Comparable<T>> String minmax(T[] array){
        T min = array[0];
        T max = array[0];
            for(int i=0; i< array.length; i++){
                if(min.compareTo(array[i])>1){
                    min = array[i];
                }
                else if(max.compareTo(array[i])<1){
                    max = array[i];
                }
            }
            return "Min = " + min + " Max = " + max;
        }
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}



