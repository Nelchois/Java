import java.io.*;
class Car
{
    private int number;
    private double gas;
    private double kmeter;

    public Car()
    {
        number = 0;
        gas = 0.0;
        kmeter = 0;
        System.out.println("자동차 객체 생성");
    }

    public void set_info(int n, double g, double m){
        number = n;
        gas = g;
        kmeter = m;
    }
        
    void show_info(){
        System.out.println("차량번호는 " + number + "입니다");
        System.out.println("사용 거리는" + kmeter + "이고 연료는 " + gas + "입니다");
    }

    public void call(){
        System.out.println("차량 정보 조회");
        this.show_info();
    }

}

class Sample19
{
    public static void main(String [] args)
    {
        Car car1;
        car1 = new Car();
        car1.set_info(1234, 0.5, 1);

        Car car2;
        car2 = car1;
        car1.call();
        car2.call();

        car2.set_info(0, 0.0, 0);
        car1.call();
        car2.call();

        car1 = null;
        car2.call();

        Car[] cars;
        cars = new Car[3];
        
        for(int i =0; i<cars.length; i++)
        {
            cars[i] = new Car();
        }

        cars[0].set_info(1234, 0.8, 8);
        cars[1].set_info(5678, 0.02, 10);
        cars[2].set_info(4321, 0.58, 3);

        for(int i = 0; i<cars.length; i++)
        {
            cars[i].show_info();
        }
    }
}