

class ListNode {
    var `val` = 0
    var next: ListNode? = null

    internal constructor()
    internal constructor(`val`: Int) {
        this.`val` = `val`
    }

    internal constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
}

internal class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        if ((l1 == null) or (l2 == null)) return null // handle invalid input
        val result = ListNode(0) // lista enlazada resultante
        var curr: ListNode? = result // nodo actual en la lista enlazada resultante
        var carry = 0 // valor de arrastre
        while (l1 != null || l2 != null) {
            // suma los valores de los nodos actuales y el valor de arrastre
            var suma = carry
            if (l1 != null) suma += l1.`val`
            if (l2 != null) suma += l2.`val`

            // actualiza el valor de arrastre y el nodo actual en la lista enlazada resultante
            carry = suma / 10
            curr!!.next = ListNode(suma % 10)
            curr = curr.next

            // pasar al siguiente nodo de la lista enlazada de entrada
            if (l1 != null) l1 = l1.next
            if (l2 != null) l2 = l2.next
        }

        // manejar cualquier valor de arrastre restante
        if (carry > 0) curr!!.next = ListNode(carry)
        return result.next // devuelve la lista enlazada resultante sin el nodo ficticio
    }
}
