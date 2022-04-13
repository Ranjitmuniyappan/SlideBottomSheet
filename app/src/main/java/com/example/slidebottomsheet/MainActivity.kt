package com.example.slidebottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheetFragment = BottomSheetFragment()

        btn_show.setOnClickListener {

            val mBundle = Bundle()
            mBundle.putString("mText","Ranjit")
            bottomSheetFragment.arguments = mBundle
            bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")
        }
    }
}