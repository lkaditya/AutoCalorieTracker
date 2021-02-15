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
#id, activity_level, birthyear, email, gender, height, password, recommendedcalories, reminder_calories, weight)
INSERT INTO USER VALUES (1, "SEDENTARY", 1980, "SUPERMAN@GMAIL.COM", "MALE", 180, "PASSWORD", 2200, 0, 70);
INSERT INTO USER VALUES (2, "MODERATE", 1985, "SUPERWOMAN@GMAIL.COM", "FEMALE", 170, "PASSWORD", 1700, 0, 60);
INSERT INTO USER VALUES (3, "ACTIVE", 1992, "ZAC@GMAIL.COM", "MALE", 175, "PASSWORD", 1200, 0, 65);

#diet_plan
#id, date ,activity_id, user_id
INSERT INTO diet_plan VALUES (1, '2021-01-29', 1, 3);

#food
#id, calories, foodName, activity_id
INSERT INTO food VALUES (1, 640, "Hamburger");
INSERT INTO food VALUES (2, 620, "Pizza");
INSERT INTO food VALUES (3, 196, "Omelette");
INSERT INTO food VALUES (4, 681, "Fish and chips");
INSERT INTO food VALUES (5, 897, "Chicken curry");

#dailyhistory
#id,date,user_id
INSERT INTO daily_history VALUES (1,'2021-01-22', 1);
INSERT INTO daily_history VALUES (2,'2021-01-23', 1);
INSERT INTO daily_history VALUES (3,'2021-01-24', 1);
INSERT INTO daily_history VALUES (4,'2021-01-25', 1);
INSERT INTO daily_history VALUES (5,'2021-01-26', 1);
INSERT INTO daily_history VALUES (6,'2021-01-27', 1);
INSERT INTO daily_history VALUES (7,'2021-01-28', 1);
INSERT INTO daily_history VALUES (8,'2021-01-29', 1);
INSERT INTO daily_history VALUES (9,'2021-01-30', 1);
INSERT INTO daily_history VALUES (10,'2021-01-31', 1);
INSERT INTO daily_history VALUES (11,'2021-02-01', 1);
INSERT INTO daily_history VALUES (12,'2021-02-02', 1);
INSERT INTO daily_history VALUES (13,'2021-02-03', 1);
INSERT INTO daily_history VALUES (14,'2021-02-04', 1);
INSERT INTO daily_history VALUES (15,'2021-02-05', 1);
INSERT INTO daily_history VALUES (16,'2021-02-06', 1);
INSERT INTO daily_history VALUES (17,'2021-02-07', 1);
INSERT INTO daily_history VALUES (18,'2021-02-08', 1);
INSERT INTO daily_history VALUES (19,'2021-02-09', 1);
INSERT INTO daily_history VALUES (20,'2021-02-10', 1);
INSERT INTO daily_history VALUES (21,'2021-02-11', 1);
INSERT INTO daily_history VALUES (22,'2021-02-12', 1);
INSERT INTO daily_history VALUES (23,'2021-02-13', 1);
INSERT INTO daily_history VALUES (24,'2021-02-14', 1);
INSERT INTO daily_history VALUES (25,'2021-02-15', 1);
INSERT INTO daily_history VALUES (26,'2021-02-16', 1);
INSERT INTO daily_history VALUES (27,'2021-02-17', 1);
INSERT INTO daily_history VALUES (28,'2021-02-18', 1);
INSERT INTO daily_history VALUES (29,'2021-02-19', 1);

#food_image
#id,epoch_date_upload,calorie,food_name,url,dailyhistory_id,food_id
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (1,"Hamburger","http://localhost:8080/api/image/img1.jpg",NULL,1611285712,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (2,"Pizza","http://localhost:8080/api/image/img2.jpg",NULL, 1611246112,620,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (3,"Omelette","http://localhost:8080/api/image/img3.jpg",NULL,1611285712,196,3);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (4,"Fish and chips","http://localhost:8080/api/image/img4.jpg",NULL,1611361312,681,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (5,"Chicken curry","http://localhost:8080/api/image/img5.jpg",NULL,1611361312,897,5);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (6,"Hamburger","http://localhost:8080/api/image/img1.jpg",1,1611361312,640,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (7,"Omelette","http://localhost:8080/api/image/img3.jpg",1,1611332512,554,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (8,"Chicken curry","http://localhost:8080/api/image/img5.jpg",2,1611361312,788,4);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (9,"Chicken curry","http://localhost:8080/api/image/img5.jpg",2,1611447712,987,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (10,"Fish and chips","http://localhost:8080/api/image/img4.jpg",3,1611444112,456,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (11,"Pizza","http://localhost:8080/api/image/img2.jpg",3,1611447712,321,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (12,"Fish and chips","http://localhost:8080/api/image/img4.jpg",3,1611444112,555,5);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (13,"Pizza","http://localhost:8080/api/image/img2.jpg",3,1611444112,800,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (14,"Chicken curry","http://localhost:8080/api/image/img5.jpg",4,1611530512,600,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (15,"Fish and chips","http://localhost:8080/api/image/img4.jpg",4,1611530600,700,3);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (16,"Omelette","http://localhost:8080/api/image/img3.jpg",5,1612175875,800,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (17,"Chicken curry","http://localhost:8080/api/image/img5.jpg",6,1611631312,400,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (18,"Pizza","http://localhost:8080/api/image/img2.jpg",6,1611632000,300,5);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (19,"Pizza","http://localhost:8080/api/image/img2.jpg",7,1611714112,554,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (20,"Hamburger","http://localhost:8080/api/image/img1.jpg",7,1611714202,500,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (21,"Chicken curry","http://localhost:8080/api/image/img5.jpg",10,1611444112,555,5);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (22,"Chicken curry","http://localhost:8080/api/image/img5.jpg",11,1612175875,800,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (23,"Fish and chips","http://localhost:8080/api/image/img4.jpg",11,1612175875,500,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (24,"Omelette","http://localhost:8080/api/image/img3.jpg",12,1611714112,859,2);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (25,"Pizza","http://localhost:8080/api/image/img2.jpg",13,1611714112,777,3);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (26,"Hamburger","http://localhost:8080/api/image/img1.jpg",13,1611714202,888,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (27,"Omelette","http://localhost:8080/api/image/img3.jpg",14,1612436776,900,2);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (28,"Chicken curry","http://localhost:8080/api/image/img5.jpg",15,1612523176,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (29,"Pizza","http://localhost:8080/api/image/img2.jpg",15,1612523176,999,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (30,"Chicken curry","http://localhost:8080/api/image/img5.jpg",16,1612609576,897,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (31,"Pizza","http://localhost:8080/api/image/img2.jpg",17,1612609576,2222,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (32,"Hamburger","http://localhost:8080/api/image/img1.jpg",18,1612609576,640,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (33,"Hamburger","http://localhost:8080/api/image/img1.jpg",19,1612609576,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (34,"Pizza","http://localhost:8080/api/image/img2.jpg",19,1612609576,620,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (35,"Omelette","http://localhost:8080/api/image/img3.jpg",19,1612609576,196,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (36,"Pizza","http://localhost:8080/api/image/img2.jpg",20,1612609576,620,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (37,"Omelette","http://localhost:8080/api/image/img3.jpg",20,1612609576,196,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (38,"Fish and chips","http://localhost:8080/api/image/img4.jpg",20,1612609576,681,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (39,"Omelette","http://localhost:8080/api/image/img3.jpg",21,1612609576,196,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (40,"Fish and chips","http://localhost:8080/api/image/img4.jpg",21,1612609576,681,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (41,"Chicken curry","http://localhost:8080/api/image/img5.jpg",21,1612609576,897,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (42,"Fish and chips","http://localhost:8080/api/image/img4.jpg",22,1612609576,681,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (43,"Chicken curry","http://localhost:8080/api/image/img5.jpg",22,1612609576,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (44,"Hamburger","http://localhost:8080/api/image/img1.jpg",22,1612609576,640,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (45,"Chicken curry","http://localhost:8080/api/image/img5.jpg",23,1612609576,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (46,"Hamburger","http://localhost:8080/api/image/img1.jpg",23,1612609576,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (47,"Pizza","http://localhost:8080/api/image/img2.jpg",23,1612609576,620,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (48,"Chicken curry","http://localhost:8080/api/image/img5.jpg",24,1612609576,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (49,"Hamburger","http://localhost:8080/api/image/img1.jpg",24,1612609576,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (50,"Pizza","http://localhost:8080/api/image/img2.jpg",24,1612609576,620,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (51,"Hamburger","http://localhost:8080/api/image/img1.jpg",25,1612609576,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (52,"Pizza","http://localhost:8080/api/image/img2.jpg",25,1612609576,620,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (53,"Omelette","http://localhost:8080/api/image/img3.jpg",25,1612609576,196,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (54,"Pizza","http://localhost:8080/api/image/img2.jpg",26,1612609576,620,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (55,"Omelette","http://localhost:8080/api/image/img3.jpg",26,1612609576,196,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (56,"Fish and chips","http://localhost:8080/api/image/img4.jpg",26,1612609576,681,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (57,"Omelette","http://localhost:8080/api/image/img3.jpg",27,1612609576,196,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (58,"Fish and chips","http://localhost:8080/api/image/img4.jpg",27,1612609576,681,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (59,"Chicken curry","http://localhost:8080/api/image/img5.jpg",27,1612609576,897,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (60,"Fish and chips","http://localhost:8080/api/image/img4.jpg",28,1612609576,681,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (61,"Chicken curry","http://localhost:8080/api/image/img5.jpg",28,1612609576,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (62,"Hamburger","http://localhost:8080/api/image/img1.jpg",28,1612609576,640,1);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (63,"Chicken curry","http://localhost:8080/api/image/img5.jpg",29,1612609576,897,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (64,"Hamburger","http://localhost:8080/api/image/img1.jpg",29,1612609576,640,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (65,"Pizza","http://localhost:8080/api/image/img2.jpg",29,1612609576,620,1);
