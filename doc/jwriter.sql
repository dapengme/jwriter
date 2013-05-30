-- phpMyAdmin SQL Dump
-- version 3.3.7
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 29, 2013 at 05:17 AM
-- Server version: 5.0.90
-- PHP Version: 5.2.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jwriter`
--

-- --------------------------------------------------------

--
-- Table structure for table `apps`
--

CREATE TABLE IF NOT EXISTS `apps` (
  `id` int(11) NOT NULL auto_increment,
  `app_name` varchar(100) NOT NULL,
  `app_description` int(200) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `apps`
--


-- --------------------------------------------------------

--
-- Table structure for table `app_blog`
--

CREATE TABLE IF NOT EXISTS `app_blog` (
  `id` int(11) NOT NULL auto_increment,
  `url` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `app_blog`
--

INSERT INTO `app_blog` (`id`, `url`, `username`, `password`) VALUES
(1, 'http://localhost:801/wordpress/xmlrpc.php', 'zhaopeng', '123456as');

-- --------------------------------------------------------

--
-- Table structure for table `app_blog_post`
--

CREATE TABLE IF NOT EXISTS `app_blog_post` (
  `id` int(11) NOT NULL auto_increment,
  `postid` int(11) default NULL,
  `blogid` int(11) default NULL,
  `title` varchar(100) default NULL,
  `post_status` varchar(100) default NULL,
  `description` varchar(2000) default NULL,
  `categories` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `app_blog_post`
--


-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `id` int(11) NOT NULL auto_increment,
  `userid` int(11) default NULL,
  `bookname` varchar(200) default NULL,
  `create_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `book`
--


-- --------------------------------------------------------

--
-- Table structure for table `note`
--

CREATE TABLE IF NOT EXISTS `note` (
  `id` int(11) NOT NULL auto_increment,
  `userid` int(11) default NULL,
  `title` text,
  `content` longtext,
  `status` int(11) default NULL,
  `create_time` timestamp NOT NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `note`
--

INSERT INTO `note` (`id`, `userid`, `title`, `content`, `status`, `create_time`) VALUES
(1, 0, '多发生的风', '11多发生的风多发生的风多发生的风多发生的风多发生的风多发生的风', 0, '2013-05-05 09:44:57');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(111) NOT NULL auto_increment,
  `username` varchar(20) default NULL,
  `email` varchar(200) default NULL,
  `password` varchar(200) default NULL,
  `register_date` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `email`, `password`, `register_date`) VALUES
(1, 'zhaopeng', NULL, NULL, '2013-05-05 09:44:23');
