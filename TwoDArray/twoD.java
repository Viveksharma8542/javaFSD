// print two dimensional array
public class twoD {
    public static void main(String[] args) {
        twoD sc = new twoD();
        int arr[][] = new int[5][5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = k;
                k++;
   
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
      

   
