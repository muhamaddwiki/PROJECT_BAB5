package com.example.project_bab5

import Getsetarray //untuk meng import kelas Getsetarray

object dataArray {
    //untuk menampung data array

    private val languages = listOf("Soekarno", "Soeharto", "Habibie", "Gusdur", "Megawati","Susilo Bambang Yudhoyono","Jokowi WiDodo")
    //muntuk mendeklarasikan listOf()string

    val desk = listOf( // untuk mengisi listOF pada variabel desk atau deskripsi
        "Soekarno adalah presiden ke 1 di indonesia",
        "Soeharto adalah presiden ke 2  di indonesia",
        "Habibie adalah presiden ke 3 di indonesia",
        "Gusdur adalah presiden ke 4 di indonesia",
        "Megawati Soekarno putri adalah presiden ke 5 di indonesia",
        "Susilo Bambang Yudhoyono adalah presiden ke 6 & 7 di indonesia",
        "Jokowi widodo adalah presiden ke 8 & 9 di indonesia"
    )

    private val pictDat = intArrayOf( //untuk mendeklarasikan gambar harus menggunakan IntArrayOf()
        R.drawable.soekarno, //untuk memanggil gambar pada drawlable
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gsdr,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<Getsetarray> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<Getsetarray>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = Getsetarray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}