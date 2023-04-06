import java.io.*;
class Sample08_2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        do{
            System.out.println(num + "번째 do");
            num++;
        }while(num <= 10);
    }
}