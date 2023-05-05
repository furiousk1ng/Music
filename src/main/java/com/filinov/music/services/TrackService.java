package com.filinov.music.services;

import com.filinov.music.models.Album;
import com.filinov.music.models.Track;
import com.filinov.music.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService {


    private final TrackRepository trackRepository;

    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }


    public Track getTrackById(Long id) {
        return trackRepository.findById(id).orElseThrow();
    }

    public List<Track> getAll() {
        return trackRepository.findAll();
    }

    public void createTrack(Track track) {
        trackRepository.save(track);
    }

    public Track updateTrack(Track track){
        Optional<Track> optionalTrack = trackRepository.findById(track.getId());
        if (optionalTrack.isPresent()) {
            Track existingTask = optionalTrack.get();
            existingTask.setName(track.getName());
            existingTask.setTrackNumber(track.getTrackNumber());
            existingTask.setAlbum(track.getAlbum());
            existingTask.setArtist(track.getArtist());
            existingTask.setDuration(track.getDuration());
            return trackRepository.save(existingTask);
        }
        else {
            throw new RuntimeException("Album not found with id: " + track.getId());
        }

    }

    public void deleteTrack(Long id) {
        trackRepository.deleteById(id);
    }
}
