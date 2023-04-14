class Solution7 {
    fun reverse(x: Int): Int {
        var x = x
        var resultado = 0
        while (x != 0) {
            val ultimoDigito = x % 10
            x /= 10
            if (resultado > Int.MAX_VALUE / 10 || resultado == Int.MAX_VALUE / 10 && ultimoDigito > 7) return 0
            if (resultado < Int.MIN_VALUE / 10 || resultado == Int.MIN_VALUE / 10 && ultimoDigito < -8) return 0
            resultado = resultado * 10 + ultimoDigito
        }
        return resultado
    }
}
