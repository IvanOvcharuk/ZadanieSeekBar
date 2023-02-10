package com.example.zadanieseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekBarWidth = findViewById<SeekBar>(R.id.seek_bar_width)
        val seekBarHeight = findViewById<SeekBar>(R.id.seek_bar_height)
        seekBarWidth.progress = 100
        seekBarHeight.progress = 100
        val seekBarWidth2 = findViewById<SeekBar>(R.id.seek_bar_width2)
        val seekBarHeight2 = findViewById<SeekBar>(R.id.seek_bar_height2)
        seekBarWidth2.progress = 100
        seekBarHeight2.progress = 100
        val seekBarWidth3 = findViewById<SeekBar>(R.id.seek_bar_width3)
        val seekBarHeight3= findViewById<SeekBar>(R.id.seek_bar_height3)
        seekBarWidth3.progress = 100
        seekBarHeight3.progress = 100
        seekBarWidth.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView).scaleX = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        seekBarHeight.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView).scaleY = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        seekBarWidth2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView2).scaleX = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        seekBarHeight2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView2).scaleY = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        seekBarWidth3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView3).scaleX = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        seekBarHeight3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var scale = progress.toFloat() /100f
                findViewById<ImageView>(R.id.imageView3).scaleY = scale
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        findViewById<Button>(R.id.resetbtn).setOnClickListener {
            seekBarWidth.progress = 100
            seekBarHeight.progress = 100
            seekBarWidth2.progress = 100
            seekBarHeight2.progress = 100
            seekBarWidth3.progress = 100
            seekBarHeight3.progress = 100
        }
    }
}