import java.io.*;
class Sample10{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        int[] sort = new int[5];
        for(int i=0; i<sort.length; i++)
        {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            sort[i] = num;
        }
        for(int s=0; s<sort.length-1; s++){
            for(int t=s+1; t<sort.length; t++){
                if(sort[t]> sort[s]){
                    int change = sort[t];
                    sort[t] = sort[s];
                    sort[s] = change;
                }
            }
        }
        for(int j = 0; j<sort.length; j++){
            System.out.println(sort[j]);
        }
    }
}