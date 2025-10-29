/*
 * LeetCode 88. Merge Sorted Array
 *
 * Đề bài:
 * Cho hai mảng nums1 và nums2 được sắp xếp tăng dần.
 * - nums1 có độ dài m + n, trong đó m phần đầu là dữ liệu thật, n phần cuối là 0 (dự phòng).
 * - nums2 có độ dài n.
 *
 * Nhiệm vụ:
 * Gộp hai mảng lại thành một mảng duy nhất được sắp xếp tăng dần
 * và lưu kết quả trực tiếp vào nums1 (không trả về mảng mới).
 *
 * Ví dụ:
 * Input: nums1 = [1,2,3,0,0,0], m = 3; nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Ý tưởng:
 * - Duyệt ngược từ cuối mảng (chỉ số k = m + n - 1) để tránh ghi đè.
 * - So sánh phần tử cuối của nums1 và nums2:
 *   + Nếu nums1[i] > nums2[j], chép nums1[i] vào vị trí k.
 *   + Ngược lại, chép nums2[j] vào vị trí k.
 * - Giảm chỉ số tương ứng và lặp cho đến khi chèn hết các phần tử của nums2.
 * 
 * Độ phức tạp:
 * - Thời gian: O(m + n)
 * - Không gian: O(1) (in-place)
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i: con trỏ cuối của phần hợp lệ trong nums1
        // j: con trỏ cuối của nums2
        // k: con trỏ cuối cùng của vùng chứa trong nums1
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }
}
