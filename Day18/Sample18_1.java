import java.io.*;
class Sample18_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 입력");
        String str_1 = br.readLine();

        int num = Integer.parseInt(str_1);
        
        int ans = Math.max(num, 1);
        System.out.println(ans);

        double rand = Math.random();
        System.out.println(rand);

        double d = 50.5;
        double ceil_d = Math.ceil(d);
        double floor_d = Math.floor(d);
        System.out.println(ceil_d);
        System.out.println(floor_d);
    }

}
