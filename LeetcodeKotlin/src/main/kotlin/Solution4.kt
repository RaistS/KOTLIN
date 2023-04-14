class Solution4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val m = nums1.size
        val n = nums2.size
        val merged = IntArray(m + n)
        var i = 0
        var j = 0
        var k = 0
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i]
                i++
            } else {
                merged[k] = nums2[j]
                j++
            }
            k++
        }

        // Add remaining elements of nums1
        while (i < m) {
            merged[k] = nums1[i]
            i++
            k++
        }

        // Add remaining elements of nums2
        while (j < n) {
            merged[k] = nums2[j]
            j++
            k++
        }
        return if (merged.size % 2 == 0) {
            // Even number of elements
            (merged[merged.size / 2] + merged[merged.size / 2 - 1]) / 2.0
        } else {
            // Odd number of elements
            merged[merged.size / 2].toDouble()
        }
    }
}