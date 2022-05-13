import java.util.ArrayList;

public class Matrix {
    /**
     * Készítsen egy Matrix osztályt.
     * Az osztályban írja meg a sumOfNumbersDivisibleByFive és a indexOfRowsWithZeros metódusokat.
     * Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban:
     * előbbi az 5-tel osztható számok összegét, utóbbi azon sorok indexeit,
     * melyek csupa 0 értékből állnak!
     */

    public int sumOfNumbersDivisibleByFive(int[][] matrix){
        int result = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j]%5 == 0){
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }
    public ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] != 0){
                    break;
                }
                else if (j == matrix.length-1){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
