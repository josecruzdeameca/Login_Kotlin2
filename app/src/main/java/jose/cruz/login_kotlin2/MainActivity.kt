package jose.cruz.login_kotlin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_ingresar.setOnClickListener{

            val user = editText_usuario.text.toString()
            val pass = editText_contrasena.text.toString()

            if (user.equals("") or pass.equals("")){
                mensajito("Datos vacíos", Toast.LENGTH_LONG)
            } else {
                if (user.equals("jose") and pass.equals("123")){
                    //mensajito("Bienvenido")
                    val intento = Intent(this, segunda::class.java)
                    intento.putExtra("nomre", "jose")
                    startActivity(intento)

                } else {
                    mensajito("No te conozco")
                }

            }

        }


    } // override fun onCreate

    fun mensajito(mensaje: String, duracion: Int=Toast.LENGTH_SHORT) {
        Toast.makeText(this, mensaje, duracion).show()
    }

    override fun onStart() {
        super.onStart()
        Log.w("ejemplo", "Debo estar en el OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("ejemplo", "Debo estar en el onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("ejemplo", "Debo estar en el onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("ejemplo", "Debo estar en el onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("ejemplo", "Debo estar en el onRestart")
    }


} //class MainActivity ---
