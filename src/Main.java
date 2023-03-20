import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();
        strings.add("Matmusa");
        strings.add("Momun");
        strings.add("Manas");
        strings.add("Baiel");
        strings.add("Farida");
        methods(strings);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        methods(integers);
    }

    public static <T> void methods(ArrayList<T> arrayList) {
        System.out.println("first element :" + arrayList.get(0));
        System.out.println("last element  :" + arrayList.get(4));
        System.out.println("all elements" + arrayList);

    }
}
