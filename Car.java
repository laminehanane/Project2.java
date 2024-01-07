package Project2;

public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    void calculsalePrice(){
        System.out.println(carPrice);

    }

    abstract void calculsalePrice(double price, double weight);

    abstract void calculsalePrice(double price, int length);

    abstract void calculsalePrice(double price);
}
class Sedan extends Car{
    int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    void calculsalePrice(double price, double weight) {

    }

    @Override
    void calculsalePrice(double price,int length) {
        if (length>20){
            carPrice=price*5/100;
        }else {
            carPrice=price*10/100;
        }
        System.out.println(carPrice);
    }

    @Override
    void calculsalePrice(double price) {

    }
}
class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    void calculsalePrice(double price,double weight) {
        if (weight>2000){
            carPrice=price*10/100;

        }else {
            carPrice=price*20/100;

        }
        System.out.println(carPrice);
    }

    @Override
    void calculsalePrice(double price, int length) {

    }

    @Override
    void calculsalePrice(double price) {

    }
}
class CarTester{
    public static void main(String[] args) {
        Car [] c={new Sedan(1000,"white",15),new Truck(5000,"black",3000)};
        for (Car Veh : c) {
         Veh.calculsalePrice(1000);
         Veh.calculsalePrice(2500,3000);

        }




    }
}
