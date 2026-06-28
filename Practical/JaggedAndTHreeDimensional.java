
public class JaggedAndTHreeDimensional {
    public static void main(String[] args) {
        // Jagged Array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Three-Dimensional Array
        int[][][] threeDimensionalArray = new int[2][2][2];
        threeDimensionalArray[0][0][0] = 1;
        threeDimensionalArray[0][0][1] = 2;
        threeDimensionalArray[0][1][0] = 3;
        threeDimensionalArray[0][1][1] = 4;
        threeDimensionalArray[1][0][0] = 5;
        threeDimensionalArray[1][0][1] = 6;
        threeDimensionalArray[1][1][0] = 7;
        threeDimensionalArray[1][1][1] = 8;

        System.out.println("\nThree-Dimensional Array:");
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
