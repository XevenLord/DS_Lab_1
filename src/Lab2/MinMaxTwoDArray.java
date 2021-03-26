package Lab2;

public class MinMaxTwoDArray<E> {
    E[][] array;

    public MinMaxTwoDArray(E[][] array) {
        this.array = array;
    }

    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        for(int i=0; i< list.length; i++){
            for(int j=0; j< list.length; j++){
                if(min.compareTo(list[i][j])>0){
                    min = list[i][j];
                }
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for(int i=0; i< list.length; i++){
            for(int j=0; j< list.length; j++){
                if(max.compareTo(list[i][j])<0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}

class testerQ6{
    public static void main(String[] args) {
        Integer[][] array2D = {{4,5,6},{1,2,3}};
        MinMaxTwoDArray<Integer> numbers = new MinMaxTwoDArray<>(array2D);
        System.out.println("Minimum : " + numbers.max(array2D));
    }
}