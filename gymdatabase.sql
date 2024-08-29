create  database gymservices;
use gymservices;

drop table if exists role;
drop table if exists gym_details;
drop table if exists users;
drop table if exists plan;
drop table if exists user_subscription;


CREATE TABLE role(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(45) UNIQUE NOT NULL,
  description VARCHAR(45),
  active INT default 0);

CREATE TABLE gym_details(
   id INT primary key AUTO_INCREMENT,
   name varchar(255) unique,
  description VARCHAR(45),
   address varchar(255),
    active INT default 0);
    
    
  CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  fullname varchar(225),
  username VARCHAR(45) NOT NULL unique,
  password VARCHAR(45) NOT NULL,
  age int,
  gender varchar(50),
  phone VARCHAR(45),
  address varchar(100),
  email_verification_code varchar(100),
  verified INT default 0, 
  active INT default 0, 
   email varchar(255),
   role_id INT,
   gym_id INT,
   FOREIGN KEY(role_id) REFERENCES role(id),
   FOREIGN KEY(gym_id) REFERENCES gym_details(id));

CREATE TABLE plan (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(255),
  description VARCHAR(45),
  price decimal,
  active INT default 0,
  type int,
  gym_id int,
  duration int,
  isTrainer boolean,
  days int,
  FOREIGN KEY(gym_id) REFERENCES gym_details(gym_id)); 
  
  
  CREATE TABLE user_subscription(
   id INT primary key AUTO_INCREMENT,
  customer_id int,
  plan_id int,
  trainer_id int,
  start_date Date,
  End_date Date,
   active INT default 0,
   FOREIGN KEY(plan_id) REFERENCES plan(id),
 FOREIGN KEY (trainer_id) REFERENCES role(id),
  FOREIGN KEY (customer_id) REFERENCES users(id));