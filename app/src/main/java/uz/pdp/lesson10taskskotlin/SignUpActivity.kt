package uz.pdp.lesson10taskskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide()

        initViews()
    }

    private fun initViews() {
        val button = findViewById<Button>(R.id.sign_up_btn)
        val text = findViewById<TextView>(R.id.text_sign_in)
        val email = findViewById<EditText>(R.id.email)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)
        val confirm_password = findViewById<EditText>(R.id.confirm_password)

        button.setOnClickListener {
            if (email.text.length==0
                || password.text.length==0
                || name.text.length==0
                || confirm_password.text.length==0){
                Toast.makeText(applicationContext, "To'liq to'ldiring", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
        text.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}