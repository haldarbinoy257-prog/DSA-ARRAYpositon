public class InsertElementAtPosition {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int elementToInsert = 99;
        int position = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {

            if (i < position) {
                newArr[i] = arr[i];

            } else if (i == position) {
                newArr[i] = elementToInsert;

            } else {
                newArr[i] = arr[i - 1];
            }
        }

        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}