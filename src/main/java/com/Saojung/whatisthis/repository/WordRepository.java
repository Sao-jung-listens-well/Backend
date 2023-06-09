package com.Saojung.whatisthis.repository;

import com.Saojung.whatisthis.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findAllByMember_Idx(Long idx);

    List<Word> findAllByMember_IdxAndLevelGreaterThanEqual(Long idx, Integer level);

    List<Word> findAllByMember_IdxAndLevelAndSuccessLevel(Long idx, Integer level, Integer sLevel);

    List<Word> findAllByMember_IdxOrderByDate(Long idx);

    List<Word> findAllByMember_IdxAndDateGreaterThanEqual(Long idx, LocalDateTime date);

    List<Word> findAllByMember_IdxAndLevelGreaterThanEqualAndDateGreaterThanEqual(Long idx, Integer level, LocalDateTime date);

    List<Word> findAllByMember_IdxAndLevelAndSuccessLevelAndDateGreaterThanEqual(Long idx, Integer level, Integer sLevel, LocalDateTime time);

    List<Word> findAllByMember_IdxAndDateBetween(Long idx, LocalDateTime date1, LocalDateTime date2);

    List<Word> findAllByMember_IdxAndLevelGreaterThanEqualAndDateBetween(Long idx, Integer level, LocalDateTime date1, LocalDateTime date2);

    List<Word> findAllByMember_IdxAndLevelAndSuccessLevelAndDateBetween(Long idx, Integer level, Integer sLevel, LocalDateTime date1, LocalDateTime date2);

    @Modifying(clearAutomatically = true)
    @Query("update Word w set w.word = :word, w.level = :level, w.successLevel = :successLevel where w.idx = :idx")
    void update(@Param("word") String word, @Param("level") Integer level, @Param("successLevel") Integer successLevel, @Param("idx") Long idx);
}
