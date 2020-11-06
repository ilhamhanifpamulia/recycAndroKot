package id.ac.poltektegal.recycleviewapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SnapAdapter :RecyclerView.Adapter <SnapViewHolder>() {
    private val listAdapter by lazy { initList() }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder =
        SnapViewHolder.create(parent)

    override fun getItemCount(): Int = 10
    override fun onBindViewHolder(holder: SnapViewHolder, position: Int) {
        holder.bind(listAdapter[position])
    }

    private fun initList(): ArrayList<String> {
        val list = arrayListOf<String>()
        for (x in 1..10) {
            list.add("Gambar $x")
        }
        return list

    }
}