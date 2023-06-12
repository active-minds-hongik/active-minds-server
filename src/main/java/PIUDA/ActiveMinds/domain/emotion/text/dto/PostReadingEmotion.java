package PIUDA.ActiveMinds.domain.emotion.text.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostReadingEmotion {
    @Schema(description="평가된 감정",example="행복")
    private String emotion;

    @Builder
    private PostReadingEmotion(String emotion) {
        this.emotion = emotion;
    }

    public static PostReadingEmotion from(String emotion) {
        return PostReadingEmotion.builder()
                .emotion(emotion)
                .build();
    }
}
