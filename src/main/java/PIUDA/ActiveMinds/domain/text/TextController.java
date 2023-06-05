package PIUDA.ActiveMinds.domain.text;

import PIUDA.ActiveMinds.domain.text.dto.GetTextDTO;
import PIUDA.ActiveMinds.domain.text.service.TextService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/text")
@Tag(name="Text")
public class TextController {
    private final TextService textService;

    @GetMapping
    public List<GetTextDTO> getRandomTexts(){
        return textService.getText();
    }
}
