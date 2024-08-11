package com.example.cusrecyclerfaslha.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cusrecyclerfaslha.R
import com.example.cusrecyclerfaslha.databinding.ActivitySubjectsBinding
import com.example.cusrecyclerfaslha.databinding.ItemSubjectsBinding
import com.example.cusrecyclerfaslha.ui.ChapterActivity.*

class SubjectsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubjectsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val chapterNumber = intent.getIntExtra("CHAPTER_NUMBER", 1)

        when (chapterNumber) {
            1 -> setupForChapter1()
            2 -> setupForChapter2()
            3 -> setupForChapter3()
            4 -> setupForChapter4()
            5 -> setupForChapter5()
            6 -> setupForChapter6()
            7 -> setupForChapter7()
        }
    }

    private fun setupForChapter1() {
        // تنظیمات خاص برای فصل 1
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity("Azmon")
        }
    }

    private fun setupForChapter2() {
        // تنظیمات خاص برای فصل 2
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity2("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity2("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity2("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity2("Azmon")
        }
    }

    private fun setupForChapter3() {
        // تنظیمات خاص برای فصل 3
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity3("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity3("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity3("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity3("Azmon")
        }
    }

    private fun setupForChapter4() {
        // تنظیمات خاص برای فصل 4
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity4("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity4("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity4("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity4("Azmon")
        }
    }

    private fun setupForChapter5() {
        // تنظیمات خاص برای فصل 5
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity5("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity5("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity5("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity5("Azmon")
        }
    }

    private fun setupForChapter6() {
        // تنظیمات خاص برای فصل 6
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity6("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity6("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity6("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity6("Azmon")
        }
    }

    private fun setupForChapter7() {
        // تنظیمات خاص برای فصل 7
        binding.itemSubjectsLayout.imgTadris.setImageResource(R.drawable.tadris)
        binding.itemSubjectsLayout.imgGam.setImageResource(R.drawable.gam)
        binding.itemSubjectsLayout.imgNamonesoalat.setImageResource(R.drawable.namonesoalat)
        binding.itemSubjectsLayout.imgAzmon.setImageResource(R.drawable.azmon)

        // تنظیم OnClickListener برای تصاویر
        binding.itemSubjectsLayout.imgTadris.setOnClickListener {
            navigateToRecyclerViewActivity7("Tadris")
        }
        binding.itemSubjectsLayout.imgGam.setOnClickListener {
            navigateToRecyclerViewActivity7("Gam")
        }
        binding.itemSubjectsLayout.imgNamonesoalat.setOnClickListener {
            navigateToRecyclerViewActivity7("Namonesoalat")
        }
        binding.itemSubjectsLayout.imgAzmon.setOnClickListener {
            navigateToRecyclerViewActivity7("Azmon")
        }
    }


    private fun navigateToRecyclerViewActivity(itemClicked: String) {
        val intent = Intent(this, Chapter1Activity::class.java)
        intent.putExtra("ITEM_CLICKED", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity2(itemClicked: String) {
        val intent = Intent(this, Chapter2Activity::class.java)
        intent.putExtra("ITEM_CLICKED2", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity3(itemClicked: String) {
        val intent = Intent(this, Chapter3Activity::class.java)
        intent.putExtra("ITEM_CLICKED3", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity4(itemClicked: String) {
        val intent = Intent(this, Chapter4Activity::class.java)
        intent.putExtra("ITEM_CLICKED4", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity5(itemClicked: String) {
        val intent = Intent(this, Chapter5Activity::class.java)
        intent.putExtra("ITEM_CLICKED5", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity6(itemClicked: String) {
        val intent = Intent(this, Chapter6Activity::class.java)
        intent.putExtra("ITEM_CLICKED6", itemClicked)
        startActivity(intent)
    }

    private fun navigateToRecyclerViewActivity7(itemClicked: String) {
        val intent = Intent(this, Chapter7Activity::class.java)
        intent.putExtra("ITEM_CLICKED7", itemClicked)
        startActivity(intent)
    }


}
