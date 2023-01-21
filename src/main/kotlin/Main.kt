import kotlin.math.*
fun main() {
    print("Введите cумму перевода: ")
    val inputAmount = readLine()
    val amount = if(inputAmount.isNullOrEmpty()) 0.0 else inputAmount.toDouble()

    print("""Комиссия составит ${max(amount * 0.0075, 35.0)}""")
}