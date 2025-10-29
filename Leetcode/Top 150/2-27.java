/*
 * LeetCode 27. Remove Element
 *
 * Đề bài:
 * Cho mảng nums và một giá trị val.
 * Hãy xóa tất cả các phần tử có giá trị bằng val khỏi mảng nums (thực hiện in-place).
 * Thứ tự phần tử có thể thay đổi, và phần sau k phần tử đầu không quan trọng.
 *
 * Kết quả:
 * - Trả về k = số phần tử khác val.
 * - Các phần tử hợp lệ nằm ở k vị trí đầu tiên của nums.
 *
 * Ví dụ:
 * Input:  nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 *
 * Input:  nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 *
 * Ý tưởng:
 * - Duyệt từng phần tử trong mảng (for-each).
 * - Nếu phần tử khác val, chép về đầu mảng (nums[k++]).
 * - Sau khi duyệt xong, k là số lượng phần tử giữ lại.
 *
 * Độ phức tạp:
 * - Thời gian: O(n)
 * - Không gian: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // vị trí ghi phần tử hợp lệ
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
}
