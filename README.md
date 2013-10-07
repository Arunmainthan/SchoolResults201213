Coding Challenge - School Results APP
====== =========   ====== ======= ===

Technologies Used
-----------------
Struts2 (2.3)
Spring (2.5)
struts2-spring-plugin 2.1.8) - To Integrate struts and spring 
Hibernate 3 (3.6.3)
Hibernate-Annotations
displaytag 1.2
MySQL
Maven
Git
JQuery
JBoss AS 7

About the App
-------------
The web application will display the table of results with sortable enabled for each column. In addition to sorting it will also allows to filter the results by a subject.

How the technologies used
1.	This is a MVC architecture based web application developed using the Struts 2 framework. 
2.	The Spring framework is used for the dependency injection. Struts-Spring integration plugin is used for the spring to manage the life cycle of the action class.
3.	Hibernate3 is used as the ORM tool. Hibernate entity classes are annotated, therefore I do not have any *.hbm.xml  files or the Hibernate.cfg.xml. Database settings are saved in the Database. Properties file. 
4.	JSP with Displaytag used in the view layer. The pagination and sort are powered by the displaytag. 
5.	The default behavior of the displaytag is to refresh the pages when sorting or clicking the pagination links. But I used JQuery to load the data into a DIV when sorting. 
6.	CSS style sheet used for styling the page 

Layers
------

The application is layered as Presentation, Service (Business), DAO.
Presentation - Struts , JSP
Service – Service classes talk to DAO layer and return the results to the Struts Action Classes(Presentation)
DAO – implementing the HibernateDAOSupport 

Java Package Details
--------------------

com.cinglevue.action –   Struts Action Classes
com.cinglevue.service – Service Classes
com.cinglevue.dao      -  DAO Classes
com.cinglevue.domain – Hibernate Entity annotated Classes

Mysql Table Struture
--------------------
CREATE TABLE `subject` (
  `SUBJECT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SUBJECT_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`SUBJECT_ID`),
  UNIQUE KEY `SUBJECT_ID` (`SUBJECT_ID`),
  UNIQUE KEY `SUBJECT_NAME` (`SUBJECT_NAME`),
  UNIQUE KEY `SUBJECT_NAME_2` (`SUBJECT_NAME`)
) 
CREATE TABLE `school` (
  `SCHOOL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SCHOOL_NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`SCHOOL_ID`),
  UNIQUE KEY `SCHOOL_ID` (`SCHOOL_ID`),
  UNIQUE KEY `SCHOOL_NAME` (`SCHOOL_NAME`),
  UNIQUE KEY `SCHOOL_NAME_2` (`SCHOOL_NAME`)
)

CREATE TABLE `school` (
  `SCHOOL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SCHOOL_NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`SCHOOL_ID`),
  UNIQUE KEY `SCHOOL_ID` (`SCHOOL_ID`),
  UNIQUE KEY `SCHOOL_NAME` (`SCHOOL_NAME`),
  UNIQUE KEY `SCHOOL_NAME_2` (`SCHOOL_NAME`)
)

CREATE TABLE `result` (
  `RESULT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `factoredGainY3Y5` double NOT NULL,
  `glgY3Y5` double NOT NULL,
  `latestGainInGainY3Y5` double NOT NULL,
  `latestY3` double NOT NULL,
  `latestY5` double NOT NULL,
  `latestY7` double NOT NULL,
  `latestY9` double NOT NULL,
  `rawGainY3Y5` double NOT NULL,
  `SCHOOL_ID` int(11) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  PRIMARY KEY (`RESULT_ID`),
  UNIQUE KEY `RESULT_ID` (`RESULT_ID`),
  KEY `FKC84DC81D7AEB887D` (`SUBJECT_ID`),
  KEY `FKC84DC81DA910C297` (`SCHOOL_ID`),
  CONSTRAINT `FKC84DC81DA910C297` FOREIGN KEY (`SCHOOL_ID`) REFERENCES `school` (`SCHOOL_ID`),
  CONSTRAINT `FKC84DC81D7AEB887D` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `subject` (`SUBJECT_ID`)
)
