package ogliari.com.hotelaria;

import java.io.Serializable;

/**
 * Created by guilhermeogliari on 04/05/17.
 */

public class Hotel implements Serializable {

    private String nome;
    private String endereco;
    private float estrelas;
    private int imagem;

    public static Hotel[] hoteis = {
            new Hotel("Recife Hotel", "Av 1", 4.5f, R.drawable.hotel1),
            new Hotel("Canario Hotel", "Av 1", 5.0f, R.drawable.hotel2),
            new Hotel("Grand Hotel Dor", "Av 1", 3.5f,R.drawable.hotel3 ),
            new Hotel("Hotel Cool", "Av 1", 4.5f, R.drawable.hotel1),
            new Hotel("Hotel Infinito", "Av 1", 3.0f, R.drawable.hotel2),
            new Hotel("Hotel Tulipa", "Av 1", 4.0f, R.drawable.hotel3),
    };

    public Hotel() {
    }

    public Hotel(String nome, String endereco, float estrelas, int imagem) {
        this.nome = nome;
        this.endereco = endereco;
        this.estrelas = estrelas;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(float estrelas) {
        this.estrelas = estrelas;
    }

    public int getImagem() { return imagem; }

    public void setImagem(int imagem) { this.imagem = imagem; }

    @Override
    public String toString() {
        return nome;
    }
}
