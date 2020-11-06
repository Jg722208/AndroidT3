package com.jguerrero.myapplication.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jguerrero.myapplication.MainActivity;
import com.jguerrero.myapplication.R;
import com.jguerrero.myapplication.MainActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Anime extends RecyclerView.Adapter<Anime.AnimeViewHolder>{

    ArrayList<MainActivity.Contacto> mData;
    private  boolean favorito = false;

    public Anime(ArrayList<MainActivity.Contacto> anime) {
        mData = anime;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.animes, parent, false);
        Anime.AnimeViewHolder vh = new Anime.AnimeViewHolder(v,context);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        Context context = holder.context;
        TextView nombre = holder.itemView.findViewById(R.id.nombreAnime);
        TextView descri = holder.itemView.findViewById(R.id.descAnime);
        ImageView image = holder.itemView.findViewById(R.id.imageAnime);
        ImageButton boton = holder.itemView.findViewById(R.id.imageButton);

        String nomb = mData.get(position).getTitulo();
        String desc = mData.get(position).getDescripcion();
        String imag = mData.get(position).getImage();

        Picasso.get().load(imag).into(image);
        nombre.setText(nomb);
        descri.setText(desc);

        Log.i("MIAPP","tamaño  de array: " + mData.size());

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(favorito){
                    favorito = false;
                    boton.setImageResource(R.drawable.marca_favorito);
                    Toast.makeText(context.getApplicationContext(),"Añadido a favoritos", Toast.LENGTH_LONG).show();
                }else
                {
                    favorito = true;
                    boton.setImageResource(R.drawable.no_favorita);
                    Toast.makeText(context.getApplicationContext(),"Eliminado de favoritos", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    @Override
    public int getItemCount() {

        return mData.size();
    }
    public class AnimeViewHolder extends RecyclerView.ViewHolder{
        public Context context;
        public AnimeViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.context = context;
        }
    }

}