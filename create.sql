create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255) not null, gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
alter table food_image add constraint FK7qrd2yh79y64qhbecc2ymh2sq foreign key (user_id) references user (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDBcreate table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), first_name varchar(255), gender varchar(255), height integer not null, last_name varchar(255), password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
create table activity (id bigint not null auto_increment, activity_name varchar(255), calories_burnt double precision not null, primary key (id)) engine=InnoDB
create table daily_history (id bigint not null auto_increment, date date, user_id bigint, primary key (id)) engine=InnoDB
create table diet_plan (id bigint not null auto_increment, date datetime(6), activity_id bigint, user_id bigint, primary key (id)) engine=InnoDB
create table food (id bigint not null auto_increment, calorie double precision not null, name varchar(255), diet_plan_id bigint, primary key (id)) engine=InnoDB
create table food_image (id bigint not null auto_increment, epoch_time bigint, calorie double precision not null, food_name varchar(255), url varchar(255), daily_history_id bigint, food_id bigint, primary key (id)) engine=InnoDB
create table user (id bigint not null auto_increment, birth_year integer not null, email varchar(255), gender varchar(255), height integer not null, password varchar(255), recommended_calories double precision not null, weight integer not null, primary key (id)) engine=InnoDB
alter table daily_history add constraint FK45t03wfy6m4vy653qsh1xs714 foreign key (user_id) references user (id)
alter table diet_plan add constraint FKbn1o9buyhr1m2rsmw5ebehxpr foreign key (activity_id) references activity (id)
alter table diet_plan add constraint FKtchmmud9da85af0yr2wjpilga foreign key (user_id) references user (id)
alter table food add constraint FKevg0xdbb1jajty0hyic2stsa3 foreign key (diet_plan_id) references diet_plan (id)
alter table food_image add constraint FKa4754kpkfpatsgac0cn17iioj foreign key (daily_history_id) references daily_history (id)
alter table food_image add constraint FKd6bod7e21v3f6y64kii9s5th1 foreign key (food_id) references food (id)
