-- phpMyAdmin SQL Dump
-- version 3.2.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 26, 2013 at 05:30 AM
-- Server version: 5.1.40
-- PHP Version: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `testbase`
--

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '',
  `content` text NOT NULL,
  `uploaddate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=cp1251 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`id`, `title`, `content`, `uploaddate`) VALUES
(1, 'Первая новость', 'Дорогие посетители, с этой новости мы начинаем работу на нашем замечательном ресурсе!11', '2013-09-26 04:35:15'),
(2, 'Наполи выиграл у Милана', '"Наполи" выиграл у "Милана" в матче четвёртого тура итальянской серии А. Игра, состоявшаяся в Милане на стадионе "Сан-Сиро — Джузеппе Меацца", завершилась со счётом 1:2. За "Наполи" забили Мигель Бритос и Гонсало Игуаин, автор единственного гола "Милана" — Марио Балотелли. Стоит отметить, что во втором тайме, при счёте 0:2, Балотелли впервые в карьере не реализовал пенальти.', '2013-09-26 04:47:26'),
(15, 'Внимание!!!', 'Логины и пароли для доступа к системе:<br/>\r\nuser 1<br/>\r\nstud stud<br/>', '2013-09-26 05:28:27');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=cp1251 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `login`, `password`) VALUES
(4, 'stud', 'b9ac0988cdd72928bc964d81d5858bb7'),
(5, 'user', 'c4ca4238a0b923820dcc509a6f75849b');
