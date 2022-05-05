package com.example.sportycars.ui.gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sportycars.databinding.ActivityGalleryDetailBinding

class GalleryDetailActivity : AppCompatActivity() {
    private var _binding: ActivityGalleryDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
    }
}