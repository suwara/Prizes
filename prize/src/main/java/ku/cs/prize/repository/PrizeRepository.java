package ku.cs.prize.repository;

import ku.cs.prize.entity.Prize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrizeRepository extends JpaRepository<Prize, UUID> {
    Prize findBySources(String source);
}
