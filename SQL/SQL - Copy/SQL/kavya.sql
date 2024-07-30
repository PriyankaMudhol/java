CREATE  DATABASE  Hospital;
USE Hospital;
CREATE TABLE hospital_info(hospital_name varchar (50), hospital_id bigint,hospital_address varchar(20),no_of_doctors bigint , no_of_paitatient bigint, department varchar(30),no_of_nurse bigint,doctor_salary bigint,
case_file_no int,no_of_beds int);
INSERT INTO hospital_info values('laxmi hospital', 1234, 'belagavi',10,100,'Emergency medicine',20,5000,123,200);
INSERT INTO hospital_info values('bhavya hospital', 456, 'bengaluru',20,520,'General medicine',40,50000,1234,2000);
INSERT INTO hospital_info values('swati hospital', 789, 'rajaji nagar',30,500,'Obstetrics and gynaecology',60,500,4568,400);
INSERT INTO hospital_info values('anu hospital', 7894, 'btm',40,404,'Intensive care medicine',10,4500,852,300);
INSERT INTO hospital_info values('samarth hospital', 4569, 'electronic city',50,350,'Psychiatry',30,2000,452,700);
INSERT INTO hospital_info values('lalita hospital', 6547, 'maha laxmi layout',62,320,'Pediatrics',50,2500,652,800);
INSERT INTO hospital_info values('chanagond hospital', 6548, 'shegunshi',60,310,'Radiology',20,3000,125,390);
INSERT INTO hospital_info values('soni hospital',852, 'terdal',70,300,'Pharmacy',70,3500,325,380);
INSERT INTO hospital_info values('aly hospital', 741, 'gokak',80,290,'Cardiology',80,4000,124,370);
INSERT INTO hospital_info values('rahul hospital', 963, 'athani',90,280,'Neurology',90,6500,326,360);
INSERT INTO hospital_info values('karan hospital', 3210, 'harugeri',100,270,'Outpatient department',100,7500,452,350);
INSERT INTO hospital_info values('arjun hospital', 1230, 'chikkodi',75,260,'General medicine',55,8000,312,340);
INSERT INTO hospital_info values('anika hospital', 4560, 'mumbai',84,240,'Elderly Services',45,8500,563,330);
INSERT INTO hospital_info values('divya hospital', 6540, 'channai',96,220,'Inpatient department',35,9000,782,320);
INSERT INTO hospital_info values('sumita hospital', 4562, 'uk',159,200,'ENT',25,10000,982,310);
INSERT INTO hospital_info values('revati hospital', 4563, 'korea',410,190,'Medical records',95,15000,983,290);
INSERT INTO hospital_info values('tafseen hospital', 159, 'goa',100,180,'Laboratory',90,20000,7891,280);
INSERT INTO hospital_info values('kiran hospital', 951, 'bidar',120,170,'Medical records',85,25000,7412,270);
INSERT INTO hospital_info values('pooja hospital', 157, 'hassan',130,160,'Pediatrics',28,30000,1247,260);
INSERT INTO hospital_info values('kavya hospital', 953, 'haveri',180,150,'Intensive care medicine',75,35000,3589,250);
Select *from hospital_info;

CREATE TABLE tourist_places (places_name varchar (30), id int, enterance_fee bigint, feed_back varchar(50),no_of_passenger int,
no_of_vehicle int,vehicle_name varchar (20), amount_spent bigint,no_of_placevisit int, tourist_guide_name varchar(20));
INSERT INTO tourist_places values('gokak falls',123,200,'good',10,5,'bike',100,2,'laxmi');
INSERT INTO tourist_places values('lalbagh',456,100,'good',20,10,'bus',250,3,'bhavya');
INSERT INTO tourist_places values('cubbon park',789,300,'good',30,15,'car',260,4,'swati');
INSERT INTO tourist_places values('iskon temple',741,400,'good',40,20,'van',270,5,'anu');
INSERT INTO tourist_places values('mysore palace',852,500,'good',50,25,'bike',280,6,'samarth');
INSERT INTO tourist_places values('gokarna',963,600,'good',60,30,'bus',290,7,'lalita');
INSERT INTO tourist_places values('madikeri',159,700,'good',70,35,'car',300,8,'changond');
INSERT INTO tourist_places values('hampi',357,800,'good',80,40,'van',310,9,'soni');
INSERT INTO tourist_places values('nandi hills',410,900,'good',90,45,'bike',320,10,'tafseen');
INSERT INTO tourist_places values('udupi',1520,1000,'good',110,50,'car',330,11,'divya');
INSERT INTO tourist_places values('dandeli',630,200,'good',120,55,'bus',350,12,'revati');
INSERT INTO tourist_places values('murdeshwar',740,300,'average',130,60,'van',340,13,'sumita');
INSERT INTO tourist_places values('jog falls',850,400,'average',140,65,'car',360,14,'aly');
INSERT INTO tourist_places values('belur',960,500,'average',150,70,'bus',370,15,'rahul');
INSERT INTO tourist_places values('kudremukh',710,600,'average',160,75,'van',380,16,'karan');
INSERT INTO tourist_places values('vidhana soudha',802,700,'average',170,80,'bike',390,17,'arjun');
INSERT INTO tourist_places values('cubbon park',903,800,'average',180,85,'car',400,18,'payal');
INSERT INTO tourist_places values('commercial street',401,900,'average',190,90,'van',410,19,'kavya');
INSERT INTO tourist_places values('ulsoor lake',502,200,'average',200,95,'bus',420,20,'sana');
INSERT INTO tourist_places values('freedom park',603,300,'average',210,100,'bike',430,21,'kiran');
INSERT INTO tourist_places values('shivoham shiva temple',548,200,'average',200,105,'thar',440,22,'deva');