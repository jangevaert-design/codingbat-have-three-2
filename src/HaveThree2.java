public class HaveThree2 {
  public boolean haveThree(int[] nums) {
    int count = 0;

    if (nums.length < 3) {
      return false;
    } else {
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 3 && nums[i + 1] == 3) {
          return false;
        } else
        if (nums[i] == 3) {
          ++count;
        }
      }
      if (nums[nums.length - 1] == 3) {
        ++ count;
      }
    }

    return (count == 3);
  }
}
