CREATE TABLE `twitter`.`member` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `email` VARCHAR(45) NOT NULL,
                                    `password` VARCHAR(45) NOT NULL,
                                    `blocked` BIT NOT NULL DEFAULT 0,
                                    `circle_id` INT NULL,
                                    PRIMARY KEY (`id`));

CREATE TABLE `twitter`.`circle` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `name` VARCHAR(45) NOT NULL,
                                    PRIMARY KEY (`id`));

CREATE TABLE `twitter`.`post` (
                                  `id` INT NOT NULL AUTO_INCREMENT,
                                  `contents` VARCHAR(140) NULL,
                                  `member_id` INT NOT NULL,
                                  `circle_only` BIT NOT NULL DEFAULT 0,
                                  `circle_id` INT NULL,
                                  PRIMARY KEY (`id`));

CREATE TABLE `twitter`.`comment` (
                                     `id` INT NOT NULL AUTO_INCREMENT,
                                     `member_id` INT NOT NULL,
                                     `post_id` INT NOT NULL,
                                     `comment` VARCHAR(140) NULL,
                                     PRIMARY KEY (`id`));

CREATE TABLE `twitter`.`like` (
                                  `id` INT NOT NULL AUTO_INCREMENT,
                                  `post_id` INT NOT NULL,
                                  `member_id` INT NOT NULL,
                                  PRIMARY KEY (`id`));

ALTER TABLE `twitter`.`member`
    ADD INDEX `circle_id_idx` (`circle_id` ASC) VISIBLE;
;
ALTER TABLE `twitter`.`member`
    ADD CONSTRAINT `circle_id`
        FOREIGN KEY (`circle_id`)
            REFERENCES `twitter`.`circle` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION;

ALTER TABLE `twitter`.`post`
    ADD INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
ADD INDEX `circle_id_idx` (`circle_id` ASC) VISIBLE;
;
ALTER TABLE `twitter`.`post`
    ADD CONSTRAINT `member_id`
        FOREIGN KEY (`member_id`)
            REFERENCES `twitter`.`member` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
ADD CONSTRAINT `circle_id`
  FOREIGN KEY (`circle_id`)
  REFERENCES `twitter`.`circle` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `twitter`.`comment`
    ADD INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
ADD INDEX `post_id_idx` (`post_id` ASC) VISIBLE;
;
ALTER TABLE `twitter`.`comment`
    ADD CONSTRAINT `member_id`
        FOREIGN KEY (`member_id`)
            REFERENCES `twitter`.`member` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
ADD CONSTRAINT `post_id`
  FOREIGN KEY (`post_id`)
  REFERENCES `twitter`.`post` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `twitter`.`like`
    ADD INDEX `member_id_idx` (`member_id` ASC) VISIBLE,
ADD INDEX `post_id_idx` (`post_id` ASC) VISIBLE;
;
ALTER TABLE `twitter`.`like`
    ADD CONSTRAINT `member_id`
        FOREIGN KEY (`member_id`)
            REFERENCES `twitter`.`member` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
ADD CONSTRAINT `post_id`
  FOREIGN KEY (`post_id`)
  REFERENCES `twitter`.`post` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;