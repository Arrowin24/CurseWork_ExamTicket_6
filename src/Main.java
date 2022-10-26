import java.util.Arrays;
/*  Необходимо реализовать следующий метод:
1. Получаем на входе массив чисел.
2. Все четные числа увеличиваем на единицу.
3. Возвращаем кусок списка с 3-го по 7-й элемент.*/

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 5, 8, 1, 6, 1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        int[] newArr = getPartIncrementEvenNums(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] getPartIncrementEvenNums(int[] nums) {
        int fromNum = 3;
        int toNum = 7;

        if (toNum >= nums.length) {
            throw new IllegalArgumentException("Входящая строка содержит меньше " + toNum + " элементов");
        }

        for (int i = 0; i < nums.length; i++) {
            //incrementing even nums
            if (nums[i] % 2 == 0) {
                nums[i]++;
            }
        }
        //cutting array
        return Arrays.copyOfRange(nums,fromNum-1,toNum);
    }

}