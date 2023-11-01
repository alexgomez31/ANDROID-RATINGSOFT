package com.example.ratingsof


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ratingsof.R


class ActivityVista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista)

        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)

        btnIniciarSesion.setOnClickListener(View.OnClickListener {
            // Aquí puedes agregar la lógica de inicio de sesión con número de identidad y contraseña
            val numeroIdentidad = "usuario123"
            val contrasena = "contraseña123"

            // Reemplaza esto con la lógica real de autenticación
            if (esValido(numeroIdentidad, contrasena)) {
                // Si las credenciales son válidas, puedes realizar alguna acción aquí
            } else {
                // Si las credenciales no son válidas, mostramos un mensaje de error
                showErrorDialog()
            }
        })
    }

    // Función para verificar si las credenciales son válidas (simulado)
    private fun esValido(numeroIdentidad: String, contrasena: String): Boolean {
        return numeroIdentidad == "usuario123" && contrasena == "contraseña123"
    }

    // Función para mostrar un mensaje de error en caso de inicio de sesión incorrecto
    private fun showErrorDialog() {
        // Aquí puedes implementar la lógica para mostrar un cuadro de diálogo de error.
        // Por ejemplo, un cuadro de diálogo emergente con un mensaje de error.
        // También puedes usar librerías de diálogos personalizados si lo prefieres.
    }
}
