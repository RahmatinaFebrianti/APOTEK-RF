-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2020 at 04:59 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek_rahmatina`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `Id_Karyawan` varchar(5) NOT NULL,
  `Nama_Karyawan` varchar(30) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Alamat` varchar(30) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `No_Telepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`Id_Karyawan`, `Nama_Karyawan`, `Jenis_Kelamin`, `Alamat`, `Status`, `No_Telepon`) VALUES
('K001', 'FEBRI', 'Perempuan', 'SKH', 'Kontrak', '08126173'),
('K002', 'rahma', 'Perempuan', 'skh', 'Tetap', '9130488943');

-- --------------------------------------------------------

--
-- Table structure for table `tb_obat`
--

CREATE TABLE `tb_obat` (
  `kd_obat` varchar(5) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `dosis` varchar(15) NOT NULL,
  `harga` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_obat`
--

INSERT INTO `tb_obat` (`kd_obat`, `nama_obat`, `jenis`, `dosis`, `harga`) VALUES
('OB001', 'ok', 'Kapsul', 'Anak-Anak', 60000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pelanggan`
--

CREATE TABLE `tb_pelanggan` (
  `id_pelanggan` varchar(5) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `no_telepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pelanggan`
--

INSERT INTO `tb_pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `jenis_kelamin`, `no_telepon`) VALUES
('P001', 'rahma', 'skh', 'Laki-Laki', '083816471'),
('P002', 'gefad', 'jdsb', 'Laki-Laki', '02834'),
('P003', 'jasjnajn', 'sjdan', 'Laki-Laki', 'sjdjan'),
('P004', 'hhh', 'hhj', 'Laki-Laki', 'astaga');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id_transaksi` varchar(5) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `id_pelanggan` varchar(5) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `id_karyawan` varchar(5) NOT NULL,
  `nama_karayawan` varchar(30) NOT NULL,
  `kode_obat` varchar(5) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `harga` int(30) NOT NULL,
  `jml_beli` varchar(5) NOT NULL,
  `total` int(30) NOT NULL,
  `bayar` int(30) NOT NULL,
  `kembalian` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id_transaksi`, `tgl_transaksi`, `id_pelanggan`, `nama_pelanggan`, `id_karyawan`, `nama_karayawan`, `kode_obat`, `nama_obat`, `harga`, `jml_beli`, `total`, `bayar`, `kembalian`) VALUES
('T001', '2020-06-20', 'P001', 'rahma', 'K001', 'FEBRI', 'OB001', 'ok', 60000, '2', 120000, 300000, 180000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`Id_Karyawan`);

--
-- Indexes for table `tb_obat`
--
ALTER TABLE `tb_obat`
  ADD PRIMARY KEY (`kd_obat`);

--
-- Indexes for table `tb_pelanggan`
--
ALTER TABLE `tb_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
