package com.filinov.music.repositories;

import com.filinov.music.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TrackRepository extends JpaRepository<Track, Long> {
}
