package PIUDA.ActiveMinds.domain.text;

import PIUDA.ActiveMinds.domain.text.domain.Text;
import PIUDA.ActiveMinds.domain.text.dto.GetTextDTO;
import PIUDA.ActiveMinds.domain.text.repository.TextRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/text")
@Tag(name="Text")
public class TextController {
    private final TextRepository textRepository;


    @Autowired
    public TextController(TextRepository textRepository){
        this.textRepository =textRepository;
    }

    @GetMapping
    public List<GetTextDTO> getRandomTexts(){
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
