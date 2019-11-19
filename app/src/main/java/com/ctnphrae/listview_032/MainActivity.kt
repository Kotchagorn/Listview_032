package com.ctnphrae.listview_032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Fate/stay night","นารูโตะ","Is It Wrong to Try to Pick Up Girls in a Dungeon?","รักไร้เสียง","แคลนนาด","Bungo Stray Dogs: Dead Apple","ยอดนักสืบจิ๋วโคนัน","ยูกิโอ เกมกลคนอัจฉริยะ","โปเกมอน","วันพีช","อินเดกซ์ คัมภีร์คาถาต้องห้าม","My Hero Academia","The Seven Deadly Sins","K-ON!","ฤดูฝัน ฉันมีเธอ","Assassination Classroom",
        "ดราก้อนบอล","Accel World","Fullmetal Alchemist","Haikyuu")
    val detailArr = arrayOf("เอมิยะ ชิโร่",
        "เอุซึมากิ นารูโตะ",
        "เบล คาแนล",
        "Shoya Ishida",
        "โทโมยะ โอคาซากิ",
        "นาคาจิมะ อัตสึชิ",
        "คุโด้ ชินอิจิ",
        "มุโต้ ยูกิ",
        "ซาโตชิ",
        "มังกี้ ดี. ลูฟี่",
        "โทมะ คามิโจ",
        "มิโดริยะ อิซึคุ",
        "Meliodas",
        "ฮิราซาว่า ยูอิ",
        "เชินไค มาโกโตะ",
        "ชิโอตะ นางิสะ",
        "ซง โกคู",
        "Haruyuki Arita",
        "เอ็ดเวิร์ด เอลริค",
        "ฮินาตะ โชโย")
    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ข้อมูล")
        val mAdapter = ArrayAdapter(context,
            android.R.layout.simple_list_item_1,
            titleArr)

        lv_anime.adapter = mAdapter
        lv_anime.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(context,
                "anime ${titleArr[position]} , ตัวเอกชื่อ ${detailArr[position]}"
                ,Toast.LENGTH_LONG).show()
        }
    }
}
