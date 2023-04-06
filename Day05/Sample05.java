import java.io.*;
class Sample05
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);
        int b = ++a;
        int c = a++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        int s = a << 2;
        System.out.println("s:" + s);
        int r = 5;
        double p = 3.14;
        System.out.println("지름이 5인 원 둘레" + (r*p));
        
    }
}