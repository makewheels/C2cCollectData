CREATE TABLE `huobi` (
     `id` INT NOT NULL AUTO_INCREMENT,
     `platform` TEXT,
     `coinName` TEXT,
     `json` MEDIUMTEXT,
     `type` TEXT,
     `sessionId` TEXT,
     `url` TEXT,
     `provider` TEXT,
     `timestamp` TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY (`id`)
);