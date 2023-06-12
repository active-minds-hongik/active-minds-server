package PIUDA.ActiveMinds.infra.openFeign;

import PIUDA.ActiveMinds.global.config.FormConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(
        name = "ReadingFace",
        url = "https://www.activeminds.co.kr",
        configuration = FormConfig.class)
public interface ReadingFaceOpenFeign {

    @PostMapping(value = "/ai/example", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String postReadingFace(@RequestPart(value = "image") MultipartFile multipartFile);
}
