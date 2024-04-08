import java.util.*;

public class ejemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v[] = {1,5,4,-5,0,7,6,3,2,9,8};
        int n = v.length;
        int acu[] = new int[n+1];
        

        for(int i=0; i<n; i++){
            acu[i+1] = v[i]+acu[i];
        }
        int L=5, R=9;
        int res = acu[R] - acu[L-1];
        System.out.println("la suma en el rango "+L+ " a "+R);
        System.out.println("Es "+res);


        vector();


        int arr[] = {1,3,5,2,-1,5,6,7,9};
        n = arr.length;
        vectorInv(0, n, arr);
        System.out.println();


        int a = 3*5*7, b= 2*3*7;
        int mcd = MaxComDiv(a,b);
        System.out.println("El maximo comun divisor es");
        System.out.println("MCD("+a+","+b+") = "+mcd);
        
    }

    // Mostrar todos los subconjuntos de un vector
    public static void vector(){
        char v[] = {'a','b','c'};
        int n = v.length;
        for(int mask=0 ; mask<(1<<n); mask++){
            System.out.print("{");
            for(int i=0; i<n; i++){
                if((mask & (1<<i)) != 0){
                    System.out.print(" "+v[i]);
                }
            }
            System.out.println(" }");
        }
        
    }

    // Mostrar los elementos de un vector recursivamente en el orden inverso.
    public static void vectorInv(int i, int n, int ar[]){
        if(i<n){
            vectorInv(i+1, n, ar);
            System.out.print(ar[i]+" ");
        }
    }

    public static int MaxComDiv(int a, int b){
        if(b==0)
            return a;
        return MaxComDiv(b,a%b);
    }




}