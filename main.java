import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0,a = scn.nextInt();
        for(int i = 0; i < a;i++){
            int digit = scn.nextInt();
        
            while(digit!=0){
                digit = digit/10;
                ++count;
            }
            if(count == 1){
            System.out.println(count);
        }}
        
    }
}