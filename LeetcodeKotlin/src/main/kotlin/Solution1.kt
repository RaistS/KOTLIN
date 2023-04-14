class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
// Creamos un mapa para almacenar cada número y su índice correspondiente
        val map: MutableMap<Int, Int> = HashMap()
        // Iteramos sobre el arreglo de números
        for (i in nums.indices) {
// Calculamos el complemento del número actual, es decir, el número que necesitamos para alcanzar el objetivo
            val complemento = target - nums[i]
            // Si el complemento está en el mapa, entonces hemos encontrado los dos números que necesitamos
            if (map.containsKey(complemento)) {
// Devolvemos un arreglo con los índices de cada número
                return intArrayOf(map[complemento]!!, i)
            }
            // Si el complemento no está en el mapa, entonces añadimos el número actual al mapa para futuras referencias
            map[nums[i]] = i
        }
        // Si no encontramos los números, entonces lanzamos una excepción
        throw IllegalArgumentException("No se ha encontrado solución")
    }
}