# Приложение для добавления песен и альбомов

#### Коллекция PostMan для проверки endpoints лежит в корне проекта.

Технологии которые использовались:
 * Spring Boot
 * MySQL
 * Spring Data JPA

Пример запросов для проверки API:

### Albums:

* http://localhost:8090/albums/create

```javascript
   {
  "nameAlbum": "Album Name",
  "artistName": "Artist Name",
  "year": 2023,
  "genre": "Genre Name",
  "tracks": [
    {

      "name": "Fly",
      "artist": "Artist Name",
      "trackNumber": 1,
      "duration": 180
    },
    {
      
      "name": "Track Name",
      "artist": "Artist Name",
      "trackNumber": 2,
      "duration": 200
    }
  ]
}
```
* http://localhost:8090/albums/update

```javascript
 {
    "id": 1,
    "nameAlbum": "Album 52745",
    "artistName": " Name",
    "year": 2023,
    "genre": "Genre update"
}
```
Получение альбома по id: 

* http://localhost:8090/albums/{id}

Удаление альбома по id:

* http://localhost:8090/albums/delete/{id}

Получение всех альбомов:

* http://localhost:8090/albums/all

### Tracks:

Создание трека:

* http://localhost:8090/tracks/create

```javascript
{
    "name": "Track Name",
    "artist": "Artist Name",
    "trackNumber": 1,
    "duration": 180,
    "album": {
        "id": 3
    }
}
```
Все треки:

* http://localhost:8090/tracks/all

Обновление трека:

* http://localhost:8090/tracks/update

```javascript
{
  "id":11,
  "name": "New",
  "artist": "Julia",
  "trackNumber": 13,
  "duration": 180,
  "album": {
    "id": 3
  }
}
```
Получение трека по id:

* http://localhost:8090/tracks/{id}

Удаление трека по id:

* http://localhost:8090/tracks/delete/{id}

