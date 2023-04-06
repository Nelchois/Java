import java.io.*;
class Sample08{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        if (num >= 5)
        {
            for (int i = 1; i <= num; i++){
                System.out.println(i + "번째 반복입니다");
            }
        }
    }
}

