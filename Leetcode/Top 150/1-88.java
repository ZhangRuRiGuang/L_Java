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
 * Gợi ý:
 * - Duyệt từ cuối mảng để tránh ghi đè dữ liệu.
 * - So sánh phần tử cuối của mỗi mảng, chèn phần lớn hơn vào cuối nums1.
 * - Độ phức tạp: O(m + n)
 */
