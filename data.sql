#activity
#id, activity_level, activity_name, calories_burnt (per hour)
INSERT INTO activity VALUES (1, "Office work", 140);
INSERT INTO activity VALUES (2, "Walking", 180);
INSERT INTO activity VALUES (3, "Yoga", 280);
INSERT INTO activity VALUES (4, "Fast walking", 280);
INSERT INTO activity VALUES (5, "Cycling", 480);
INSERT INTO activity VALUES (6, "Swimming", 620);
INSERT INTO activity VALUES (7, "Jogging", 700);
INSERT INTO activity VALUES (8, "Running", 900);

#user
#id,activity_level,birthyear,email,gender,height,password,recommendedcalories,weight)
INSERT INTO USER VALUES (1, 2, 1980, "SUPERMAN@GMAIL.COM", "MALE", 180, "PASSWORD", 2200, 70);
INSERT INTO USER VALUES (2, 1, 1985, "SUPERWOMAN@GMAIL.COM", "FEMALE", 170, "PASSWORD", 1700, 60);
INSERT INTO USER VALUES (3, 0, 1992, "ZAC@GMAIL.COM", "MALE", 175, "PASSWORD", 1200, 65);

#diet_plan
#id, date ,activity_id, user_id
INSERT INTO diet_plan VALUES (1, '2021-01-29', 1, 3);

#food
#id, calories, foodName, activity_id
INSERT INTO food VALUES (1, 313, "laska", 1);
INSERT INTO food VALUES (2, 607, "chicken rice", 1);
INSERT INTO food VALUES (3, 250, "cheeseburger", 1);
INSERT INTO food VALUES (4, 230, "fish and chips", 1);
INSERT INTO food VALUES (5, 200, "pizza", 1);

#dailyhistory
#id,date,user_id
INSERT INTO daily_history VALUES (1,'2021-01-29', 1);







