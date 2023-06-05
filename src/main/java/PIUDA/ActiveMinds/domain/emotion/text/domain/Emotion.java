package PIUDA.ActiveMinds.domain.emotion.text.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Emotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private Integer emotionNum;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String pixels;

    @Builder
    public Emotion(Long id, Integer emotionNum,String pixels){
        this.id =id;
        this.emotionNum=emotionNum;
        this.pixels=pixels;
    }

}
