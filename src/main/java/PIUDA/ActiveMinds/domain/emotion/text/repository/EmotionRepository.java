package PIUDA.ActiveMinds.domain.emotion.text.repository;


import PIUDA.ActiveMinds.domain.emotion.text.domain.Emotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmotionRepository extends JpaRepository<Emotion, Long> {

    @Query(value = "SELECT E FROM Emotion E ORDER BY RAND() LIMIT 10")
    List<Emotion> getRandomEmotions();
}


