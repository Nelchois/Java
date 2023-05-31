import java.io.*;
class Sample18
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String str_1 = br.readLine();

        char a = 'a';
        String str = "str";

        StringBuffer sb = new StringBuffer(str_1);
        sb.append(str);
        
        System.out.println(str_1 + "에 " + str + "을 추가하면 "+sb+"가 된다.");
        
        sb.insert(3, a);
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}