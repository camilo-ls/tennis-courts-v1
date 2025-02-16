package com.tenniscourts.tenniscourts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TennisCourtRepository extends JpaRepository<TennisCourt, Long> {
    TennisCourt findFirstById(Long id);

    TennisCourtDTO findTennisCourtById(Long tennisCourtId);
}
