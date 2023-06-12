package PIUDA.ActiveMinds.domain.emotion.text;

import PIUDA.ActiveMinds.domain.emotion.text.dto.GetEmotionDTO;
import PIUDA.ActiveMinds.domain.emotion.text.dto.PostReadingEmotion;
import PIUDA.ActiveMinds.domain.emotion.text.service.EmotionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emotion")
@Tag(name="Emotion")
public class EmotionController {
    private final EmotionService emotionService;

    @GetMapping
    public List<GetEmotionDTO> getEmotionDTOS(){return emotionService.getEmotions();}

    @PostMapping
    public PostReadingEmotion postReadingEmotion(@RequestParam(value = "image") MultipartFile multipartFile){
        return emotionService.postReadingEmotion(multipartFile);
    }
}
