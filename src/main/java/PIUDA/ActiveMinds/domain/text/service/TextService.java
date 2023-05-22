package PIUDA.ActiveMinds.domain.text.service;

import PIUDA.ActiveMinds.domain.text.domain.Text;
import PIUDA.ActiveMinds.domain.text.repository.TextRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TextService {
    private final TextRepository textRepository;

    public List<Text> getText(){
        return textRepository.getRandomTexts();
    }
}
