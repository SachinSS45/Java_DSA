public class Box {

    //Object class is top most parent class of all java class
    Object container;//Object class make it General that means we can store any value inside this int,String,float,double
                     //any many more but problem is if I store String value first I want from that point it should store
                    // Only String values but it will store value other values also like int and all. i.e, why we want
                    //Generics here it will give type safety at compile time only we know that which type of value we
                    //are storing
    //See code of Box1.java

    public Box(Object container) {
        this.container = container;
    }

    public Object getValue(){
        return this.container;
    }
}
