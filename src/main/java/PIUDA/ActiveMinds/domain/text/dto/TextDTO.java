package PIUDA.ActiveMinds.domain.text.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class TextDTO {
    private Long id;
    private String document;
    private String label;

    public TextDTO(Long id, String document, String label){
        this.id = id;
        this.document= document;
        this.label =label;
    }
}
