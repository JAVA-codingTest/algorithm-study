import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        int check = 1;
        int checkone = 0X80000000;

        System.out.println(Integer.toBinaryString(num));

        for(int i=0; i<n; i++){
            if(num >= 0){
                if((num | check ) == 0){
                    num = num >> 1;
                    
                    
                }else{
                    num = (num >> 1);  
                    num = num | checkone;
                   
                }

            }
            else{
                if((num& check) == 1){
                    num >>=1;
                }else{
                    num>>=1;
                    num = num & (~checkone);
                }
            }
            
        }

        System.out.println(Integer.toBinaryString(num));

    }
}