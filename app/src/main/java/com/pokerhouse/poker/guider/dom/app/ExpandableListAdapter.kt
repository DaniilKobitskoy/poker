package com.pokerhouse.poker.guider.dom.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExpandableListAdapter(
    private val context: AppCompatActivity,
    private val groups: List<String>,
    private val children: Map<String, Pair<String, Int>>
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return groups.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return 1 // Each group has only one child
    }

    override fun getGroup(groupPosition: Int): Any {
        return groups[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Pair<String, Int> {
        val groupTitle = groups[groupPosition]
        return children[groupTitle] ?: Pair("", 0)
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val groupTitle = getGroup(groupPosition) as String
        val groupView =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.group_item_layout, parent, false)

        val groupTitleTextView: TextView = groupView.findViewById(R.id.groupTitleTextView)
        groupTitleTextView.text = groupTitle

        return groupView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        val childTitle = getChild(groupPosition, childPosition).first
        val childImageResource = getChild(groupPosition, childPosition).second
        val childView = convertView ?: LayoutInflater.from(context).inflate(R.layout.child_item_layout, parent, false)

        val childImageView: ImageView = childView.findViewById(R.id.childImageView)
        val childTitleTextView: TextView = childView.findViewById(R.id.childTitleTextView)

        childImageView.setImageResource(childImageResource)
        childImageView.visibility = View.VISIBLE

        childTitleTextView.text = childTitle

        val expandAnimation = AnimationUtils.loadAnimation(context, R.anim.expand_collapse_anim)
        childView.startAnimation(expandAnimation)

        return childView
    }


}
