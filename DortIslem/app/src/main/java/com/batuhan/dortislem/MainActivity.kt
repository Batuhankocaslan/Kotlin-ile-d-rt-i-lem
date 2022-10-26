package com.batuhan.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun arti(view: View){
        var sayı1=birinci.text.toString().toIntOrNull()
        var sayı2=ikinci.text.toString().toIntOrNull()

        if(sayı1==null || sayı2==null){
            sonuc.text="Lütfen Sayı Giriniz"
        }else {
            var toplam=sayı1*sayı2
            sonuc.text="Sonuç = ${toplam}"
        }
    }

    fun eksi(view: View){
        var sayı1=birinci.text.toString().toIntOrNull()
        var sayı2=ikinci.text.toString().toIntOrNull()

        if(sayı1==null || sayı2==null){
            sonuc.text="Lütfen Sayı Giriniz"
        }else {
            var toplam=sayı1*sayı2
            sonuc.text="Sonuç = ${toplam}"
        }
    }
    fun çarpma(view: View){
        var sayı1=birinci.text.toString().toIntOrNull()
        var sayı2=ikinci.text.toString().toIntOrNull()

        if(sayı1==null || sayı2==null){
            sonuc.text="Lütfen Sayı Giriniz"
        }else {
            var toplam=sayı1*sayı2
            sonuc.text="Sonuç = ${toplam}"
        }
    }

    fun bölme(view: View){
        var sayı1=birinci.text.toString().toIntOrNull()
        var sayı2=ikinci.text.toString().toIntOrNull()

        if(sayı1==null || sayı2==null){
            sonuc.text="Lütfen Sayı Giriniz"
        }else {
            var toplam=sayı1*sayı2
            sonuc.text="Sonuç = ${toplam}"
        }
    }






    }