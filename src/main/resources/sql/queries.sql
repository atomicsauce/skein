-- :name create-node! :! :n
-- :doc creates a new node
INSERT INTO Nodes
    ( n_name, content, ctime, mtime )
VALUES
    ( :n_name, :content, :ctime, :mtime )
;

-- :name retrieve-node! :! :n
-- :doc retrieves an existing node
SELECT * FROM Nodes WHERE id = :id
;

-- :name update-node! :! :n
-- :doc updates an existing node
UPDATE Nodes
SET
    n_name = :n_name,
    content = :content,
    ctime = :ctime,
    mtime = :mtime
WHERE
    id = :id
;

-- :name delete-node! :! :n
-- :doc deletes an existing node
DELETE FROM Nodes WHERE id = :id
;
