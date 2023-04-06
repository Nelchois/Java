import java.io.*;
class Sample04
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 입력");
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}