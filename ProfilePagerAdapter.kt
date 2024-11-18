package com.exemplo.gestaodesporte

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProfilePagerAdapter(context: Context) : FragmentStateAdapter(context as AppCompatActivity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TrainingsFragment()
            else -> GoalsFragment()
        }
    }
}
