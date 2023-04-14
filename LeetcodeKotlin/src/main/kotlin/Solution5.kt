class Solution5 {
    fun longestPalindrome(s: String?): String {
        if (s == null || s.length == 0) {
            return ""
        }
        val n = s.length
        val dp = Array(n) { BooleanArray(n) }
        var result = ""
        for (i in n - 1 downTo 0) {
            for (j in i until n) {
                dp[i][j] = s[i] == s[j] && (j - i < 3 || dp[i + 1][j - 1])
                if (dp[i][j] && j - i + 1 > result.length) {
                    result = s.substring(i, j + 1)
                }
            }
        }
        return result
    }
}
