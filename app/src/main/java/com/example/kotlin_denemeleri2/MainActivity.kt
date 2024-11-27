package com.example.kotlin_denemeleri2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_denemeleri2.R

class MainActivity : AppCompatActivity() {
    private var currentImageIndex = 0
    private val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val buttonChangeImage: Button = findViewById(R.id.buttonChangeImage)

        buttonChangeImage.setOnClickListener {
            currentImageIndex = (currentImageIndex + 1) % images.size
            imageView.setImageResource(images[currentImageIndex])
        }
    }
}
