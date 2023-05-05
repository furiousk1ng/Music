package com.filinov.music.controllers;

import com.filinov.music.models.Album;
import com.filinov.music.models.Track;
import com.filinov.music.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    private final TrackService trackService;
    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }


    @GetMapping("/{id}")
    public Track getTrack(@PathVariable Long id){
        return trackService.getTrackById(id);
    }
    @GetMapping("/all")
    public List<Track> getAllAlbums(){
        return trackService.getAll();
    }
    @PostMapping("/create")
    public void createAlbum(@RequestBody Track track){
        trackService.createTrack(track);
    }
    @PostMapping("/update")
    public Track updateAlbum(@RequestBody Track track){
        return trackService.updateTrack(track);
    }
    @PostMapping("/delete/{id}")
    public void deleteAlbum(@PathVariable Long id){
        trackService.deleteTrack(id);
    }
}
