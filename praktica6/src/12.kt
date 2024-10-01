fun swapElements(array: IntArray, index1: Int, index2: Int) {
    // Проверка на валидность индексов
    if (index1 in 0 until array.size && index2 in 0 until array.size) {
        // Меняем элементы местами с помощью деструктурирующего присваивания
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    } else {
        // Выводим сообщение об ошибке, если индексы не валидны
        println("Неверные индексы")
    }
}

fun main() {
    // Создаем массив целых чисел
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Выводим исходный массив
    println("Исходный массив: ${numbers.contentToString()}")

    // Меняем местами элементы с индексами 1 и 3
    swapElements(numbers, 1, 3)

    // Выводим массив после перестановки
    println("Массив после перестановки: ${numbers.contentToString()}")
}