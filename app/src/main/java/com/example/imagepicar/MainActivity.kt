package com.example.imagepicar

import android.app.Instrumentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {


           lateinit var image:ImageView
           lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image=findViewById(R.id.image)
        button=findViewById(R.id.button)








val galleryLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) {
            val galleryUri = it
    try{
               image.setImageURI(galleryUri)



    }catch(e:Exception){
        e.printStackTrace()
    }

        }



        button.setOnClickListener {


            galleryLauncher.launch("image/*")




        }

    }
}








