package com.revision.mytweeter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList:List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currenttweet=twitterList.get(position)
        holder.tvName.text=currenttweet.name
        holder.tvHandle.text=currenttweet.handle
        holder.tvTweet.text=currenttweet.tweet


    }

    override fun getItemCount(): Int {
        return twitterList.size

    }
}

class  TwitterViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet= itemView.findViewById<TextView>(R.id.tvTweet)
    var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgPerson= itemView.findViewById<ImageView>(R.id.imgPerson)
    var imgLike= itemView.findViewById<ImageView>(R.id.imgLike)
    var imgMessage= itemView.findViewById<ImageView>(R.id.imgMessage)
    var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)

}