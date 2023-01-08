CREATE OR REPLACE VIEW view_filter AS
SELECT a1.id, a1.name, b1.name as color, type_filter
FROM tbl_filter as a1
JOIN tbl_color as b1 ON b1.id = a1.color;
