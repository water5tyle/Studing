import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	int mas [][]={{0,0,0,0,0},{0,0,0,0},{0,0,0},{0,0},{0}};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5; i++){
            mas[0][i]=Integer.parseInt(reader.readLine());
        }
        int j = 4;
        for(int i = 0; i<4;i++){

            for(int k= j-1; k>=0; k--){
                mas[i+1][k]= mas[i][k]+mas[i][k+1];
            }
            j--;
        }
            int t = 20;
        for(int i = 4 ; i >=0; i--){
            t-=5;
            for(int b = i+1; b>0; b--)
                System.out.print(" ");
            for(int k = 0; k<mas[i].length;k++) {
                System.out.print(" ");
                System.out.print(mas[i][k]);
                if(mas[i][k]<10)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
