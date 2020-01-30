create schema sepak_bola;
use sepak_bola;

create table player_position(
	position_id int auto_increment primary key,
    position_name varchar(50)
);

insert into player_position(position_name)
values('GoalKeeper'),
('Deffence'),
('Midfielder'),
('Winger'),
('Striker');

create table player(
	player_id int auto_increment primary key,
    player_name varchar(50),
    back_number varchar(3)
);

insert into player(player_name, back_number)
values('Andi Mataliti', '1'),
('Nolino Tuidich', '2'),
('Dida Sumovich', '4');

create table match_player(
	id_match int auto_increment primary key,
    player int,
    position int,
    
    foreign key (player) references player(player_id),
    foreign key (position) references player_position(position_id)
);

insert into match_player(player, position)
values(1, 1),
(2,2),
(3,5);