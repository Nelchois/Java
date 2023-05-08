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

    public void show()
    {
        System.out.println("번호: "+ num);
        System.out.println("연료: "+ gas);
    }
}

class Sample12{
    public static void main(String[] args) throws IOException
    {
        Car car1 = new Car();
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        String str_g = br.readLine();
        double g = Double.parseDouble(str_g);
        
        car1.set_status(n, g);
        car1.show();

    }
} 