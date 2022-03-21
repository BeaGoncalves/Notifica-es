package br.com.estudos.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import br.com.estudos.notifications.databinding.ActivityMainBinding
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal

lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonEnviaNotificacao.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android, Hello World!")
        }
        Log.i("**newToken:", FirebaseInstanceId.getInstance().token.toString())
    }
}