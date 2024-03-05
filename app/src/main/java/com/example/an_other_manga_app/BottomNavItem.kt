package com.example.an_other_manga_app

data class BottomNavItem(val iconResId: Int, val label: String)

val bottomNavItems = listOf(
    BottomNavItem(R.drawable.ic_library_24dp, "Library"),
    BottomNavItem(R.drawable.ic_browse_24dp, "Browse")
)