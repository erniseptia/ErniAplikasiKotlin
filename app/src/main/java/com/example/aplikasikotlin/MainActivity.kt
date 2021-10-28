package com.example.aplikasikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import java.nio.file.attribute.AclFileAttributeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit_btn(view: View) {

        val toast = Toast.makeText(applicationContext, "Anda Berhasil Login", Toast.LENGTH_SHORT)
        toast.show()
    }

}