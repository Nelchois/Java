import java.io.*;

class Sample06_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int num = Integer.parseInt(str);

        switch(num){
            case 1:
                System.out.println("1 입력");
                break;

            case 2:
                System.out.println("2 입력");
                break;
            
            default:
                System.out.println("조건없음");
                break;

        }


    }
}