package com.example.profileui

import androidx.compose.foundation.layout.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.filled.FastForward

import androidx.compose.material.icons.outlined.Score
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreditSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        CreditRow(
            icon = Icons.Outlined.Score,
            title = "credit score",
            value = "757",
            highlight = "REFRESH AVAILABLE",
            highlightColor = Color(0xFF00C853)
        )

        Divider(color = Color.Gray.copy(alpha = 0.3f), thickness = 1.dp)

        CreditRow(
            icon = Icons.Filled.CurrencyRupee,
            title = "lifetime cashback",
            value = "₹3"
        )

        Divider(color = Color.Gray.copy(alpha = 0.3f), thickness = 1.dp)

        CreditRow(
            icon = Icons.Filled.FastForward,
            title = "bank balance",
            value = "check"
        )
    }
}

@Composable
fun CreditRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    value: String,
    highlight: String? = null,
    highlightColor: Color = Color.Gray
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 14.sp
                )

                if (highlight != null) {
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "• $highlight",
                        color = highlightColor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // Optional: Add a subtle subtitle or timestamp
        }

        Text(
            text = value,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.width(8.dp))

        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(16.dp)
        )
    }
}
