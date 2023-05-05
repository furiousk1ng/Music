# Приложение для добавления песен и альбомов

#### Коллекция PostMan для проверки endpoints лежит в корне проекта.

Технологии которые использовались:
 * Spring Boot
 * MySQL
 * Spring Data JPA

Пример запросов для проверки API:

* http://localhost:8090/albums/create

```javascript
   {
  "nameAlbum": "Album Name",
  "artistName": "Artist Name",
  "year": 2023,
  "genre": "Genre Name",
  "tracks": [
    {

      "name": "Track Nameкпук",
      "artist": "Artist Name",
      "trackNumber": 1,
      "duration": 180
    },
    {
      
      "name": "Track Name укпуу",
      "artist": "Artist Name",
      "trackNumber": 2,
      "duration": 200
    }
  ]
}

```
