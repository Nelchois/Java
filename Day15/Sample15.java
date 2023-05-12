class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("자동차 객체 생성");
    }

    public void show()
    {
        System.out.println("차량 번호: " + num);
        System.out.println("연료 잔량: " + gas);
    }
    
    public Car(int n, double g)
    {
        num = n; gas = g;
        System.out.println("자동차 객체 생성 번호: "+ num +" 연료: " + gas);
    }
}
class Car2
{
    private int num2;
    private double gas2;
    
    private Car2()
    {
        num2 = 0;
        gas2 = 0.0;
        System.out.println("자동차 객체2 생성");
    }

    public void show()
    {
        System.out.println("차량 번호: " + num2);
        System.out.println("연료 잔량: " + gas2);
    }

    public Car2(int n, double g)
    {
        this();
        num2 = n; gas2 = g;
        System.out.println("차량 번호 갱신: " + num2 + "연료 갱신: " + gas2);
    }
}

class Sample15
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();

        Car2 car2 = new Car2(1234, 50.5);
        car2.show();
    }
}