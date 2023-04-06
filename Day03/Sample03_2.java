import java.io.*;
class Sample03_2 
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
            System.out.println("숫자 입력");
            String str = br.readLine();
            long num = Long.parseLong(str);
            System.out.println(num);

        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
    }
}
