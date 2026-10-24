-- Reex 1.8.9 数据库 schema（真机导出，user_version=10）

CREATE TABLE "extended_playlist_items" ("id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "playlist_id" INTEGER NOT NULL, "title" TEXT NOT NULL, "group" TEXT NULL, "uri" TEXT NOT NULL, "subtitle" TEXT NULL, "http_header" TEXT NULL, "key" TEXT NOT NULL);

CREATE TABLE "extended_playlists" ("id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "title" TEXT NOT NULL, "options" TEXT NULL);

CREATE TABLE "network_accounts" ("id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "kind" INTEGER NOT NULL, "server" TEXT NOT NULL, "username" TEXT NULL, "password" TEXT NULL, "port" INTEGER NULL, "domain" TEXT NULL, "share" TEXT NULL, "alias" TEXT NULL);

CREATE TABLE "network_directory_favorites" ("id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "network_account_id" INTEGER NOT NULL, "display_name" TEXT NOT NULL, "share" TEXT NULL, "path" TEXT NOT NULL);

CREATE TABLE "playback_histories" ("unique_uri" TEXT NOT NULL, "player_value" TEXT NOT NULL, "platform_value" TEXT NOT NULL, "modified_time" INTEGER NOT NULL, PRIMARY KEY ("unique_uri"));

CREATE TABLE sqlite_sequence(name,seq);
