package com.example.profileui

import RewardsSection
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(6.dp))

        UserProfileSection()
        Spacer(modifier = Modifier.height(6.dp))
        GarageCard()
        Spacer(modifier = Modifier.height(10.dp))
        CreditSection()
        Spacer(modifier = Modifier.height(10.dp))
        RewardsSection()
        Spacer(modifier = Modifier.height(8.dp))
        AllTransaction()
    }
}
