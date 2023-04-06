import java.io.*;
public class Sample03_1 
{
 public static void main(String[] args) throws IOException
 {
    BufferedReader br = 
    new BufferedReader(new InputStreamReader(System.in));
    System.out.println("문자열 입력");
    String str = br.readLine();
    System.out.println(str);
    System.out.println("숫자 입력");
    String str_num = br.readLine();
    int num = Integer.parseInt(str_num);
    System.out.println(num);
 }   
}
