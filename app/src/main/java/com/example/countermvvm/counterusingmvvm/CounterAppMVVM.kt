package com.example.countermvvm.counterusingmvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countermvvm.counterusingmvvm.CounterViewModal

@Composable
fun CounterAppMVVM(viewModal : CounterViewModal) {
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Count : ${viewModal.count.value}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(onClick = { viewModal.incriment() }) {
                Text(text = "Inciment")
            }
            Button(onClick = { viewModal.decriment() }) {
                Text(text = "Decriment")
            }
        }
    }
}