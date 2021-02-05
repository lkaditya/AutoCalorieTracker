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
INSERT INTO USER VALUES (1, "SEDENTARY", 1980, "SUPERMAN@GMAIL.COM", "MALE", 180, "PASSWORD", 2200, 70);
INSERT INTO USER VALUES (2, "MODERATE", 1985, "SUPERWOMAN@GMAIL.COM", "FEMALE", 170, "PASSWORD", 1700, 60);
INSERT INTO USER VALUES (3, "ACTIVE", 1992, "ZAC@GMAIL.COM", "MALE", 175, "PASSWORD", 1200, 65);

#diet_plan
#id, date ,activity_id, user_id
INSERT INTO diet_plan VALUES (1, '2021-01-29', 1, 3);


#food
#id, calories, foodName, activity_id
INSERT INTO food VALUES (1, 250, "hamburger");
INSERT INTO food VALUES (2, 200, "pizza");
INSERT INTO food VALUES (3, 93, "omelette");
INSERT INTO food VALUES (4, 230, "fish and chips");
INSERT INTO food VALUES (5, 450, "chicken curry");

#dailyhistory
#id,date,user_id
INSERT INTO daily_history VALUES (1,'2021-01-22', 1);
INSERT INTO daily_history VALUES (2,'2021-01-23', 1);
INSERT INTO daily_history VALUES (3,'2021-01-24', 1);
INSERT INTO daily_history VALUES (4,'2021-01-25', 1);
INSERT INTO daily_history VALUES (5,'2021-01-26', 1);
INSERT INTO daily_history VALUES (6,'2021-01-27', 1);
INSERT INTO daily_history VALUES (7,'2021-01-28', 1);

#food_image
#id,epoch_time,calorie,food_name,url,dailyhistory_id,food_id
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (1,"hamburger","http://localhost:8080/api/image/img1.jpg",NULL,1611285712,250,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (2,"pizza","http://localhost:8080/api/image/img2.jpg",NULL, 1611246112,200,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (3,"omellete","http://localhost:8080/api/image/img3.jpg",NULL,1611285712,93,3);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (4,"fish and chips","http://localhost:8080/api/image/img4.jpg",NULL,1611361312,230,4);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (5,"chicken curry","http://localhost:8080/api/image/img5.jpg",NULL,1611361312,450,5);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (6,"Ginseng Chicken Soup","https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",1,1611361312,444,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (7,"Kimchi Stew","https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",1,1611332512,554,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (8,"Ginseng Chicken Soup","https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",2,1611361312,788,4);

INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (9,"Korean Saucy Chicken Wings (Mildly Spiced)","https://images.deliveryhero.io/image/fd-sg/Products/5570212.jpg?width=302",2,1611447712,987,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (10,"Coca-Cola 330ml","https://images.deliveryhero.io/image/fd-sg/Products/5543700.jpg?width=302",3,1611444112,456,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (11,"Char-Grilled Meat & Rice Set","https://images.deliveryhero.io/image/fd-sg/Products/5514321.jpg?width=302",3,1611447712,321,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (12,"Saba Fish & Rice Set","https://images.deliveryhero.io/image/fd-sg/Products/5514324.jpg?width=302",3,1611444112,555,5);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (13,"Salmon Rice Set","https://images.deliveryhero.io/image/fd-sg/Products/5530498.jpg?width=302",3,1611444112,800,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (14,"Kimchi Fried Rice","https://images.deliveryhero.io/image/fd-sg/Products/5514328.jpg?width=302",4,1611530512,600,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (15,"Kimchi Stew","https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",4,1611530600,700,3);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (16,"Ginseng Chicken Soup","https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",5,1612175875,800,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (21,"Ginseng Chicken Soup","https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",5,1612175875,500,1);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (17,"Salmon Rice Set","https://images.deliveryhero.io/image/fd-sg/Products/5530498.jpg?width=302",6,1611631312,400,4);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (18,"Kimchi Fried Rice","https://images.deliveryhero.io/image/fd-sg/Products/5514328.jpg?width=302",6,1611632000,300,5);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (19,"Kimchi Stew","https://images.deliveryhero.io/image/fd-sg/Products/5514332.jpg?width=302",7,1611714112,554,2);
INSERT INTO food_image (id, food_name, url, daily_history_id, epoch_date_upload, calorie, food_id) VALUES (20,"Ginseng Chicken Soup","https://images.deliveryhero.io/image/fd-sg/Products/5514334.jpg?width=302",7,1611714202,500,1);

