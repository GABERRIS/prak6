fun main() {
    // Запрашиваем у пользователя размер массива
    print("Введите размер массива: ")
    val размерМассива = readLine()!!.toInt()

    // Создаем массив для хранения чисел
    val числа = IntArray(размерМассива)

    // Запрашиваем у пользователя элементы массива
    println("Введите элементы массива:")
    for (i in 0 until размерМассива) {
        print("Число ${i + 1}: ")
        числа[i] = readLine()!!.toInt()
    }

    // Выводим массив на консоль
    println("Введенный массив:")
    for (число in числа) {
        print("$число ")
    }
    println()
}