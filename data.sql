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
INSERT INTO USER VALUES (1, 1980, "SUPERMAN@GMAIL.COM", "MALE", 180, "PASSWORD", 2200, 70);
INSERT INTO USER VALUES (2, 1985, "SUPERWOMAN@GMAIL.COM", "FEMALE", 170, "PASSWORD", 1700, 60);
INSERT INTO USER VALUES (3, 1992, "ZAC@GMAIL.COM", "MALE", 175, "PASSWORD", 1200, 65);

#diet_plan
#id, date ,activity_id, user_id
INSERT INTO diet_plan VALUES (1, '2021-01-29', 1, 3);


#food
#id, calories, foodName, activity_id
INSERT INTO food VALUES (1, 313, "laksa", 1);
INSERT INTO food VALUES (2, 607, "chicken rice", 1);
INSERT INTO food VALUES (3, 250, "cheeseburger", 1);
INSERT INTO food VALUES (4, 230, "fish and chips", 1);
INSERT INTO food VALUES (5, 200, "pizza", 1);

#dailyhistory
#id,date,user_id
INSERT INTO daily_history VALUES (1,'2021-01-22', 1);
INSERT INTO daily_history VALUES (2,'2021-01-23', 1);
INSERT INTO daily_history VALUES (3,'2021-01-24', 1);
INSERT INTO daily_history VALUES (4,'2021-01-25', 1);
INSERT INTO daily_history VALUES (5,'2021-01-26', 1);
INSERT INTO daily_history VALUES (6,'2021-01-27', 1);
INSERT INTO daily_history VALUES (7,'2021-01-28', 1);


INSERT INTO food_image VALUES (1,"https://images.deliveryhero.io/image/fd-sg/Products/5570212.jpg?width=302",1,5,1);
INSERT INTO food_image VALUES (2,"https://images.deliveryhero.io/image/fd-sg/Products/5543700.jpg?width=302",1,4,1);
INSERT INTO food_image VALUES (3,"https://images.deliveryhero.io/image/fd-sg/Products/5514321.jpg?width=302",1,1,1);
INSERT INTO food_image VALUES (4,"https://images.deliveryhero.io/image/fd-sg/Products/5514324.jpg?width=302",2,3,1);


INSERT INTO food_image VALUES (5,"https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",2,1,1);
INSERT INTO food_image VALUES (6,"https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",2,3,1);
INSERT INTO food_image VALUES (7,"https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",3,1,1);
INSERT INTO food_image VALUES (8,"https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",3,3,1);

INSERT INTO food_image VALUES (9,"https://images.deliveryhero.io/image/fd-sg/Products/5570212.jpg?width=302",4,5,1);
INSERT INTO food_image VALUES (10,"https://images.deliveryhero.io/image/fd-sg/Products/5543700.jpg?width=302",4,4,1);
INSERT INTO food_image VALUES (11,"https://images.deliveryhero.io/image/fd-sg/Products/5514321.jpg?width=302",4,1,1);
INSERT INTO food_image VALUES (12,"https://images.deliveryhero.io/image/fd-sg/Products/5514324.jpg?width=302",5,3,1);
INSERT INTO food_image VALUES (13,"https://images.deliveryhero.io/image/fd-sg/Products/5530498.jpg?width=302",5,4,1);
INSERT INTO food_image VALUES (14,"https://images.deliveryhero.io/image/fd-sg/Products/5514328.jpg?width=302",5,5,1);
INSERT INTO food_image VALUES (15,"https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",3,1,1);
INSERT INTO food_image VALUES (16,"https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",6,3,1);
INSERT INTO food_image VALUES (21,"https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",6,3,1);
INSERT INTO food_image VALUES (17,"https://images.deliveryhero.io/image/fd-sg/Products/5530498.jpg?width=302",6,4,1);
INSERT INTO food_image VALUES (18,"https://images.deliveryhero.io/image/fd-sg/Products/5514328.jpg?width=302",7,5,1);
INSERT INTO food_image VALUES (19,"https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",7,1,1);
INSERT INTO food_image VALUES (20,"https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",7,3,1);