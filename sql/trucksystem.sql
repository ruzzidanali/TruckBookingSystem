-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2022 at 07:36 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trucksystem2`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cus_id` int(11) NOT NULL,
  `cus_email` varchar(50) NOT NULL,
  `cus_password` varchar(20) NOT NULL,
  `cus_name` varchar(50) NOT NULL,
  `cus_ic` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cus_id`, `cus_email`, `cus_password`, `cus_name`, `cus_ic`) VALUES
(1, 'alfiqh3@gmail.com', '456', 'Alfiqh', '010513050337');

-- --------------------------------------------------------

--
-- Table structure for table `lorry`
--

CREATE TABLE `lorry` (
  `lorry_id` int(11) NOT NULL,
  `lorry_type` varchar(100) NOT NULL,
  `lorry_func` varchar(100) NOT NULL,
  `lorry_remarks` varchar(100) NOT NULL,
  `lorry_price` varchar(100) NOT NULL,
  `cus_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lorry`
--

INSERT INTO `lorry` (`lorry_id`, `lorry_type`, `lorry_func`, `lorry_remarks`, `lorry_price`, `cus_id`) VALUES
(1, 'Box Van', 'Moving House', '', 'RM150', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cus_id`);

--
-- Indexes for table `lorry`
--
ALTER TABLE `lorry`
  ADD PRIMARY KEY (`lorry_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cus_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `lorry`
--
ALTER TABLE `lorry`
  MODIFY `lorry_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
