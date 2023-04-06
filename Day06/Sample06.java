import java.io.*;

class Sample06
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num == 1){
            System.out.println(num + "입력되었습니다.");
        }
        
        else if (num == 2){
            System.out.println("입력값 num은 1이 아닙니다.");
        }
        
        else{
            System.out.println("입력값 num 은 1, 2가 아닙니다.");
        }


    }
}