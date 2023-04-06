import java.io.*;
class Sample08_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        while(num <= 5){
            System.out.println(num + "번째 반복");
            num++;
        }
    }
}