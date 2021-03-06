-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2020 at 09:43 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistemdonasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `mst_adopsi`
--

CREATE TABLE `mst_adopsi` (
  `id_adopsi` int(11) NOT NULL,
  `no_adopsi` varchar(20) NOT NULL,
  `nama_adopsi` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  `kode_anak` varchar(6) NOT NULL,
  `keterangan` text NOT NULL,
  `create_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mst_adopsi`
--

INSERT INTO `mst_adopsi` (`id_adopsi`, `no_adopsi`, `nama_adopsi`, `alamat`, `no_telp`, `pekerjaan`, `kode_anak`, `keterangan`, `create_date`) VALUES
(2, 'AD/04/2020/0001', 'yfs', 'zxc', '123213', 'Pegawai Negeri Sipil', 'KA0001', 'asd', '2020-04-25');

-- --------------------------------------------------------

--
-- Table structure for table `mst_anak`
--

CREATE TABLE `mst_anak` (
  `id_anak` int(11) NOT NULL,
  `kode_anak` varchar(8) NOT NULL,
  `nama_anak` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(2) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tanggal_masuk_panti` date NOT NULL,
  `pendidikan_terakhir` varchar(30) NOT NULL,
  `nama_orangtua_anak` varchar(100) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mst_anak`
--

INSERT INTO `mst_anak` (`id_anak`, `kode_anak`, `nama_anak`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `tanggal_masuk_panti`, `pendidikan_terakhir`, `nama_orangtua_anak`, `keterangan`) VALUES
(1, 'KA0001', 'Daus', 'L', 'Bekasi', '2020-04-02', '2020-04-10', 'SD', 'as', '');

-- --------------------------------------------------------

--
-- Table structure for table `mst_donasi`
--

CREATE TABLE `mst_donasi` (
  `id_donasi` int(11) NOT NULL,
  `no_donasi` varchar(30) NOT NULL,
  `nama_donatur` varchar(50) NOT NULL,
  `alamat_donatur` text NOT NULL,
  `jumlah_donasi` double NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `bukti_pembayaran` text NOT NULL,
  `keterangan` text NOT NULL,
  `create_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mst_donasi`
--

INSERT INTO `mst_donasi` (`id_donasi`, `no_donasi`, `nama_donatur`, `alamat_donatur`, `jumlah_donasi`, `no_telepon`, `bukti_pembayaran`, `keterangan`, `create_date`) VALUES
(1, 'DN/04/2020/0001', 'asd', 'asd', 23, '12', 'Ttd feri png.png', 'asd', '2020-04-16'),
(2, 'DN/04/2020/0002', 'Jajang', 'Jaya	', 1000000, '08787894818', '16-166456_islamic-corners-ornamentsart-ornamen-islami-clipart.png', 'pke', '2020-04-16');

-- --------------------------------------------------------

--
-- Table structure for table `mst_login`
--

CREATE TABLE `mst_login` (
  `id_login` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mst_login`
--

INSERT INTO `mst_login` (`id_login`, `username`, `password`, `nama_lengkap`, `status`) VALUES
(1, 'admin', 'admin', 'Admin', 1),
(2, 'daus', 'daus', 'Daus', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mst_adopsi`
--
ALTER TABLE `mst_adopsi`
  ADD PRIMARY KEY (`id_adopsi`);

--
-- Indexes for table `mst_anak`
--
ALTER TABLE `mst_anak`
  ADD PRIMARY KEY (`id_anak`);

--
-- Indexes for table `mst_donasi`
--
ALTER TABLE `mst_donasi`
  ADD PRIMARY KEY (`id_donasi`),
  ADD UNIQUE KEY `no_donasi` (`no_donasi`);

--
-- Indexes for table `mst_login`
--
ALTER TABLE `mst_login`
  ADD PRIMARY KEY (`id_login`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mst_adopsi`
--
ALTER TABLE `mst_adopsi`
  MODIFY `id_adopsi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `mst_anak`
--
ALTER TABLE `mst_anak`
  MODIFY `id_anak` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `mst_donasi`
--
ALTER TABLE `mst_donasi`
  MODIFY `id_donasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `mst_login`
--
ALTER TABLE `mst_login`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
