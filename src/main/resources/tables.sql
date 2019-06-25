CREATE TABLE `huobi`
(
    `id`        INT NOT NULL AUTO_INCREMENT,
    `platform`  TEXT,
    `coinName`  TEXT,
    `json`      MEDIUMTEXT,
    `type`      TEXT,
    `sessionId` TEXT,
    `url`       TEXT,
    `provider`  TEXT,
    `timestamp` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);

CREATE TABLE `exchange_rate`
(
    `id`        INT NOT NULL AUTO_INCREMENT,
    `json`      MEDIUMTEXT,
    `platform`  TEXT,
    `sessionId` TEXT,
    `url`       TEXT,
    `provider`  TEXT,
    `timestamp` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);