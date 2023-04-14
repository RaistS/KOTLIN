class Solution9 {
    fun isPalindrome(x: Int): Boolean {
        // Convert the integer to a string
        val xStr = x.toString()

        // Check if the string is the same forwards and backwards
        return xStr == StringBuilder(xStr).reverse().toString()
    }
}
