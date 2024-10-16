
import java.util.Arrays;
import java.util.Scanner;
class computer{
    // public void playmusic(){ 
        
    //     System.out.println("abhimusic"+"   ");
    //     int r = add(10,20);
    //     System.out.println(r); 
        
    // } 
   

    // public String getMusicId(int num){ 
        
    //     if(num >= 10){
    //         return "abhi";
    //     }
    //     else{
    //         return "nothing";
    //     }

    // }
    // fibonacci
    // public int  add(int n1, int n2){ 
    //    return n1 + n2;

       
    // } 
    // public int finsum(int n){
    //     int sum =0;
    //     for(int i =0;i<=n;i++){
    //         sum = sum+i;
    //     }return sum;
    // }
    public void printArr(int[] var1) {  
        Scanner sc = new Scanner(System.in);
        int m = var1.length;

        for(int i = 0;i<m;i++){ 
            var1[i]=sc.nextInt();
   //System.out.print(var1[i]+" ");
        }for(int i =0;i<m;i++){
            System.out.print(var1[i]+" ");
        }
       System.err.println();
    }  
    public int[] removearray(int[] arr){
        int oddcount= 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] % 2 != 0){
                oddcount++;
            }
        }
        int [] result = new int[oddcount];
        int index =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0) {
                result[index]=arr[i];
                index++;
                
            }
        }return result;
    } 
    public int findmin(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    } 
    public int findmax(int[] arr){
        int max = 0;
        int secmax = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){ 
                secmax = max;
                max=arr[i];
            }else if (arr[i]>secmax && arr[i] != max) {
                secmax=arr[i];
            }
        }return secmax;
    }  
    public int[] zerosmove(int[] arr, int n){
        int j = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
   
    public void demo(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        printArr(arr);
        int[] result = removearray(arr); 
        int[] rs= zerosmove(arr, m);
        System.err.println("The removed elements are :"+Arrays.toString(result));
       
        System.out.println("The min value in the array is: "+findmin(arr));
        System.out.println("The max value in the array is : "+findmax(arr));
        System.out.println("ZerosMove array:" +Arrays.toString(rs));
    } 
    public void reversarr(int[] number, int start, int end){
        while (start<end) {
            int temp = number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
            
        }
    }
  
     public void arrayDemo() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size of the arr:");
       int m = sc.nextInt();  
       int[] arre = new int[m];
       System.out.println("Enter the "+arre.length+" elements"); 
       for(int i = 0; i<m;i++){
        arre[i]=sc.nextInt();
        
       }
       System.out.print("Total elements  in the array is :");
       for(int i =0; i<m;i++){
        System.out.print(arre[i]+" ");

       }
       System.out.println();
       //printArr(arre); 
       reversarr(arre, 0,arre.length-1);
        System.out.println("Reversed array: " + Arrays.toString(arre));
      
      
     }
}




public class Demo{
    public static void main(String[] args) {
        computer cm = new computer();
        // cm.playmusic(); 
        // int s= cm.finsum(5);
        // System.out.println(s);

       
        // // String str = cm.getMusicId(4); 
        // int[] arr ={1, -5, 6, -7, 8, 3};
        // int max = Integer.MIN_VALUE;
        // for(int i =0;i< arr.length;i++){
        //     if(arr[i]>max){
        //         max= arr[i];
        //     }
    // }

        //  System.out.println(max);  
        //  Scanner sc = new Scanner(System.in);
        //  int m=sc.nextInt();
        //  int[] arrs = new int[m];
        //  for(int i =0; i< m;i++){
        //     arrs[i]=sc.nextInt();
        //  }for(int i =0;i<m;i++){
        // System.out.print(arrs[i]+" ");}
        // cm.arrayDemo(); 
       cm.demo();
       

        
    }
}