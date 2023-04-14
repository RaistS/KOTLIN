class Solution3 {
    fun lengthOfLongestSubstring(s: String?): Int {
        if (s == null || s.length == 0) return 0 // manejar entrada inválida
        val set: MutableSet<Char> = HashSet() // set para rastrear la subcadena actual
        var l = 0
        var r = 0
        var maxLength = 0 // límites de la ventana y longitud de la subcadena más larga
        while (r < s.length) {
            // mueve el límite derecho de la ventana hacia adelante
            if (set.add(s[r])) {
                r++
            } else {
                // mover el borde izquierdo de la ventana hacia delante
                set.remove(s[l])
                l++
            }

            // actualiza la longitud de la subcadena más larga
            maxLength = Math.max(maxLength, r - l)
        }
        return maxLength
    }
}