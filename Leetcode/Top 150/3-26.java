/*
 * LeetCode 26. Remove Duplicates from Sorted Array
 *
 * Đề bài:
 * Cho mảng nums đã được sắp xếp tăng dần.
 * Hãy loại bỏ các phần tử trùng lặp sao cho mỗi phần tử xuất hiện chỉ một lần.
 * Việc loại bỏ được thực hiện trực tiếp trong mảng (in-place),
 * và thứ tự phần tử phải được giữ nguyên.
 *
 * Trả về:
 * - k = số phần tử duy nhất trong mảng.
 * - Các phần tử duy nhất nằm ở k vị trí đầu tiên của nums.
 * - Các phần tử còn lại không quan trọng.
 *
 * Ví dụ:
 * Input:  nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 *
 * Input:  nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 *
 * Ý tưởng:
 * - Dùng hai con trỏ:
 *   + k: vị trí ghi phần tử duy nhất tiếp theo.
 *   + Duyệt từng phần tử x trong nums.
 * - Nếu là phần tử đầu tiên (k == 0) hoặc khác phần tử trước đó (x != nums[k-1]),
 *   thì chép x vào nums[k++].
 *
 * Độ phức tạp:
 * - Thời gian: O(n)
 * - Không gian: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; // vị trí ghi phần tử duy nhất
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }
}
