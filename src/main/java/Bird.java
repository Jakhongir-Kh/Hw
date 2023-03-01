public interface Bird {
    default void sit(){
        System.out.println("done");
    }
    default void takeOff(){
        System.out.println("Taken off");
    }
}
