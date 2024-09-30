package javatutorial.day07.day07generic1;

public class GenericTutorial {
    public static void main(String[] args) {
        Pair<String, Integer> obj1 = new Pair<>("one", 1);
        Pair<Integer, String> obj2 = new Pair<>(2, "two");
        System.out.println("key : " + obj1.getKey() +", value : " + obj1.getValue());
        System.out.println("key : " + obj2.getKey() +", value : " + obj2.getValue());
    }
}
