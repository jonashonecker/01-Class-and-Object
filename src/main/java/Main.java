public class Main {

    public static void main(String[] args){
        Car opel = new Car("Opel", "Corsa", "White", 2003);
        opel.start();
        Car porsche = new Car("Porsche", "Turbo", "White", 2020);
        porsche.start();
        for(int i = 0; i < 1000; i++) {
            porsche.accelerate();
        }
        System.out.println(porsche.speed);

        Person jonas = new Person("Otto", 77, "male" );
        jonas.introduction();
        Person ariel = new Person("Ariel", 99, "female" );
        ariel.introduction();
    }

}
