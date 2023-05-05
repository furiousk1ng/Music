package com.filinov.music.controllers;

import com.filinov.music.models.Album;
import com.filinov.music.repositories.AlbumRepository;
import com.filinov.music.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController( AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable Long id){
        return albumService.getAlbumById(id);
    }
    @GetMapping("/all")
    public List<Album> getAllAlbums(){
        return albumService.getAll();
    }
    @PostMapping("/create")
    public void createAlbum(@RequestBody Album album){
        albumService.createAlbum(album);
    }
    @PostMapping("/update")
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }
    @PostMapping("/delete/{id}")
    public void deleteAlbum(@PathVariable Long id){
        albumService.deleteAlbum(id);
    }

}
