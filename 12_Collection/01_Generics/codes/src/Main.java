public class Main {
    public static void main(String[] args) {
        //for Box.java
        Box box = new Box("Water");
        box.container = 123;//So it is not type safe it is storing all values String , int any.
        //So it can create problems at runtime
        System.out.println(box.getValue());

        //For Box1.java
        Box1<String> box1 = new Box1<String>("Wow this is amazing");
        System.out.println(box1.getValue());//Wow this is amazing
        System.out.println(box1.getClass().getName());//Box1
        //We want to know type of Generic we are using
        System.out.println(box1.container.getClass().getName());//java.lang.String

        Box1<Integer> box2 = new Box1<Integer>(123);
        System.out.println(box2.getValue());//123
        System.out.println(box2.container.getClass().getName());//java.lang.Integer (Parent is Number)

        Box1<Boolean> box3 = new Box1<>(true);
        System.out.println(box3.getValue());
        System.out.println(box3.container.getClass().getName());//java.lang.Boolean (Parent is Serializable)
    }
}
