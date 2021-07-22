-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 01 Sep 2015 pada 18.54
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `test`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `aruskas`
--

CREATE TABLE IF NOT EXISTS `aruskas` (
  `ID_ARUSKAS` int(11) NOT NULL AUTO_INCREMENT,
  `TGL_PENGELUARAN` date DEFAULT NULL,
  `TGL_PEMASUKAN` date DEFAULT NULL,
  `TGL_ARUSKAS` date NOT NULL,
  `SALDO_AWAL` varchar(14) NOT NULL,
  `JUMLAH_PENDAPATAN` varchar(14) NOT NULL,
  `JUMLAH_PEMASUKAN` varchar(14) NOT NULL,
  `JUMLAH_PENGELUARAN` varchar(14) NOT NULL,
  `SALDO_AKHIR` varchar(14) NOT NULL,
  `SETORAN` varchar(14) NOT NULL,
  `SISA_USAHA` varchar(14) NOT NULL,
  PRIMARY KEY (`ID_ARUSKAS`),
  KEY `FK_PROYEKSIPEMASUK` (`TGL_PEMASUKAN`),
  KEY `FK_PROYEKSIPENGELUARAN` (`TGL_PENGELUARAN`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data untuk tabel `aruskas`
--

INSERT INTO `aruskas` (`ID_ARUSKAS`, `TGL_PENGELUARAN`, `TGL_PEMASUKAN`, `TGL_ARUSKAS`, `SALDO_AWAL`, `JUMLAH_PENDAPATAN`, `JUMLAH_PEMASUKAN`, `JUMLAH_PENGELUARAN`, `SALDO_AKHIR`, `SETORAN`, `SISA_USAHA`) VALUES
(9, '2015-08-27', '2015-08-27', '2015-08-27', '20000', '0', '20000', '10000', '0', '0', '10000'),
(10, '2015-08-28', '2015-08-28', '2015-08-28', '10000', '0', '10000', '0', '0', 'null', '10000'),
(12, '2015-08-29', '2015-08-29', '2015-08-29', '10000', '0', '10000', '0', '0', '0', '10000'),
(13, '2015-09-01', '2015-09-01', '2015-09-01', '10000', '0', '10000', '100', '0', '0', '9900');

-- --------------------------------------------------------

--
-- Struktur dari tabel `del_jual`
--

CREATE TABLE IF NOT EXISTS `del_jual` (
  `NO_JUAL` int(11) NOT NULL AUTO_INCREMENT,
  `KODE_PETUGAS` int(11) NOT NULL,
  `TGL_JUAL` date NOT NULL,
  `JML_JUAL` varchar(12) NOT NULL,
  `POT_JMLJUAL` varchar(12) DEFAULT NULL,
  `PEMBELI` varchar(50) DEFAULT NULL,
  `UANG_BAYAR` varchar(24) DEFAULT NULL,
  `SISA_BAYAR` varchar(24) DEFAULT NULL,
  `STATUS_BAYAR` varchar(15) DEFAULT NULL,
  `KETERANGAN` varchar(18) DEFAULT NULL,
  `JENIS_CARD` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`NO_JUAL`),
  KEY `FK_MELAKUKAN_BAYAR` (`KODE_PETUGAS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_deljual`
--

CREATE TABLE IF NOT EXISTS `detail_deljual` (
  `No_jual` int(11) NOT NULL AUTO_INCREMENT,
  `kode_barang` int(11) NOT NULL,
  `ukuran` varchar(14) NOT NULL,
  `qty_jual` varchar(6) NOT NULL,
  `disc_jual` varchar(12) NOT NULL,
  `sub_total` varchar(17) NOT NULL,
  `status` varchar(13) NOT NULL,
  `customer` varchar(14) NOT NULL,
  PRIMARY KEY (`No_jual`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemasukan`
--

CREATE TABLE IF NOT EXISTS `pemasukan` (
  `TGL_PEMASUKAN` date NOT NULL,
  `TGL_SALDO` date NOT NULL,
  `TGL_PENDAPATAN` date NOT NULL,
  `JUMLAH_PEMS` varchar(14) NOT NULL,
  PRIMARY KEY (`TGL_PEMASUKAN`),
  KEY `FK_PROYEKSIPEMASUKA` (`TGL_PENDAPATAN`),
  KEY `FK_PROYEKSISALDO` (`TGL_SALDO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemasukan`
--

INSERT INTO `pemasukan` (`TGL_PEMASUKAN`, `TGL_SALDO`, `TGL_PENDAPATAN`, `JUMLAH_PEMS`) VALUES
('2015-08-25', '2015-08-25', '2015-08-25', '136830'),
('2015-08-26', '2015-08-26', '2015-08-26', '0'),
('2015-08-27', '2015-08-27', '2015-08-27', '20000'),
('2015-08-28', '2015-08-28', '2015-08-28', '10000'),
('2015-08-29', '2015-08-29', '2015-08-29', '10000'),
('2015-08-30', '2015-08-30', '2015-08-30', '12000'),
('2015-08-31', '2015-08-31', '2015-08-31', '10000'),
('2015-09-01', '2015-09-01', '2015-09-01', '9900');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
  `ID_PEMBELIAN` int(11) NOT NULL AUTO_INCREMENT,
  `TGL_PENGELUARAN` date DEFAULT NULL,
  `KODE_PETUGAS` int(11) NOT NULL,
  `TGL_PEMBELIAN` date NOT NULL,
  `NAMA_PEMBELIAN` varchar(25) NOT NULL,
  `JUMLAH_PEMBELIAN` varchar(13) NOT NULL,
  `HARGA_BP` varchar(14) NOT NULL,
  `HARGA_JBP` varchar(14) NOT NULL,
  PRIMARY KEY (`ID_PEMBELIAN`),
  KEY `FK_MELAKUKANPEMBELIAN` (`KODE_PETUGAS`),
  KEY `FK_MEMILIKI` (`TGL_PENGELUARAN`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `pembelian`
--

INSERT INTO `pembelian` (`ID_PEMBELIAN`, `TGL_PENGELUARAN`, `KODE_PETUGAS`, `TGL_PEMBELIAN`, `NAMA_PEMBELIAN`, `JUMLAH_PEMBELIAN`, `HARGA_BP`, `HARGA_JBP`) VALUES
(1, '2015-09-01', 4, '2015-09-01', 'nama', '1', '100', '100');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendapatan`
--

CREATE TABLE IF NOT EXISTS `pendapatan` (
  `TGL_PENDAPATAN` date NOT NULL,
  `JUMLAH_PEND` varchar(14) NOT NULL,
  PRIMARY KEY (`TGL_PENDAPATAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pendapatan`
--

INSERT INTO `pendapatan` (`TGL_PENDAPATAN`, `JUMLAH_PEND`) VALUES
('2015-08-25', '0'),
('2015-08-26', '0'),
('2015-08-27', '0'),
('2015-08-28', '0'),
('2015-08-29', '0'),
('2015-08-30', '0'),
('2015-08-31', '0'),
('2015-09-01', '0');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengeluaran`
--

CREATE TABLE IF NOT EXISTS `pengeluaran` (
  `TGL_PENGELUARAN` date NOT NULL,
  `JUMLAH_KELUAR` varchar(14) NOT NULL,
  PRIMARY KEY (`TGL_PENGELUARAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengeluaran`
--

INSERT INTO `pengeluaran` (`TGL_PENGELUARAN`, `JUMLAH_KELUAR`) VALUES
('2015-08-25', '0'),
('2015-08-26', '1000'),
('2015-08-27', '0'),
('2015-08-28', '0'),
('2015-08-29', '0'),
('2015-08-30', '0'),
('2015-08-31', '0'),
('2015-09-01', '100');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `KODE_PETUGAS` int(11) NOT NULL AUTO_INCREMENT,
  `ID_STATUS` int(11) NOT NULL,
  `NAMA_PETUGAS` varchar(35) NOT NULL,
  `KATAKUNCI` varchar(12) NOT NULL,
  PRIMARY KEY (`KODE_PETUGAS`),
  KEY `FK_STATUSPETUGAS` (`ID_STATUS`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`KODE_PETUGAS`, `ID_STATUS`, `NAMA_PETUGAS`, `KATAKUNCI`) VALUES
(1, 1, 'admin', '12345'),
(2, 2, 'petugas', '12345'),
(3, 3, 'manager', '12345'),
(4, 4, 'akuntansi', '12345');

-- --------------------------------------------------------

--
-- Struktur dari tabel `saldo`
--

CREATE TABLE IF NOT EXISTS `saldo` (
  `TGL_SALDO` date NOT NULL,
  `ISISALDO` varchar(19) NOT NULL,
  PRIMARY KEY (`TGL_SALDO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `saldo`
--

INSERT INTO `saldo` (`TGL_SALDO`, `ISISALDO`) VALUES
('2015-08-24', '1000'),
('2015-08-25', '136830'),
('2015-08-26', '10000'),
('2015-08-27', '20000'),
('2015-08-28', '10000'),
('2015-08-29', '10000'),
('2015-08-30', '12000'),
('2015-08-31', '10000'),
('2015-09-01', '10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `saldotambahan`
--

CREATE TABLE IF NOT EXISTS `saldotambahan` (
  `ID_SALDOTAM` int(11) NOT NULL AUTO_INCREMENT,
  `TGL_SALDO` date DEFAULT NULL,
  `KODE_PETUGAS` int(11) NOT NULL,
  `ISISALDOTAM` varchar(20) NOT NULL,
  `STATUS_SALDO` varchar(25) NOT NULL,
  PRIMARY KEY (`ID_SALDOTAM`),
  KEY `FK_MENAMBAHKAN` (`TGL_SALDO`),
  KEY `FK_MENGISISALDO` (`KODE_PETUGAS`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

--
-- Dumping data untuk tabel `saldotambahan`
--

INSERT INTO `saldotambahan` (`ID_SALDOTAM`, `TGL_SALDO`, `KODE_PETUGAS`, `ISISALDOTAM`, `STATUS_SALDO`) VALUES
(12, '2015-08-25', 2, '123000', 'saldo usaha tambahan'),
(13, '2015-08-25', 2, '1200', 'saldo tambahan'),
(14, '2015-08-25', 2, '500', 'saldo tambahan'),
(15, '2015-08-25', 2, '120', 'saldo tambahan'),
(16, '2015-08-25', 2, '10', 'saldo tambahan'),
(17, '2015-08-25', 2, '12000', 'saldo tambahan'),
(24, '2015-08-27', 2, '10000', 'saldo usaha'),
(26, '2015-08-27', 2, '10000', 'saldo tambahan'),
(27, '2015-08-28', 2, '10000', 'saldo usaha'),
(28, '2015-08-28', 2, '100000', 'saldo usaha'),
(29, '2015-08-28', 2, '100000', 'saldo usaha'),
(30, '2015-08-28', 2, '10000', 'saldo usaha'),
(31, '2015-08-28', 2, '10000', 'saldo usaha'),
(32, '2015-08-28', 2, '10000', 'saldo usaha'),
(33, '2015-08-29', 2, '10000', 'saldo usaha'),
(34, '2015-08-30', 2, '12000', 'saldo usaha'),
(35, '2015-08-31', 2, '10000', 'saldo usaha'),
(36, '2015-09-01', 2, '10000', 'saldo usaha');

-- --------------------------------------------------------

--
-- Struktur dari tabel `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `ID_STATUS` int(11) NOT NULL AUTO_INCREMENT,
  `NAMA_STATUS` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_STATUS`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `status`
--

INSERT INTO `status` (`ID_STATUS`, `NAMA_STATUS`) VALUES
(1, 'admin'),
(2, 'petugas'),
(3, 'manager'),
(4, 'akuntansi');

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `aruskas`
--
ALTER TABLE `aruskas`
  ADD CONSTRAINT `FK_PROYEKSIPEMASUK` FOREIGN KEY (`TGL_PEMASUKAN`) REFERENCES `pemasukan` (`TGL_PEMASUKAN`),
  ADD CONSTRAINT `FK_PROYEKSIPENGELUARAN` FOREIGN KEY (`TGL_PENGELUARAN`) REFERENCES `pengeluaran` (`TGL_PENGELUARAN`);

--
-- Ketidakleluasaan untuk tabel `del_jual`
--
ALTER TABLE `del_jual`
  ADD CONSTRAINT `FK_MELAKUKAN_BAYAR` FOREIGN KEY (`KODE_PETUGAS`) REFERENCES `petugas` (`KODE_PETUGAS`);

--
-- Ketidakleluasaan untuk tabel `pemasukan`
--
ALTER TABLE `pemasukan`
  ADD CONSTRAINT `FK_PROYEKSIPEMASUKA` FOREIGN KEY (`TGL_PENDAPATAN`) REFERENCES `pendapatan` (`TGL_PENDAPATAN`),
  ADD CONSTRAINT `FK_PROYEKSISALDO` FOREIGN KEY (`TGL_SALDO`) REFERENCES `saldo` (`TGL_SALDO`);

--
-- Ketidakleluasaan untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `FK_MELAKUKANPEMBELIAN` FOREIGN KEY (`KODE_PETUGAS`) REFERENCES `petugas` (`KODE_PETUGAS`),
  ADD CONSTRAINT `FK_MEMILIKI` FOREIGN KEY (`TGL_PENGELUARAN`) REFERENCES `pengeluaran` (`TGL_PENGELUARAN`);

--
-- Ketidakleluasaan untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `FK_STATUSPETUGAS` FOREIGN KEY (`ID_STATUS`) REFERENCES `status` (`ID_STATUS`);

--
-- Ketidakleluasaan untuk tabel `saldotambahan`
--
ALTER TABLE `saldotambahan`
  ADD CONSTRAINT `FK_MENAMBAHKAN` FOREIGN KEY (`TGL_SALDO`) REFERENCES `saldo` (`TGL_SALDO`),
  ADD CONSTRAINT `FK_MENGISISALDO` FOREIGN KEY (`KODE_PETUGAS`) REFERENCES `petugas` (`KODE_PETUGAS`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
