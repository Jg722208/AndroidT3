package com.jguerrero.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jguerrero.myapplication.Adapter.Anime;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rvContacts);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Contacto> anime = new ArrayList<>();
        anime.add(new Contacto("https://www.cinemascomics.com/wp-content/uploads/2018/02/SwordArtOnline.jpg","Kakegurui","Kakegurui es un manga dramático y de misterio escrito por Homura Kawamoto e ilustrado por Tōru Naomura."));
        anime.add(new Contacto("https://peliomanta.com/wp-content/uploads/2019/11/Peli-o-Manta.-Resumen-Psycho-Pass-Temporada-1.-detectives-con-pistolas.-780x405.jpg","Psycho-Pass","En el futuro cercano, es posible medir el potencial de violencia de cada persona. La inspectora Akane Tsunemori es parte de una unidad especial que persigue a estos individuos potencialmente peligrosos."));
        anime.add(new Contacto("https://www.muycomputer.com/wp-content/uploads/2019/06/One-Punch-Man-A-Hero-Nobody-Knows.jpg","One Punch Man","One Punch-Man es un webcómic de acción y comedia japonés, creado por el artista One e iniciado en 2009. El webcómic rápidamente ganó popularidad, llegando a alcanzar las 7.9 millones de visitas"));
        anime.add(new Contacto("https://www.tierragamer.com/wp-content/uploads/2019/11/The-Promised-Neverland-159-450x300.jpg","The Promised Neverland","The Promised Neverland es una serie manga escrita por Kaiu Shirai e ilustrada por Posuka Demizu. La obra narra la historia de unos niños huérfanos, liderados por una joven de once años llamada Emma"));
        anime.add(new Contacto("https://gaminguardian.com/wp-content/uploads/2018/05/sirius-de-jaeger.jpg","Sirius the Jaeger","En la Tokio imperial, un grupo que se llaman a sí mismos Jaegers persigue en secreto a vampiros que buscan el Arca de Sirius."));
        anime.add(new Contacto("https://upload.wikimedia.org/wikipedia/en/thumb/8/82/Ao_no_Exorcist.jpg/220px-Ao_no_Exorcist.jpg","Blue Exorcist","Ao no Exorcist, también conocida como Blue Exorcist, es una serie de manga de acción y sobrenatural escrita e ilustrada por Kazue Katō"));
        anime.add(new Contacto("https://www.masgamers.com/wp-content/uploads/2019/02/god-eater-banner.jpg","God Eater","Traducción del inglés-God Eater es una serie de videojuegos de rol de acción y ciencia ficción desarrollados por Shift y publicados por Bandai Namco Entertainment"));
        anime.add(new Contacto("https://2.bp.blogspot.com/-go0aG7BBExk/VN4mcUFl9dI/AAAAAAAALxw/yZKHpE3nTHc/s1600/Zankyo-no-Terror.jpg","Zankyō no Terror","Tokio está bajo un ataque terrorista y la única pista es un extraño video que circula en Internet"));
        anime.add(new Contacto("https://www.casaspammer.com/wp-content/uploads/2017/04/death-note-02232016.jpg","Death Note","Death Note es una serie de manga escrita por Tsugumi Ōba e ilustrada por Takeshi Obata, y cuya adaptación a serie de anime fue dirigida por Tetsurō Araki"));
        anime.add(new Contacto("https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_SteinsGateElite_image1280w.jpg","Steins Gate","Steins;Gate es una novela visual japonesa desarrollada por 5pb. y Nitroplus y lanzada el 15 de octubre de 2009 para Xbox 360. Es la segunda colaboración entre las dos compañías"));

        rv.setAdapter(new Anime(anime));

    }

    public class Contacto {
        private String image;
        private String titulo;
        private String descripcion;

        public Contacto(String image, String titulo, String descripcion) {
            this.image = image;
            this.titulo = titulo;
            this.descripcion = descripcion;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }
}