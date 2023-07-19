package cl.samf.individual15_mod5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Pasos para crear RecyclerView
    1 - [X] Layout con RecyclerView
    2 - [X] Item Layout
            [X]Definir Id
            [X]agregar constraints
            [X]height wrapContent
    3 - [X] Asignar Layout Manager
    4 - [] Adapter + ViewHolder
    5 - [] obtener los datos
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}