--initial insert data
insert into eico_hp14.roles (id, name, CODE)
values (eico_hp14.sq_roles.nextval, 'administrator', 'ADMIN');

insert into eico_hp14.roles (id, name, CODE)
values (eico_hp14.sq_roles.nextval, 'uzivatel', 'USERS');

-- admin => sha256+admin => hash
insert into eico_hp14.users (id, NAME, pass)
    values (eico_hp14.sq_users.nextval, 'admin', 'e2b3678e8af69ade303325a17c7f9059bfcdf054c20cf899279df60afcd783c3');

    insert into eico_hp14.users_roles (ID, ID_USERS, ID_ROLES)
values (eico_hp14.sq_users_roles.nextval,
        (select id from eico_hp14.users where name = 'admin'),
        (select id from eico_hp14.roles where code ='ADMIN'));

insert into eico_hp14.colage (ID, NAME)
values (eico_hp14.sq_collage.nextval, 'NEBELVÍR');

insert into eico_hp14.colage (ID, NAME)
values (eico_hp14.sq_collage.nextval, 'MRZIMOR');

insert into eico_hp14.colage (ID, NAME)
values (eico_hp14.sq_collage.nextval, 'HAVRASPÁR');

insert into eico_hp14.colage (ID, NAME)
values (eico_hp14.sq_collage.nextval, 'ZMIJOZEL');