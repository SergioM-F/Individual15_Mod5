package cl.samf.individual15_mod5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import cl.samf.individual15_mod5.databinding.ActivityMainBinding

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
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapterRecycler = AdapterRecycler()
        val pokedex = Pokedex.getPokedex()
        val layoutManager = LinearLayoutManager(this)
        val dividerItemDecoration = DividerItemDecoration(binding.RecyclerView.context, layoutManager.orientation)
        binding.RecyclerView.addItemDecoration(dividerItemDecoration)
        adapterRecycler.setData(pokedex)
        binding.RecyclerView.adapter = adapterRecycler
    }
}