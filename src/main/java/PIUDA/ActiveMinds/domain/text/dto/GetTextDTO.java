package PIUDA.ActiveMinds.domain.text.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GetTextDTO {
    @Schema(description = "텍스트 id", example="9976970",required=true)
    private String id;


    @Schema(description="텍스트",example="\"원작의 긴장감을 제대로 살려내지못했다.\"\t\n",required=true)
    private String document;

    @Schema(description = "정답", example="negative",required = true)
    private String label;


    @Builder
    public GetTextDTO(String id, String document, String label){
        this.id = id;
        this.document= document;
        this.label =label;
    }
}
