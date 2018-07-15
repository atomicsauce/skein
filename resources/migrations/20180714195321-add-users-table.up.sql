CREATE TABLE nodes (
    id          INTEGER PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(256) UNIQUE,
    content     CLOB,
    ctime       TIMESTAMP,
    mtime       TIMESTAMP
);
