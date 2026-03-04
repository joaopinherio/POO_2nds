import java.util.Scanner;


public class cap1{  
    public static void main(String[] args){

        int n = get_n();
        till_n(n);

        int [] num_vit =  new int [n+1];
        set_array(num_vit, n);

    }

    public static int get_n(){
        Scanner in = new Scanner (System.in);

        System.out.println("Insira o valor de um inteiro ");
        int a = in.nextInt();

        return a;
    }

    public static void till_n(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(i);
            if(i != n)System.out.print(", ");
        }
    }

    public static int[] set_array(int a[], int n){
        for (int i = 0; i <= n; i++){
            a [i] = i;
        }   
        return a;
    }
}



