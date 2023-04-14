import java.lang.Exception
import kotlin.math.pow

class Solution8 {
    fun myAtoi(s: String): Int {
        val (num) = "(^[-+]?\\d+)([\\s+-.\\dA-Za-z]*)".toRegex().find(s.trimStart())?.destructured ?: return 0

        val isPlus: Boolean = num.first() != '-'
        return try {
            num.toInt()
        } catch (e: NumberFormatException) {
            when {
                isPlus -> Int.MAX_VALUE
                else -> Int.MIN_VALUE
            }
        }

    }
}