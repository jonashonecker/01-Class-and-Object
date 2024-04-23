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
    }

}
