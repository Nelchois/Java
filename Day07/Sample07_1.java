import java.io.*;
class Sample07_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        String ans = !(num == 1)? "1이 아님" : "1임";
        System.out.println(ans);
    }
}