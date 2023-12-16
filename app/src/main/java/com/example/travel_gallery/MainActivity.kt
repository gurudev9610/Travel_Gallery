package com.example.travel_gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var currentImage = 0
    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next= findViewById<ImageButton>(R.id.btnNext)
        val prev= findViewById<ImageButton>(R.id.btnPrev)

        next.setOnClickListener {
            // i want to get the next image
            var idCurrentImageString= "pic$currentImage"

            // i have to get the integer address associated with each view
            var idCurrentImageInts= this.resources.getIdentifier (idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInts)
            image.alpha= 0f

            currentImage = (5+currentImage+1)%5
            var idImageToShowString= "pic"+currentImage
            var idCurrentImageInt= this.resources.getIdentifier (idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInt)
            image.alpha= 1f
        }
        prev.setOnClickListener {
            // i want to see the previous image
            var idCurrentImageString= "pic$currentImage"

            // i have to get the integer address associated with each view
            var idCurrentImageInts= this.resources.getIdentifier (idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInts)
            image.alpha= 0f

            currentImage = (5+currentImage-1)%5
            var idImageToShowString= "pic"+currentImage
            var idCurrentImageInt= this.resources.getIdentifier (idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInt)
            image.alpha= 1f
        }
    }
}