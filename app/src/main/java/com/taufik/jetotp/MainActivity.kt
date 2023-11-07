package com.taufik.jetotp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taufik.jetotp.ui.theme.JetOTPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetOTPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OtpApp()
                }
            }
        }
    }
}

@Composable
fun OtpApp() {
    var otpValue by remember { mutableStateOf("") }

    OTPTextField(
        otpText = otpValue,
        onOtpTextChanged = { value, _ ->
            otpValue = value
        }
    )
}

@Preview(showBackground = true)
@Composable
fun OtpAppPreview() {
    JetOTPTheme {
        OtpApp()
    }
}