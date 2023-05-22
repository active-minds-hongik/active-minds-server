package PIUDA.ActiveMinds.domain.text.repository;


import PIUDA.ActiveMinds.domain.text.domain.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TextRepository extends JpaRepository<Text, Long> {

    @Query(value = "SELECT * FROM text_entity ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<Text> getRandomTexts();


}
