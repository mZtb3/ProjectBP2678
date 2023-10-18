package com.example.projectbp2678

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val telpon:ImageView = findViewById(R.id.imageView2)
        val call:TextView = findViewById(R.id.textView9)
        val rvSma:RecyclerView = findViewById(R.id.recyclerViewSma)

        rvSma.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<SmaResponsi>()
        data.add(SmaResponsi(R.drawable.sma1, "SMA 1 Amikom", "Kunjungan perpustakaan dari SMA 1 Amikom yang diselenggarakan pada Senin, 16 Oktober 2023"))

        data.add(SmaResponsi(R.drawable.sma2, "SMA 2 Amikom", "Kunjungan perpustakaan dari SMA 2 Amikom yang diselenggarakan pada Jumat, 13 Oktober 2023"))

        data.add(SmaResponsi(R.drawable.sma3, "SMA 3 Amikom", "Kunjungan perpustakaan dari SMA 3 Amikom yang diselenggarakan pada Kamis, 12 Oktober 2023"))

        data.add(SmaResponsi(R.drawable.sma4, "SMA 4 Amikom", "Kunjungan perpustakaan dari SMA 4 Amikom yang diselenggarakan pada Senin, 9 Oktober 2023"))

        data.add(SmaResponsi(R.drawable.sma5, "SMA 5 Amikom", "Kunjungan perpustakaan dari SMA 5 Amikom yang diselenggarakan pada Senin, 9 Oktober 2023"))

        call.setOnClickListener {
            val callIntent: Intent= Uri.parse("tel:081234567891").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
        }

        telpon.setOnClickListener{
            val telponIntent: Intent= Uri.parse("tel:081234567891").let {
                number-> Intent(Intent.ACTION_DIAL,number)
            }
        }
    }
}