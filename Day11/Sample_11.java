import java.io.*;
class Car
{
    int number;
    double gas;
    double kmeter;

    void set_info(int n, double g, double m){
        number = n;
        gas = g;
        kmeter = m;
    }
        
    void show_info(){
        System.out.println("차량번호는 " + number + "입니다");
        System.out.println("사용 거리는" + kmeter + "이고 연료는 " + gas + "입니다");
    }

    void call(){
        System.out.println("차량 정보 조회");
        this.show_info();
    }

    int take_number(){
        return number;
    }
}

class Sample_11
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        Car car_1 = new Car();
        String str = br.readLine();
        int num = Integer.parseInt(str);
        String str_2 = br.readLine();
        double g = Double.parseDouble(str_2);
        String str_3 = br.readLine();
        double m = Double.parseDouble(str_3);
        car_1.set_info(num, g, m);
        car_1.call();
        int car_1_number = car_1.take_number();
        System.out.println("차량 번호는 " + car_1_number + "입니다");

    }
}