import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{5, 9, 1, 1, 10, 1, 2, 4, 5, 6, 7, 8, 8, 8, 1};
        List<Integer> nums2 = new ArrayList<>();
        List<Integer> nums3 = new ArrayList<>();
        List<Integer> nums4 = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (!nums2.contains(nums[i])) {
                nums2.add(Integer.valueOf(nums[i]));
            } else nums3.add(nums[i]);

        }

        for (int i = 0; i < nums3.size(); i++) {
            if (!nums4.contains(nums3.get(i))) {
                nums4.add(nums3.get(i));
            }
        }
        Map<Integer, Integer> lista = new HashMap<Integer, Integer>();
        int maior = -1; int repeticoes = 0;
        int m = 0;      int n = 0;
        for (int i = 0; i < nums4.size(); i++) {
            m = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums4.get(i) == (nums[j])) {
                    n = nums4.get(i);
                    m++;
                }
            }
            if (m > repeticoes) {
                maior = n;
                repeticoes = m;
            }
        }
        System.out.println(maior + " é o item majoritário");
    }
}