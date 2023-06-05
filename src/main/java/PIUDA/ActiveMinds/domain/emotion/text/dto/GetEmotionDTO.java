package PIUDA.ActiveMinds.domain.emotion.text.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GetEmotionDTO {

    @Schema(description="엔티티고유번호",example="7",required=true)
    private Long id;

    @Schema(description = "Emotion번호",example = "0",required=true)
    private Integer emotionNum;

    @Schema(description = "pixel값", example = "70 80 82 72 60...",required=true)
    private String pixels;



    @Builder
    public GetEmotionDTO(Long id, Integer emotionNum, String pixels){
        this.id =id;
        this.emotionNum =emotionNum;
        this.pixels = pixels;

    }
}
