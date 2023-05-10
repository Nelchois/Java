class Car
{
    public static int count = 0;
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        count++;
        System.out.println("자동차 객체 생성됨");
    }

    public void set_status(int n, double g)
    {
        num = n;
        gas = n;
        System.out.println("차량 번호 갱신: " +num);
        System.out.println("연료량 갱신 " +gas);

    }

    public static void show_count()
    {
        System.out.println("총 차량 대수: " +count);
    }

    public void show()
    {
        System.out.println("차량 번호 조회: " +num);
        System.out.println("연료량 조회: " +gas);

    }

}

class Sample14
{
    public static void main(String[] args)
    {
        Car.show_count();
        Car car1 = new Car();
        car1.set_status(1234, 20.2);

        Car car2 = new Car();
        Car.show_count();
        
    }
}
