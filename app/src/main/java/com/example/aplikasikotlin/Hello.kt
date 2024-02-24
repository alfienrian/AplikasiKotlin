package com.example.aplikasikotlin

fun main(args: Array<String>) {
    biodata("Amro Alfien Syachrian Nadzief", "nasi goreng")
    hobby("Coding", "Saya suka belajar dengan hal teknologi salah satunya yaitu meng-coding dan juga belajar menjadi frontend developer")
}

fun biodata(nama: String, makananFavorit: String, kelas: String = "2A", prodi: String = "Teknologi Informasi") {
    println("""
        ---------------------------------------
        =            Hello world!             =
        ---------------------------------------
        Halo perkenalkan nama saya $nama. Saya sekarang kuliah di prodi $prodi 
        kelas $kelas. Makanan kesukaan saya adalah $makananFavorit
    """.trimIndent())
    print("\n") // Buat baris baru
}

fun hobby(nama: String, deskripsi: String) {
    println("""
        ========================================
        |          Hobi saya saat ini          |
        ========================================
        Hobi        : $nama
        Deskripsi   : $deskripsi
    """.trimIndent())
}