public class Main {
    public static void main(String[] args) {

        int[][] nestedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int i = 0;
        while (i < nestedArray.length) {
            int j = 0;
            while (j < nestedArray[i].length) {
                System.out.println(nestedArray[i][j]);
                j++;
            }
            i++;
        }
    }
}
