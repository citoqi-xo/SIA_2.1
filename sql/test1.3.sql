/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     04/09/2015 15:10:38                          */
/*==============================================================*/


drop table if exists ARUSKAS;

drop table if exists DEL_JUAL;

drop table if exists PEMASUKAN;

drop table if exists PEMBELIAN;

drop table if exists PENDAPATAN;

drop table if exists PENGELUARAN;

drop table if exists PETUGAS;

drop table if exists SALDO;

drop table if exists SALDOTAMBAHAN;

drop table if exists STATUS;

/*==============================================================*/
/* Table: ARUSKAS                                               */
/*==============================================================*/
create table ARUSKAS
(
   ID_ARUSKAS           int not null,
   TGL_PENGELUARAN      date,
   TGL_PEMASUKAN        date,
   TGL_ARUSKAS          date not null,
   SALDO_AWAL           numeric(20,0) not null,
   JUMLAH_PENDAPATAN    numeric(20,0) not null,
   JUMLAH_PEMASUKAN     numeric(20,0) not null,
   JUMLAH_PENGELUARAN   numeric(20,0) not null,
   SALDO_AKHIR          numeric(20,0) not null,
   SETORAN              numeric(20,0) not null,
   SISA_USAHA           numeric(20,0) not null,
   TUNAI                numeric(20,0),
   BANK_A               numeric(20,0),
   BANK_B               numeric(20,0),
   BANK_C               numeric(20,0),
   primary key (ID_ARUSKAS)
);

/*==============================================================*/
/* Table: DEL_JUAL                                              */
/*==============================================================*/
create table DEL_JUAL
(
   NO_JUAL              int not null,
   KODE_PETUGAS         int not null,
   TGL_JUAL             date not null,
   JML_JUAL             varchar(12) not null,
   POT_JMLJUAL          varchar(12),
   PEMBELI              varchar(50),
   UANG_BAYAR           varchar(24),
   SISA_BAYAR           varchar(24),
   STATUS_BAYAR         varchar(15),
   KETERANGAN           varchar(18),
   JENIS_CARD           varchar(15),
   primary key (NO_JUAL)
);

/*==============================================================*/
/* Table: PEMASUKAN                                             */
/*==============================================================*/
create table PEMASUKAN
(
   TGL_PEMASUKAN        date not null,
   TGL_SALDO            date not null,
   TGL_PENDAPATAN       date not null,
   JUMLAH_PEMS          numeric(20,0) not null,
   primary key (TGL_PEMASUKAN)
);

/*==============================================================*/
/* Table: PEMBELIAN                                             */
/*==============================================================*/
create table PEMBELIAN
(
   ID_PEMBELIAN         int not null,
   KODE_PETUGAS         int not null,
   TGL_PENGELUARAN      date,
   TGL_PEMBELIAN        date not null,
   NAMA_PEMBELIAN       varchar(25) not null,
   JUMLAH_PEMBELIAN     numeric(20,0) not null,
   HARGA_BP             numeric(20,0) not null,
   HARGA_JBP            numeric(20,0) not null,
   KET_PEMBELIAN        varchar(25),
   primary key (ID_PEMBELIAN)
);

/*==============================================================*/
/* Table: PENDAPATAN                                            */
/*==============================================================*/
create table PENDAPATAN
(
   TGL_PENDAPATAN       date not null,
   JUMLAH_PEND          numeric(20,0) not null,
   primary key (TGL_PENDAPATAN)
);

/*==============================================================*/
/* Table: PENGELUARAN                                           */
/*==============================================================*/
create table PENGELUARAN
(
   TGL_PENGELUARAN      date not null,
   JUMLAH_KELUAR        numeric(20,0) not null,
   primary key (TGL_PENGELUARAN)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   KODE_PETUGAS         int not null,
   ID_STATUS            int not null,
   NAMA_PETUGAS         varchar(35) not null,
   KATAKUNCI            varchar(12) not null,
   primary key (KODE_PETUGAS)
);

/*==============================================================*/
/* Table: SALDO                                                 */
/*==============================================================*/
create table SALDO
(
   TGL_SALDO            date not null,
   ISISALDO             numeric(20,0) not null,
   primary key (TGL_SALDO)
);

/*==============================================================*/
/* Table: SALDOTAMBAHAN                                         */
/*==============================================================*/
create table SALDOTAMBAHAN
(
   ID_SALDOTAM          int not null,
   TGL_SALDO            date,
   KODE_PETUGAS         int not null,
   ISISALDOTAM          numeric(20,0) not null,
   STATUS_SALDO         varchar(20),
   KET_SALDOTAM         varchar(25),
   primary key (ID_SALDOTAM)
);

/*==============================================================*/
/* Table: STATUS                                                */
/*==============================================================*/
create table STATUS
(
   ID_STATUS            int not null,
   NAMA_STATUS          varchar(15) not null,
   primary key (ID_STATUS)
);

alter table ARUSKAS add constraint FK_PROYEKSIPEMASUK foreign key (TGL_PEMASUKAN)
      references PEMASUKAN (TGL_PEMASUKAN) on delete restrict on update restrict;

alter table ARUSKAS add constraint FK_PROYEKSIPENGELUARAN foreign key (TGL_PENGELUARAN)
      references PENGELUARAN (TGL_PENGELUARAN) on delete restrict on update restrict;

alter table DEL_JUAL add constraint FK_MELAKUKAN_BAYAR foreign key (KODE_PETUGAS)
      references PETUGAS (KODE_PETUGAS) on delete restrict on update restrict;

alter table PEMASUKAN add constraint FK_PROYEKSIPEMASUKA foreign key (TGL_PENDAPATAN)
      references PENDAPATAN (TGL_PENDAPATAN) on delete restrict on update restrict;

alter table PEMASUKAN add constraint FK_PROYEKSISALDO foreign key (TGL_SALDO)
      references SALDO (TGL_SALDO) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_MELAKUKANPEMBELIAN foreign key (KODE_PETUGAS)
      references PETUGAS (KODE_PETUGAS) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_MEMILIKI foreign key (TGL_PENGELUARAN)
      references PENGELUARAN (TGL_PENGELUARAN) on delete restrict on update restrict;

alter table PETUGAS add constraint FK_STATUSPETUGAS foreign key (ID_STATUS)
      references STATUS (ID_STATUS) on delete restrict on update restrict;

alter table SALDOTAMBAHAN add constraint FK_MENAMBAHKAN foreign key (TGL_SALDO)
      references SALDO (TGL_SALDO) on delete restrict on update restrict;

alter table SALDOTAMBAHAN add constraint FK_MENGISISALDO foreign key (KODE_PETUGAS)
      references PETUGAS (KODE_PETUGAS) on delete restrict on update restrict;

