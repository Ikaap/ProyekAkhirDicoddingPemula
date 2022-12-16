package com.ikapurwanti.proyekakhir_ikapurwanti

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListProdukAdapter(private val listProduk: ArrayList<Produk>) : RecyclerView.Adapter<ListProdukAdapter.ListViewHolder>() {
    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        val ivGambar : ImageView= itemView.findViewById(R.id.img_item_gambar)
        val card : CardView = itemView.findViewById(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_produk, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val produk = listProduk[position]

        Glide.with(holder.itemView.context)
            .load(produk.gambar)
            .apply(RequestOptions().override(55, 55))
            .into(holder.ivGambar)
        holder.tvName.text = produk.nama
        holder.tvDetail.text = produk.detail

        holder.card.setOnClickListener{
            val intent = Intent(it.context, HalamanDetailActivity::class.java)
            intent.putExtra("nama", listProduk[position].nama)
            intent.putExtra("gambar", listProduk[position].gambar)
            intent.putExtra("harga", listProduk[position].harga)
            intent.putExtra("deskripsi", listProduk[position].deskripsi)
            intent.putExtra("manfaat", listProduk[position].manfaat)
            intent.putExtra("cara", listProduk[position].cara)
            intent.putExtra("ukuran", listProduk[position].ukuran)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

}

