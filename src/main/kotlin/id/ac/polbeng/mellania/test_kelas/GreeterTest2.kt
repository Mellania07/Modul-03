package id.ac.polbeng.mellania.test_kelas

fun main() {
    val greeter2 = Greeter2()
    greeter2.greet()
    greeter2.text = "Hi"
    greeter2.greet("Anton")
    greeter2.greet("Budi")
    greeter2.text = "Hello programmer"
    println(greeter2.with_ret_val("Dono"))
} 