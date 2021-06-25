package com.example.glowskin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.glowskin.MainActivity
import com.example.glowskin.R
import com.example.glowskin.activity.Register
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val punyaakun: TextView = findViewById(R.id.daftar)
        val login = findViewById<Button>(R.id.login)
        val etemail = findViewById<EditText>(R.id.email)
        val etpassword = findViewById<EditText>(R.id.password)

        auth = FirebaseAuth.getInstance()
            login.setOnClickListener {
                val email = etemail.text.toString().trim()
                val password = etpassword.text.toString().trim()

                if (email.isEmpty()) {
                    etemail.error = "Email harus diisi !"
                    etemail.requestFocus()
                    return@setOnClickListener
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    etemail.error = "Email Tidak valid !"
                    etemail.requestFocus()
                    return@setOnClickListener
                }

                if (password.isEmpty() || password.length < 6) {
                    etpassword.error = "password kurang dari 6 karakter "
                    etpassword.requestFocus()
                    return@setOnClickListener
                }
                loginUser(email, password)
            }
        punyaakun.setOnClickListener {
            startActivity(Intent(baseContext,Register::class.java))
        }


        }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Intent(this@Login, NavgationBar::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

}


