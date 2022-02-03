    package uz.pdp.lesson10taskskotlin

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        countDownTimer()
    }

        private fun countDownTimer() {
            object : CountDownTimer(2000, 100) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    openSignInActivity()
                }
            }.start()
        }

        fun openSignInActivity() {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
}