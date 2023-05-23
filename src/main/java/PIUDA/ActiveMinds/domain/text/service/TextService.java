package PIUDA.ActiveMinds.domain.text.service;

import PIUDA.ActiveMinds.domain.text.domain.Text;
import PIUDA.ActiveMinds.domain.text.dto.GetTextDTO;
import PIUDA.ActiveMinds.domain.text.repository.TextRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TextService {
    private final TextRepository textRepository;

    public List<GetTextDTO> getText(){
        List<Text> randomTexts = textRepository.getRandomTexts();
        List<GetTextDTO> getTextDTOS = new ArrayList<>();

        for (Text text: randomTexts){
            GetTextDTO getTextDTO = new GetTextDTO();
            getTextDTO.setId(text.getId());
            getTextDTO.setDocument(text.getDocument());
            getTextDTO.setLabel(text.getLabel());
            getTextDTOS.add(getTextDTO);
        }

        return getTextDTOS;
    }
}
