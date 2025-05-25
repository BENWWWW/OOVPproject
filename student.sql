-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 25, 2025 at 08:29 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbstudents`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `GPA` decimal(3,2) DEFAULT NULL,
  `enrollment` varchar(23) DEFAULT NULL,
  `major` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `name`, `gender`, `phone`, `GPA`, `enrollment`, `major`) VALUES
('001202400132', 'Ruben Sulaiman', 'Male', '81234567890', '4.00', '2024-04-21', 'Medical'),
('001202400134', 'Isabelle', 'Female', '85723457890', '5.00', '2024-09-24', 'Software Engineering'),
('001202400165', 'David Blaine', 'Male', '82314987700', '3.90', '2024-08-15', 'Computer Science'),
('001202400181', 'Dzaki abrar', 'Male', '84556786789', '5.00', '2024-09-24', 'Information System'),
('001202400185', 'Ashraf Malabali', 'Male', '62123456789', '4.00', '2024-10-30', 'Teknik Kedokteran'),
('001202400187', 'Aqila Zahra', 'Female', '081234567891', '3.75', '2024-09-24', 'Computer Science'),
('001202400188', 'Rizky Maulana', 'Male', '082198765432', '2.90', '2024-09-24', 'Information System'),
('001202400189', 'Salsa Nabila', 'Female', '085612345678', '3.50', '2024-09-24', 'Visual Communication Design'),
('001202400190', 'Farhan Akbar', 'Male', '089912341234', '3.95', '2024-09-24', 'Information Technology'),
('001202400191', 'Nadia Fitria', 'Female', '083812345670', '2.75', '2024-09-24', 'Information System'),
('001202400192', 'Emily Johnson', 'Female', '081765432109', '3.85', '2024-09-24', 'Cyber Security'),
('001202400193', 'Liam Anderson', 'Male', '082334455667', '3.60', '2024-09-24', 'Computer Science'),
('001202400194', 'Sophia Martinez', 'Female', '083322114455', '3.40', '2024-09-24', 'Software Engineering'),
('001202400195', 'Ethan Walker', 'Male', '085566778899', '3.20', '2024-09-24', 'Information System'),
('001202400196', 'Isabella Thompson', 'Female', '089911223344', '3.90', '2024-09-24', 'Cyber Security'),
('001202400198', 'Alicia Magentano', 'Female', '87623459900', '3.60', '2024-09-01', 'Medical Technology');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
