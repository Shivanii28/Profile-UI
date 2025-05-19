import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RewardsSection() {
    Text("YOUR REWARDS & BENEFITS", color = Color.Gray, fontSize = 12.sp)

    Spacer(modifier = Modifier.height(8.dp))
    RewardItem(title = "cashback balance", value = "₹0")
    RewardItem(title = "coins", value = "26,46,583")
    RewardItem(title = "win upto Rs 1000", value = "refer and earn")
}

@Composable
fun RewardItem(title: String, value: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = title, color = Color.White)
                Text(text = value, color = Color.Gray)
            }
            Icon(
                imageVector = Icons.Filled.KeyboardArrowRight,
                contentDescription = "Arrow",
                tint = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
        Divider(color = Color.Gray.copy(alpha = 0.2f), thickness = 1.dp)
    }
}
