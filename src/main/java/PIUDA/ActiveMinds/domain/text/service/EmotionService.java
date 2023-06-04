package PIUDA.ActiveMinds.domain.text.service;


import PIUDA.ActiveMinds.domain.text.domain.Emotion;
import PIUDA.ActiveMinds.domain.text.domain.Text;
import PIUDA.ActiveMinds.domain.text.dto.GetEmotionDTO;
import PIUDA.ActiveMinds.domain.text.dto.GetTextDTO;
import PIUDA.ActiveMinds.domain.text.repository.EmotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmotionService {

    EmotionRepository emotionRepository;
    public List<GetEmotionDTO> getEmotions() {
        List<Emotion> randomEmotions = emotionRepository.getRandomEmotions();
        List<GetEmotionDTO> getEmotionDTOS = new ArrayList<>();

        for (Emotion emotion : randomEmotions) {
            GetEmotionDTO getEmotionDTO = GetEmotionDTO.builder()
                    .id(emotion.getId())
                    .emotionNum(emotion.getEmotionNum())
                    .pixels(emotion.getPixels())
                    .build();
            getEmotionDTOS.add(getEmotionDTO);
        }

        return getEmotionDTOS;
    }
}
