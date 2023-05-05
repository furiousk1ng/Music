
create schema music_schema;
use music_schema;
CREATE TABLE albums (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  artist_name varchar(255) NOT NULL,
  year int DEFAULT NULL,
  genre varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE tracks (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  artist varchar(255) NOT NULL,
  track_number int NOT NULL,
  duration int DEFAULT NULL,
  album_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_track_album_id (album_id),
  CONSTRAINT fk_track_album_id FOREIGN KEY (album_id) REFERENCES albums (id)
);
