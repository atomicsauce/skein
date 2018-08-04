CREATE TABLE Nodes (
    id          INTEGER PRIMARY KEY AUTO_INCREMENT,
    n_name      VARCHAR(256) UNIQUE,
    content     CLOB,
    ctime       TIMESTAMP,
    mtime       TIMESTAMP
);
