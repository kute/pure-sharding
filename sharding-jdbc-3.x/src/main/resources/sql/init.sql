use master_0;
create table user_post_0(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
create table user_post_1(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

use master_1;
create table user_post_0(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
create table user_post_1(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

use master_0_slave;
create table user_post_0(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
create table user_post_1(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

use master_1_slave;
create table user_post_0(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
create table user_post_1(
    id bigint(11) not null auto_increment,
    name varchar(100),
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;