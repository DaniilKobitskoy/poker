package com.pokerhouse.poker.guider.dom.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expandableListView: ExpandableListView = findViewById(R.id.expandableListView)
        val groups = resources.getStringArray(R.array.groups)
        val descriptions = resources.getStringArray(R.array.group_descriptions)
        val images = arrayOf(
            R.drawable.image_group1_1, R.drawable.image_group2_1, R.drawable.image_group3_1,
            R.drawable.image_group4_1, R.drawable.image_group5_1, R.drawable.image_group6_1,
            R.drawable.image_group7_1, R.drawable.image_group8_1, R.drawable.image_group9_1,
            R.drawable.image_group10_1
        )
        val children = mutableMapOf<String, Pair<String, Int>>()
        for (i in 0 until groups.size) {
            val groupName = groups[i]
            val description = descriptions[i]
            val imageResource = images[i]

            children[groupName] = Pair(description, imageResource)
        }

        val adapter = ExpandableListAdapter(this, groups.toList(), children)
        expandableListView.setAdapter(adapter)


    }
}

