public class Box1<T> {
    T container;
    public Box1(T container){
        this.container = container;
    }

    public T getValue(){
        return this.container;
    }


}
