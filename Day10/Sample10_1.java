import java.io.*;
class Sample10_1{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[2][2];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                String str = br.readLine();
                int element = Integer.parseInt(str);
                array[i][j] = element;
            }
        }

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}