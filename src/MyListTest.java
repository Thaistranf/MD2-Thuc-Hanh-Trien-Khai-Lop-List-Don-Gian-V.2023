public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Element 2: " + list.get(2));
        System.out.println("Element 3: " + list.get(3));
        System.out.println("Element 1: " + list.get(1));
        System.out.println("Element 0: " + list.get(0));

//        list.get(7);
//        System.out.println("Element 7: " + list.get(7));

        list.get(-1);
        System.out.println("Element -1: " + list.get(-1));
    }
}