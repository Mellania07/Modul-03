package id.ac.polbeng.mellania.test_kelas
//Blok inisialisasi diawali dengan keyword init. Selama instansiasi sebuah objek,
//urutan eksekusi blok inisialisasi sama dengan urutan yang ada pada tubuh kelas,
//berselangkan inisialisasi property-nya.

class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main(){
    val initOrder = InitOrder("RPL")
}