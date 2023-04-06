import java.io.*;
class Sample07
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        if (num > 3 && num == 8){
            System.out.println("둘다 만족");
        }
        else if (num > 5 || num < 3){
            System.out.println("하나만 만족");
        }
        else if (!(num == 6) && !(num == 5)){
            System.out.println("일단 6이랑 5는 아님");
        }
    }
}