package PIUDA.ActiveMinds.domain.text.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Texts")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String document;

    @NotNull
    private String label;

    @Builder
    public Text(String id, String document,String label){
        this.id =id;
        this.document=document;
        this.label=label;
    }
}
