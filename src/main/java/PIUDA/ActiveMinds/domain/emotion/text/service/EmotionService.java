package PIUDA.ActiveMinds.domain.emotion.text.service;


import PIUDA.ActiveMinds.domain.emotion.text.domain.Emotion;
import PIUDA.ActiveMinds.domain.emotion.text.dto.GetEmotionDTO;
import PIUDA.ActiveMinds.domain.emotion.text.dto.PostReadingEmotion;
import PIUDA.ActiveMinds.domain.emotion.text.repository.EmotionRepository;
import PIUDA.ActiveMinds.infra.openFeign.ReadingFaceOpenFeign;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.mock.web.MockMultipartFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmotionService {
    private final EmotionRepository emotionRepository;
    private final ReadingFaceOpenFeign readingFaceOpenFeign;

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

    public PostReadingEmotion postReadingEmotion(MultipartFile multipartFile) {
        String rtn = "";
//        log.info(multipartFile);
        try {
//            Base64.Encoder encoder = Base64.getEncoder();
//            byte[] photoEncode = encoder.encode(multipartFile.getBytes());

//            log.info(multipartFile.getContentType());
//            Multipart
//            String binaryString = "data:" + multipartFile.getContentType() + ";base64," + new String(multipartFile.getBytes(), "UTF-8");
//            String binaryString = "data:" + multipartFile.getContentType() + ";base64," + new String(photoEncode, "UTF-8");
//            log.info(binaryString);
//
//            log.info(multipartFile.getName());
//            log.info(multipartFile.getOriginalFilename());

//            String content = new String(Files.readAllBytes(Paths.get("asd.txt")));
//            MultipartFile convertedMultipartFile = new MockMultipartFile(multipartFile.getName(),
//                    multipartFile.getOriginalFilename(),
//                    multipartFile.getContentType(),
//                    binaryString.getBytes()
//                    );
//            rtn = readingFaceOpenFeign.postReadingFace(convertedMultipartFile);
            rtn = readingFaceOpenFeign.postReadingFace(multipartFile);
        } catch (Exception e) {
            log.error("error", e);
        }
        log.info("----");
        log.info(rtn);
        log.info("----");
        return PostReadingEmotion.from("asdf");
    }
}
