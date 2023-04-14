class Solution6 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val sb = StringBuilder()
        val step = 2 * numRows - 2
        for (i in 0 until numRows) {
            if (i == 0 || i == numRows - 1) {
                var j = i
                while (j < s.length) {
                    sb.append(s[j])
                    j += step
                }
            } else {
                val backStep = step - 2 * i
                var j = i
                while (j < s.length) {
                    sb.append(s[j])
                    if (j + backStep < s.length) {
                        sb.append(s[j + backStep])
                    }
                    j += step
                }
            }
        }
        return sb.toString()
    }
}