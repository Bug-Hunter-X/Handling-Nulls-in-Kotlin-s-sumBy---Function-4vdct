fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sumBy { it }
    println(sum) // Output: 15

    val list2 = listOf<Int?>(1, 2, null, 4, 5)
    val sum2 = list2.sumBy { it ?: 0 } 
    println(sum2) // Output: 12
    
    val sum3 = list2.sumOf { it ?: 0 }
    println(sum3) // Output 12
} 