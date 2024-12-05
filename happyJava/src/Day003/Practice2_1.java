package Day003;

public class Practice2_1 {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        int[] array3 = new int[array1.length+array2.length];

        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array1[i];
            index++;
        }

        int j = 0;
        //#1 : 김동규(byunicom) 추가 2024.12.05
        int k = 0;  //#1
        for (int i = 0; i < array2.length; i++) {
            for (j = 0; j < index; j++) {
                if (array2[i] == array3[j]) {
                    k++;    //#1
                    break;
                }
            }
            if (j == index) {
                array3[index] = array2[i];
                index++;
            }
        }

        //#1 array3.length -> array3.length-k
        for (int i = 0; i < array3.length-k; i++) {
            System.out.print(array3[i]);
        }
    }
}
