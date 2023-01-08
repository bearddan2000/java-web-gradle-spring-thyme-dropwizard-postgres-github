CREATE SEQUENCE filter_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 1;

CREATE SEQUENCE color_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 1;

CREATE SEQUENCE type_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 1;

CREATE TABLE tbl_filter (
    "id" integer DEFAULT nextval('filter_id_seq') NOT NULL,
    "name" text NOT NULL,
    "color" integer NOT NULL,
    "type_filter" integer NOT NULL
) WITH (oids = false);

CREATE TABLE tbl_color (
    "id" integer DEFAULT nextval('color_id_seq') NOT NULL,
    "name" text NOT NULL
) WITH (oids = false);

CREATE TABLE tbl_type (
    "id" integer DEFAULT nextval('type_id_seq') NOT NULL,
    "name" text NOT NULL
) WITH (oids = false);
