import java.io.*;
class Sample09{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        int[] test = new int[5];
        System.out.println("점수 5회 입력");
        for(int i=0; i<5; i++){
            String str = br.readLine();
            int num = Integer.parseInt(str);
            test[i] = num;
        }
        for(int i = 0; i<5; i++){
            System.out.println((i+1) + "번째 점수는" + test[i]);
        }
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};
        int test2_len = test2.length;
        System.out.println("test2의 길이는" + test2_len);
    }
}