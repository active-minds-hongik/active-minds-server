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
    private Long id;

    @Column(nullable = false)
    private String document;

    @Column(nullable = false)
    private String label;



    @Builder
    public Text(Long id, String document,String label){
        this.id =id;
        this.document=document;
        this.label=label;
    }
}
