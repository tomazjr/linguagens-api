package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// notação dizendo que isso representa um documento no mongo
@Document(collection = "principaisLinguagens")
public class Linguagem {

    // notação de id relacionada ao mongo, pois o mesmo gera um id a cada inserção
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public Linguagem(){}
    
    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }

    
    
}
