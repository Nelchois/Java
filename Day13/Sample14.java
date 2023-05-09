import java.io.*;
class Car{
    private int num;
    private double gas;

    public void set_status(int n, double g)
    {
        if (n > 0 && g > 0){
            num = n;
            gas = g;
            System.out.println("재설정, 번호: "+num+" 연료: "+gas);
        }
        else{
            System.out.println("번호나 연료의 범위 확인");
        }
    }

    public void set_status(int n)
    {
        if (n > 0){
            num = n;
            System.out.println("번호 재설정: " + num);
        }
        else{
            System.out.println("번호의 범위 확인");
        }
    }

    public void set_status(double g)
    {
        if (g > 0){
            gas = g;
            System.out.println("연료 재설정:" + gas);
        }
        else{
            System.out.println("연료의 범위 확인");
        }
    }


    public void show()
    {
        System.out.println("번호: "+ num);
        System.out.println("연료: "+ gas);
    }
}

class Sample14{
    public static void main(String[] args) throws IOException
    {
        Car car1 = new Car();
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        boolean t = true;
        while (t == true){
            System.out.println("종료시 fin 입력");
            String str = br.readLine();
            switch (str){
                case "fin":
                    car1.set_status(10.5);
                    car1.set_status(2222);
                    t = false;
                    break;
            
                default:
                    int n = Integer.parseInt(str);
                    String str_g = br.readLine();
                    double g = Double.parseDouble(str_g);
                    car1.set_status(n);
                    car1.set_status(g);
            }
        }
        System.out.println("정상종료");
}
} 