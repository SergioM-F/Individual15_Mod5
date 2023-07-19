package cl.samf.individual15_mod5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.samf.individual15_mod5.databinding.ItemBinding

/* [] definiendo la clase adapter, heredando de la clase RecyclerView.Adapter
   [] crear los 3 metodos onCreateViewHolder, getItemCount, OnbindViewholder
   [] crear clase ViewHolder
   [] ViewHolder hereda de la clase Recyclerview.VieHolder
   [] se agrega el constructor
   [] crea el objeto con dataclass Pokemon
   [] se declara listaPokemones con una mutableListOf
   [] en el getItemCount se retorna listaPokemones.size (tamaño de la lista)
   [] en onCreateViewHolder binding class del item
   [] modificamos el constructor del ViewHolder (View por binding)
   [] binding.root en el viewholder

 */
class AdapterRecycler : RecyclerView.Adapter<AdapterRecycler.ViewHolder>(){

    val listaPokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listaPokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}