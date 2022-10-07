package TwoDimensionalArray;

public class Arrayexample1 {

    public static void main(String[] args) {

        int a[][] = new int[3][2]; // declarion
// storing elements/values into array
        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;

        a[2][0] = 50;
        a[2][1] = 60;
        //classic for loop
        for (int i = 0; i <= 2; i++) // for incrementing he rows
        {
            for (int j = 0; j <= 1; j++) // for incrementing the cl
            {
                System.out.println(a[i][j]); //10 20 30 40 50 60
            }
        }

    }
}
