package com.filinov.music.services;

import com.filinov.music.models.Album;
import com.filinov.music.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Album getAlbumById(Long id) {
        return albumRepository.findById(id).orElseThrow();
    }

    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    public void createAlbum(Album album) {
        albumRepository.save(album);
    }

    public Album updateAlbum(Album album) {
        Album existingAlbum = albumRepository.findById(album.getId()).orElseThrow(() -> new RuntimeException("Album not found"));
        existingAlbum.setNameAlbum(album.getNameAlbum());
        existingAlbum.setYear(album.getYear());
        existingAlbum.setGenre(album.getGenre());
        existingAlbum.setArtistName(album.getArtistName());
        return albumRepository.save(existingAlbum);
    }

    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }
}
