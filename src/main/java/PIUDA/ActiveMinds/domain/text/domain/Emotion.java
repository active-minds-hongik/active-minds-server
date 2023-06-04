package PIUDA.ActiveMinds.domain.text.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Emotion {

    @Id
    @GeneratedValue
    private long id;

    private Integer emotionNum;
    @Column(nullable = false)
    private String pixels;


    @Builder
    public Emotion(Long id, Integer emotionNum,String pixels){
        this.id =id;
        this.emotionNum=emotionNum;
        this.pixels=pixels;
    }

}
