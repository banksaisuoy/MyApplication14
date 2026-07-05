package com.example.myapplication

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Populate Top Cards (User Profile & Dashboard Stats)
        val userProfile = MockDataGenerator.generateUserProfile()
        val stats = MockDataGenerator.generateDashboardStats()

        findViewById<TextView>(R.id.tvGreeting).text = "Welcome, ${userProfile.name}"
        findViewById<TextView>(R.id.tvProfileName).text = userProfile.name
        findViewById<TextView>(R.id.tvProfileRole).text = "${userProfile.role} | ${userProfile.subscriptionLevel}"

        if (stats.isNotEmpty()) {
            findViewById<TextView>(R.id.tvStatTitle).text = stats[0].title
            findViewById<TextView>(R.id.tvStatValue).text = stats[0].value
        }

        // Apply animations to static cards
        val cardProfile = findViewById<FrameLayout>(R.id.cardProfile)
        val cardStats = findViewById<FrameLayout>(R.id.cardStats)
        applyScaleAnimation(cardProfile)
        applyScaleAnimation(cardStats)

        // Populate Premium Features dynamically
        val featuresContainer = findViewById<LinearLayout>(R.id.featuresContainer)
        val features = MockDataGenerator.generatePremiumFeatures()

        features.forEach { feature ->
            val featureCard = FrameLayout(this).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 0, 0, resources.getDimensionPixelSize(R.dimen.card_margin))
                }
                setBackgroundResource(R.drawable.glass_background)
                isClickable = true
                isFocusable = true
                setPadding(
                    resources.getDimensionPixelSize(R.dimen.card_padding),
                    resources.getDimensionPixelSize(R.dimen.card_padding),
                    resources.getDimensionPixelSize(R.dimen.card_padding),
                    resources.getDimensionPixelSize(R.dimen.card_padding)
                )
            }

            val contentLayout = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.WRAP_CONTENT
                )
            }

            val titleView = TextView(this).apply {
                text = feature.title
                setTextColor(android.graphics.Color.WHITE)
                textSize = 18f
                setTypeface(null, android.graphics.Typeface.BOLD)
            }

            val descView = TextView(this).apply {
                text = feature.description
                setTextColor(android.graphics.Color.parseColor("#E0E0E0"))
                textSize = 14f
                setPadding(0, resources.getDimensionPixelSize(R.dimen.desc_margin_top), 0, 0)
            }

            contentLayout.addView(titleView)
            contentLayout.addView(descView)
            featureCard.addView(contentLayout)

            // Apply interactive animation
            applyScaleAnimation(featureCard)

            featuresContainer.addView(featureCard)
        }
    }

    private fun applyScaleAnimation(view: View) {
        view.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up)
                    v.startAnimation(scaleUp)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    val scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down)
                    v.startAnimation(scaleDown)
                    if (event.action == MotionEvent.ACTION_UP) {
                        v.performClick()
                    }
                }
            }
            true
        }
    }
}