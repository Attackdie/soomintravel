package soomin.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soomin.travel.domain.TravelBoard;

@Repository
public interface TravelBoardRepository extends JpaRepository<TravelBoard, Long> {
}
