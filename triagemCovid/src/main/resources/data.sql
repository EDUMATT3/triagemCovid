DROP TABLE IF EXISTS questionary;

CREATE TABLE questionary (
    id INT IDENTITY(1) PRIMARY KEY,
    registry INT NOT NULL ,
    contact BOOLEAN NOT NULL,
    fever BOOLEAN NOT NULL,
    chills BOOLEAN NOT NULL,
    shortness_breathe BOOLEAN NOT NULL,
    cough BOOLEAN NOT NULL,
    sore_throat BOOLEAN NOT NULL,
    headache BOOLEAN NOT NULL,
    body_ache BOOLEAN NOT NULL,
    loss_physical_senses BOOLEAN NOT NULL,
    diarrhea BOOLEAN NOT NULL
);

INSERT INTO questionary (registry, contact, fever, chills, shortness_breathe, cough, sore_throat,headache, body_ache, loss_physical_senses, diarrhea) VALUES
  (00001 ,true, true, true, true, true, true, true, true, true, true),
  (00002, false, false, false, false, false, false, false, false, false, false),
  (00003, true, false, true, false, true, false, true, false, true, false);