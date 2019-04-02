package com.pagepetty.miwok

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openNumbersList(view: View) {
        val i = Intent(this, Numbers::class.java)
        startActivity(i)
    }

    fun openFamilyList(view: View) {
        val i = Intent(this, FamilyMembers::class.java)
        startActivity(i)
    }

    fun openColorsList(view: View) {
        val i = Intent(this, Colors::class.java)
        startActivity(i)
    }

    fun openPhrasesList(view: View) {
        val i = Intent(this, Phrases::class.java)
        startActivity(i)
    }
}