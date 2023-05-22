package PIUDA.ActiveMinds.domain.text.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Text")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String document;

    @Column(nullable = false)
    private Boolean label;



    @Builder
    public Text(String id, String document,Boolean label){
        this.id =id;
        this.document=document;
        this.label=label;
    }
}
