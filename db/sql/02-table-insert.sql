INSERT INTO "public"."tbl_type" (name)
VALUES
('build'),('lang'),('platform'),('tech');

INSERT INTO tbl_color (name)
VALUES
('aqua'),('burlywood'),('cadetblue'),('darkgrey'),
('khaki'),('orange'),('pink'),('purple'),
('sienna');

INSERT INTO "public"."tbl_filter" (type_filter, color, name)
VALUES
(4, 1,'ansible'),(4, 1,'saltstack'),(4, 1,'chef'),
(2, 3,'java'),(2, 3,'jruby'),(2, 3,'jython'),
(2, 3,'kotlin'),(2, 3,'groovy'),(2, 3,'scala'),
(2, 5,'rust'),(2, 9,'dart'),(2, 5,'c'),(2, 5,'cpp'),
(2, 2,'csharp'),(2, 5, 'perl'),(2, 3,'python'),
(2, 5,'php'),(2, 9,'nodejs'),(2, 9,'javascript'),
(2, 9,'flutter'),(2, 3,'clojure'),(2, 5,'ruby'),
(2, 2,'vbnet'),(4, 8,'bash'),(2, 6,'erlang'),
(2, 6,'elixir'),(2, 6,'haskell'),(2, 3,'golang'),
(2, 4,'julia'),(4, 8,'powershell'),(2, 6,'swift'),
(2, 5,'lua'),(2, 7, 'unclass'),(4, 7,'unclass'),
(1, 7,'unclass'),(1, 3, 'ant'),(1, 1, 'android'),
(1, 1, 'bazel'),(1, 3, 'buck'),(1, 3, 'gradle'),
(1, 3, 'maven'),(1, 3, 'mill'),(1, 1, 'pants'),
(1, 1, 'spa'),(1, 3, 'sbt'),(1, 3, 'bloop'),
(3, 3,'web'),(3, 6,'desktop'),(3, 9,'cli'),
(3, 7,'unclass');
