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
   [] se implementa clase onBindViewholder
   [] en onbindViewHolder se declara val item = listaPokemones.get(position)
   [] en onBindViewHolder se implementa holder.bind(item)
   [] se crea la clase bind, con nombres caracteristicos "pokemon"
   [] se agrega a la clase ViewHolder ("val"
   [] se crea los binding de los textView en la clase bind

 */
class AdapterRecycler : RecyclerView.Adapter<AdapterRecycler.ViewHolder>(){

    var listaPokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listaPokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaPokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.listaPokemones = pokedex.toMutableList()

    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.textViewItemNombre.text=pokemon.nombre
            binding.textViewItemTipo.text=pokemon.tipo
        }

    }
}