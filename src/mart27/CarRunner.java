package mart27;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2020;

        System.out.println("marka : "+car1.marka +
                ", model : "+ car1.model+
                ", yil : "+ car1.yil);

        Car car2=new Car("Opel", "Corsa");
        System.out.println("marka : "+car2.marka +
                ", model : "+ car2.model);

        Car car3=new Car("Volvo", "S40");
        System.out.println("marka : "+car3.marka +
                ", model : "+ car3.model);
        Car car4=new Car("Nissan", "Kasqai",2022);
    }

}
