package PIUDA.ActiveMinds.domain.text.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
