package PIUDA.ActiveMinds.domain.text;

import PIUDA.ActiveMinds.domain.text.domain.Text;
import PIUDA.ActiveMinds.domain.text.dto.TextDTO;
import PIUDA.ActiveMinds.domain.text.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/text")
public class TextController {
    private final TextRepository textRepository;

    @Autowired
    public TextController(TextRepository textRepository){
        this.textRepository =textRepository;
    }

    @GetMapping
    public List<TextDTO> getRandomTexts(){
        List<Text> randomTexts = textRepository.getRandomTexts();
        List<TextDTO> textDTOS = new ArrayList<>();

        for (Text text: randomTexts){
            TextDTO textDTO = new TextDTO();
            textDTO.setId(text.getId());
            textDTO.setDocument(text.getDocument());
            textDTO.setLabel(text.getLabel());
            textDTOS.add(textDTO);
        }

        return textDTOS;
    }
}
