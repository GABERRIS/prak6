fun main() {
    // Определение исходной матрицы
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Вывод исходной матрицы
    println("Исходная матрица:")
    printMatrix(matrix)

    // Транспонирование матрицы
    val transposedMatrix = transposeMatrix(matrix)

    // Вывод транспонированной матрицы
    println("\nТранспонированная матрица:")
    printMatrix(transposedMatrix)
}

// Функция для транспонирования матрицы
fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    // Получение размеров исходной матрицы
    val rows = matrix.size
    val cols = matrix[0].size

    // Создание транспонированной матрицы
    val transposedMatrix = Array(cols) { IntArray(rows) }

    // Перестановка элементов
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    // Возврат транспонированной матрицы
    return transposedMatrix
}

// Функция для вывода матрицы на консоль
fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (col in row) {
            print("$col ")
        }
        println()
    }
}