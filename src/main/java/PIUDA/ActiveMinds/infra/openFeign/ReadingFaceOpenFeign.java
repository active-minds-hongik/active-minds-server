package PIUDA.ActiveMinds.infra.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        name = "ReadingFace",
        url = "baseurl")
public interface ReadingFaceOpenFeign {

    @PostMapping(
            "/url")
    void call(
            @PathVariable("CODE") String code);
}
