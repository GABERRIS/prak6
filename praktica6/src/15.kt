fun main() {
    val array = arrayOf(1, 2, 3, 2, 1) // Пример массива

    if (isPalindrome(array)) {
        println("Массив является палиндромом")
    } else {
        println("Массив не является палиндромом")
    }
}

fun isPalindrome(array: Array<Int>): Boolean {
    // Если массив пустой или содержит только один элемент, то он является палиндромом
    if (array.isEmpty() || array.size == 1) {
        return true
    }

    // Идём по половине массива (исключая средний элемент, если его размер нечётный)
    for (i in 0 until array.size / 2) {
        // Если элементы с противоположных концов массива не равны, то он не является палиндромом
        if (array[i] != array[array.size - 1 - i]) {
            return false
        }
    }

    // Если все элементы совпадают, то массив является палиндромом
    return true
}