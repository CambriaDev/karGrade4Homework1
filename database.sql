create table LAO_DONG_LI
(
    id         bigint not null
        primary key,
    year       date null comment '年份',
    population int null comment '人数'
) comment '劳动力';

create table chengxiang
(
    C1 text null,
    C2 int null,
    C3 int null,
    C4 int null
);

create table hangyechengzhen
(
    year text null,
    C2   int null,
    C3   int null,
    C4   int null,
    C5   int null,
    C6   int null,
    C7   int null,
    C8   int null,
    C9   int null,
    C10  int null,
    C11  int null,
    C12  int null,
    C13  int null,
    C14  int null,
    C15  int null,
    C16  int null,
    C17  int null,
    C18  int null,
    C19  int null,
    C20  int null,
    C21  int null
);

create table hangyeguoyou
(
    C1  text null,
    C2  int null,
    C3  int null,
    C4  int null,
    C5  int null,
    C6  int null,
    C7  int null,
    C8  int null,
    C9  int null,
    C10 int null,
    C11 int null,
    C12 int null,
    C13 int null,
    C14 int null,
    C15 int null,
    C16 int null,
    C17 int null,
    C18 int null,
    C19 int null,
    C20 int null,
    C21 int null
);

create table jingjichengzhen
(
    C1  text null,
    C2  int null,
    C3  int null,
    C4  int null,
    C5  int null,
    C6  int null,
    C7  int null,
    C8  int null,
    C9  int null,
    C10 int null,
    C11 int null,
    C12 int null
);

create table jingjixiangcun
(
    C1 text null,
    C2 int null,
    C3 int null,
    C4 int null
);

create table laodongli
(
    year          text null,
    population10k int null
);

create table sancichanye
(
    C1 text null,
    C2 int null,
    C3 int null,
    C4 int null,
    C5 int null
);

create table siyingqiye
(
    C1 text null,
    C2 int null,
    C3 int null,
    C4 int null,
    C5 int null,
    C6 int null,
    C7 int null,
    C8 int null
);

