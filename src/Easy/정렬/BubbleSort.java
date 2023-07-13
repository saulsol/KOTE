package Easy.정렬;

import java.util.Arrays;

// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 짜봐라
// 정렬하는 방법은 버블정렬
public class BubbleSort {

    public static void main(String[] args) {
        // 버블 소팅
        int [] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));


        for(int i = nums.length-1; i>0; i--){

            for(int j=0; j<i; j++){

                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }
}
