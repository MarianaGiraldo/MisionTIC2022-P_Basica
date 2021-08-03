CREATE TABLE `storiesdb`.`tb_stories` ( 
	`id` INT NOT NULL AUTO_INCREMENT , 
	`user_id` INT NOT NULL , 
	`title` VARCHAR(100) NOT NULL , 
	`short_description` VARCHAR(255) NOT NULL , 
	`story` TEXT NOT NULL , 
	`genre` SET('Action','Romance','Science Fiction','Literary fiction','Mistery','Thriller','Horror','Historical','Fantasy','Dystopian','Magical Realism','Realist Literature') NOT NULL , 
	`timestamp` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , 
	PRIMARY KEY (`id`),
	FOREIGN KEY (user_id) REFERENCES tb_users(id)
) ENGINE = InnoDB;



CREATE TABLE `storiesdb`.`tb_users` ( 
	`id` INT NOT NULL AUTO_INCREMENT , 
	`document` VARCHAR(11) NOT NULL , 
	`name` VARCHAR(50) NOT NULL , 
	`lastname` VARCHAR(50) NOT NULL , 
	PRIMARY KEY (`id`)
) ENGINE = InnoDB;