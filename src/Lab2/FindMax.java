package Lab2;

public class FindMax {
    public static class Circle<E extends Comparable<E[]>> implements Comparable<Circle>{
        Double radius;

        public Circle(Double radius) {
            this.radius = radius;
        }

        public static <E extends Comparable<E>> E max(E[] list){
            E max = list[0];
            for(int i=0; i<list.length; i++){
                if(max.compareTo(list[i])<1){
                    max = list[i];
                }
            }
            return max;
        }

        @Override
        public int compareTo(Circle o) {
            return radius.compareTo(o.radius);
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }

        public static void main(String[] args) {
            Integer[] intArray = {1,2,3};
            String[] strArray = {"red", "green", "blue"};
            Circle[] radius = {new Circle(3.0),new Circle(2.9), new Circle(5.9)};
            System.out.println("The maximum number in Integer array is : " + max(intArray));
            System.out.println("The maximum value in String array is : " + max(strArray));
            System.out.println("The maximum value in circle object of radius is : " + max(radius));
        }


    }
}
